/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp3player;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author Anhad
 */
public class Mp3Player 
{
    FileInputStream FIS;
    BufferedInputStream BIS;
    
    public Player player;
    
    public long pauseLocation;
    public long songTotalLength;
    public String fileLocation;
    public void stop()
    {
        if(player != null)
        {
            player.close();
            pauseLocation = 0;
            songTotalLength = 0;
           
            
        }
        
    }
    public void pause()
    {
        if(player != null)
        {
            try {
                pauseLocation = FIS.available();
                player.close();
                        } 
            catch (IOException ex) {
            }
        }
    }
    
    public void Resume() 
    {
        try {
            FIS = new FileInputStream(fileLocation);
            BIS = new BufferedInputStream(FIS);
            
            player = new Player(BIS);
            FIS.skip(songTotalLength - pauseLocation);
        
        } 
        catch (FileNotFoundException | JavaLayerException ex)
        {
         
        } catch (IOException ex)
        {
            
        }
        new Thread()
        {
            @Override
            public void run()
            {
                try {
                    player.play();
                    if(player.isComplete() && MP3.count == 1)
                    {
                        play(fileLocation);
                    }
                    if (player.isComplete())
                    {
                          MP3.Display.setText("");
                          MP3.Display1.setText("");
                          MP3.visual.setVisible(false);

                    }
                } 
                catch (JavaLayerException ex) 
                {
                    
                }
            }
        }.start();
        
    }

public void play(String Path) 
    {
        try {
            FIS = new FileInputStream(Path);
            BIS = new BufferedInputStream(FIS);
            
            player = new Player(BIS);
            
            songTotalLength = FIS.available();
            fileLocation = Path + "";
        
        } 
        catch (FileNotFoundException | JavaLayerException ex)
        {
         
        } catch (IOException ex) {
            
        }
        new Thread()
        {
            @Override
            public void run()
            {
                try {
                    player.play();
                    try {
                    player.play();
                    if(player.isComplete() && MP3.count == 1)
                    {
                        play(fileLocation);
                    }
                    if (player.isComplete())
                    {
                          MP3.Display.setText("");
                          MP3.Display1.setText("");
                          MP3.visual.setVisible(false);
                    }
                } 
                catch (JavaLayerException ex) 
                {
                    
                }
                } 
                catch (JavaLayerException ex) 
                {
                    
                }
            }
        }.start();
        
    }
public long getSongTotalLength()
{
    return songTotalLength;
}
public long getPauseLocation()
{
    return pauseLocation;
}

}
