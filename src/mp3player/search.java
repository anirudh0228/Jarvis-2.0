/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mp3player;

import java.awt.Desktop;
import java.awt.TextArea;
import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author anirudh's best
 */
public class search {
    public static boolean filefound;
    public static void find(String x,TextArea b){
        try{
            File a=new File("C:\\");
            String path=a.getAbsolutePath();
            Voice jarvis=new Voice("kevin16");
            Desktop desk=Desktop.getDesktop();
            String filename;
            if(a.isDirectory()){
                File[] fi=a.listFiles();
                int i;
                for(i=0;i<fi.length;i++){
                    if(filefound==true){
                        filename=fi[i].getName();
                       b.append("Jarvis: "+filename);
                        break;
                    }
                        
                }
                desk.open(fi[i]);
                
            }
            else{
                if(a.getName().equalsIgnoreCase(x)||a.getName().toLowerCase().startsWith(x.toLowerCase())||a.getName().toLowerCase().endsWith(x.toLowerCase())){
                    b.append("Jarvis: I got the File Sir ");
                    jarvis.say("I got the file Sir");
                    filefound=true;
                    desk.open(a);
                }
            }
            
            
        }
        catch(Exception e){
            
        }
    }
}
