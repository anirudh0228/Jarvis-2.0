package mp3player;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anhad
 */

import com.teknikindustries.yahooweather.WeatherDisplay;
import com.teknikindustries.yahooweather.WeatherDoc;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
public class Weather_report extends javax.swing.JFrame {

    /**
     * Creates new form Weather_report
     */
    int TimeRun = 0;
    ImageIcon clear = new ImageIcon(getClass().getResource("/mp3player/clear.png"));


    public Weather_report() {
        initComponents();
        
        
        
        
        
        
        new Thread()
        {
            
            public void run()
        {
            
            while (TimeRun == 0) {
                Calendar cal = new GregorianCalendar();
                int hour = cal.get(Calendar.HOUR);
                int min = cal.get(Calendar.MINUTE);
                int sec = cal.get(Calendar.SECOND);
                int AM_PM = cal.get(Calendar.AM_PM);
                 String day_night = "";
                if (AM_PM == 1) {
                    day_night = "PM";
                    
                }
        else{
                     day_night = "AM";
                }
                    
                    
                String time = hour +":"+ min +":"+ sec  +"  "+  day_night;
                
                Time.setText(time);
            }
        }
        }.start(); 
        
        getWeather();
        
 
        
    }
    
    Weather_report(String name) {
        String username = name;
        initComponents();
        guest.setText(username); 
    guest.setVisible(false);
    new Thread()
        {
            
            public void run()
        {
            
            while (TimeRun == 0) {
                Calendar cal = new GregorianCalendar();
                int hour = cal.get(Calendar.HOUR);
                int min = cal.get(Calendar.MINUTE);
                int sec = cal.get(Calendar.SECOND);
                int AM_PM = cal.get(Calendar.AM_PM);
                 String day_night = "";
                if (AM_PM == 1) {
                    day_night = "PM";
                    
                }
        else{
                     day_night = "AM";
                }
                    
                    
                String time = hour +":"+ min +":"+ sec  +"  "+  day_night;
                
                Time.setText(time);
            }
        }
        }.start(); 
        
        getWeather();
        
    }

    private void getWeather()
    {
        WeatherDoc doc = new WeatherDoc("2295401", "c");
        WeatherDisplay dis = new WeatherDisplay();
        
        Temp.setText(dis.getTemperature() +"\u02DA "+ dis.getTemperatureUnit());
        Location.setText(dis.getCity()+", "+ dis.getCountry());
        Pressure.setText("Pressure : "+dis.getPressure()+" "+ dis.getPressureUnit());
        Sunrise.setText("Sunrise : "+dis.getSunrise());
        Sunset.setText("Sunset : "+dis.getSunset());
        Humidity.setText("Humidity : "+dis.getHumidity() );
        Visibility.setText("Visibility : "+dis.getVisibility());
        Chill.setText("Chill : "+dis.getWindChill());
        Direction.setText("Direction : "+dis.getWindDirection()+"\u02DA ");
        speed.setText("Speed : "+dis.getWindSpeed()+" "+ dis.getDistanceUnit());
        Condition.setText(dis.getCondition());
        
    
    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        guest = new javax.swing.JLabel();
        Time = new javax.swing.JLabel();
        Sunset = new javax.swing.JLabel();
        Temp = new javax.swing.JLabel();
        Location = new javax.swing.JLabel();
        Pressure = new javax.swing.JLabel();
        Sunrise = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Exitb = new javax.swing.JLabel();
        Humidity = new javax.swing.JLabel();
        Visibility = new javax.swing.JLabel();
        Chill = new javax.swing.JLabel();
        Direction = new javax.swing.JLabel();
        speed = new javax.swing.JLabel();
        Condition = new javax.swing.JLabel();
        Atmosphere = new javax.swing.JLabel();
        Wind = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        Exitbg = new javax.swing.JLabel();
        Back = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 51));
        setBounds(new java.awt.Rectangle(420, 100, 0, 0));
        setMinimumSize(new java.awt.Dimension(460, 480));
        setUndecorated(true);
        getContentPane().setLayout(null);

        guest.setForeground(new java.awt.Color(255, 255, 255));
        guest.setText("Guest");
        getContentPane().add(guest);
        guest.setBounds(400, 30, 28, 14);

        Time.setFont(new java.awt.Font("DigifaceWide", 0, 38)); // NOI18N
        Time.setForeground(new java.awt.Color(51, 102, 255));
        Time.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Time.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(Time);
        Time.setBounds(130, 120, 320, 80);

        Sunset.setFont(new java.awt.Font("Shonar Bangla", 1, 18)); // NOI18N
        Sunset.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Sunset);
        Sunset.setBounds(10, 220, 150, 40);

        Temp.setFont(new java.awt.Font("Shonar Bangla", 1, 36)); // NOI18N
        Temp.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Temp);
        Temp.setBounds(300, 210, 100, 40);

        Location.setFont(new java.awt.Font("Shonar Bangla", 1, 18)); // NOI18N
        Location.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Location);
        Location.setBounds(10, 160, 150, 29);

        Pressure.setFont(new java.awt.Font("Shonar Bangla", 1, 18)); // NOI18N
        Pressure.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Pressure);
        Pressure.setBounds(180, 340, 150, 29);

        Sunrise.setFont(new java.awt.Font("Shonar Bangla", 1, 18)); // NOI18N
        Sunrise.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Sunrise);
        Sunrise.setBounds(10, 190, 150, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp3player/mini.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel2MouseReleased(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(410, 0, 30, 20);

        Exitb.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Exitb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp3player/mini.png"))); // NOI18N
        Exitb.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Exitb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ExitbMouseReleased(evt);
            }
        });
        getContentPane().add(Exitb);
        Exitb.setBounds(430, 0, 30, 20);

        Humidity.setFont(new java.awt.Font("Shonar Bangla", 1, 18)); // NOI18N
        Humidity.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Humidity);
        Humidity.setBounds(180, 370, 150, 30);

        Visibility.setFont(new java.awt.Font("Shonar Bangla", 1, 18)); // NOI18N
        Visibility.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Visibility);
        Visibility.setBounds(180, 400, 150, 30);

        Chill.setFont(new java.awt.Font("Shonar Bangla", 1, 18)); // NOI18N
        Chill.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Chill);
        Chill.setBounds(10, 340, 150, 30);

        Direction.setFont(new java.awt.Font("Shonar Bangla", 1, 18)); // NOI18N
        Direction.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Direction);
        Direction.setBounds(10, 370, 150, 30);

        speed.setFont(new java.awt.Font("Shonar Bangla", 1, 18)); // NOI18N
        speed.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(speed);
        speed.setBounds(10, 400, 150, 30);

        Condition.setFont(new java.awt.Font("Shonar Bangla", 1, 18)); // NOI18N
        Condition.setForeground(new java.awt.Color(255, 255, 255));
        Condition.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Condition);
        Condition.setBounds(270, 250, 150, 30);

        Atmosphere.setFont(new java.awt.Font("Shonar Bangla", 1, 18)); // NOI18N
        Atmosphere.setForeground(new java.awt.Color(51, 102, 255));
        Atmosphere.setText("Atmosphere :");
        getContentPane().add(Atmosphere);
        Atmosphere.setBounds(180, 300, 130, 25);

        Wind.setFont(new java.awt.Font("Shonar Bangla", 1, 18)); // NOI18N
        Wind.setForeground(new java.awt.Color(51, 102, 255));
        Wind.setText("Wind :");
        getContentPane().add(Wind);
        Wind.setBounds(10, 300, 60, 25);

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp3player/weather4_1.png"))); // NOI18N
        Logo.setText("jLabel15");
        getContentPane().add(Logo);
        Logo.setBounds(390, 50, 60, 50);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp3player/logo_1.png"))); // NOI18N
        getContentPane().add(logo);
        logo.setBounds(0, 20, 120, 110);

        Name.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp3player/capture_1.png"))); // NOI18N
        getContentPane().add(Name);
        Name.setBounds(110, 60, 160, 40);

        Exitbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp3player/exitsmall.png"))); // NOI18N
        getContentPane().add(Exitbg);
        Exitbg.setBounds(0, 0, 458, 20);

        Back.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Back.setForeground(new java.awt.Color(51, 153, 255));
        Back.setText("<-- Back");
        Back.setToolTipText("");
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BackMouseReleased(evt);
            }
        });
        getContentPane().add(Back);
        Back.setBounds(390, 100, 50, 20);

        Background.setBackground(new java.awt.Color(0, 0, 0));
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp3player/5F02328C8.jpg"))); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(0, 0, 460, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseReleased
        String user = guest.getText();
        this.dispose();
        new Home(user).setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_BackMouseReleased

    private void jLabel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseReleased
        this.setState(ICONIFIED);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseReleased

    private void ExitbMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitbMouseReleased
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_ExitbMouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Weather_report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Weather_report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Weather_report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Weather_report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Weather_report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Atmosphere;
    private javax.swing.JLabel Back;
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Chill;
    private javax.swing.JLabel Condition;
    private javax.swing.JLabel Direction;
    private javax.swing.JLabel Exitb;
    private javax.swing.JLabel Exitbg;
    private javax.swing.JLabel Humidity;
    private javax.swing.JLabel Location;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Pressure;
    private javax.swing.JLabel Sunrise;
    private javax.swing.JLabel Sunset;
    private javax.swing.JLabel Temp;
    private javax.swing.JLabel Time;
    private javax.swing.JLabel Visibility;
    private javax.swing.JLabel Wind;
    private javax.swing.JLabel guest;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel speed;
    // End of variables declaration//GEN-END:variables
}
