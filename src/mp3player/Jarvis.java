package mp3player;



import com.sun.awt.AWTUtilities;
import com.sun.speech.freetts.*;
import java.awt.AWTException;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.GraphicsDevice;
import static java.awt.GraphicsDevice.WindowTranslucency.*;
import java.awt.GraphicsEnvironment;
import java.awt.Robot;
import java.awt.Shape;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.geom.RoundRectangle2D;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * frame1.java
 *
 * Created on Sep 30, 2015, 3:43:48 AM
 */

/**
 *
 * @author Class XII
 */


public class Jarvis extends javax.swing.JFrame implements ActionListener{

  
 private static Timer timer;
int timerun=0;



    public void actionPerformed(ActionEvent e) {
     /**  int n=jProgressBar1.getValue();
       if(n<100){
           n++;
           jProgressBar1.setValue(n);
       }else{
           timer.stop();
       }
*/

    }
    

public static void scan(String a,JTextArea d){
    try{
        int length=a.length();
          Class.forName("java.sql.DriverManager");
          Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ques","root","");
          Statement stmt =  (Statement) con.createStatement();
          //String ques="Select question from ques where question='"+name+"';";
          String query="Select question from ques;";
          ResultSet rs=stmt.executeQuery(query);
          if(rs.next()){
              String ques=rs.getString("question");
              int i=0;
          String s=a.substring(i,i+1);
              String x=ques.substring(i,i+1);
              while(i<length){
                  if(s.equals(x)){
                      i++;
                  }else if(i>=length-3){
                    d.append(" ");
  d.append("\t \t \t \t Jarvis: ");
  for(int j=0;j<length;j++){
      String ans="I think you want to ask me"+ques+" Sir";
      String type=ans.substring(j,j+1);
      d.append(type);
      try{
      Thread.sleep(300);
      }catch(Exception e){}
  }
                  }
                  else{
                      rs.next();
                  }
              }

          }
    }catch(Exception e){}


}
public static void progress(JProgressBar a){
    int n=a.getValue();
    if (n <100)
    {

       n= n+2;
        a.setValue(n);
            }else{
        timer.stop();
            }

}
    

public static void getInteger(String a){
    int length=a.length();

}
    public static void probability(String a,String b){

    }
    public static void robot(JLabel b,Robot robot,int i,int j){
        try{
            int x=b.getX();
            int y=b.getY();
            robot=new Robot();
             if(i>x &&j>y&&x>y){
                 
                     while(j>=y){
                         Thread.sleep(200);
                         robot.mouseMove(x, y);
                         x=x+10;
                     
                             y=y+10;
                 }robot.mousePress(InputEvent.BUTTON1_MASK);
             }
             else if(i<=x &&j>=y &&x>y){
                  
                     while(j>=y){
                         Thread.sleep(100);
                         robot.mouseMove(x, y);
                         x=x-20;
                          y=y+10;
                     }
                            
                 }robot.mousePress(InputEvent.BUTTON1_MASK);
             


        }catch(Exception e){}

    }








public static void Open(String b){
           File x=new File(b);
               Desktop desk =Desktop.getDesktop();
               try{
                   desk.open(x);
               }
               catch(Exception e){
               }




       }
public static void type(TextArea jtxt, String a){
  int length=a.length();
  jtxt.append(" ");
  jtxt.setForeground(Color.red);
  jtxt.append("\t \t \t\t Jarvis: ");
  for(int i=0;i<length;i++){
      String x=a.substring(i,i+1);
      jtxt.append(x);
      try{
      Thread.sleep(200);
      }catch(Exception e){}
  }
}
public static void extract(String path){
    File file=new File(path);
    File[] f=file.listFiles();
    for(File x:f){
        if(x==null){return;}
        if(x.isHidden()||!x.canRead())
            continue;
        
        if(x.isDirectory())
            extract(x.getPath());
        else if(x.getName().endsWith("mp3"))
            try{
                Class.forName("java.sql.DriverManager");
                Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/mp3","root","");
                Statement stmt=(Statement)con.createStatement();
                String query="insert into data values('"+x.getPath()+"','"+x.getName()+"');";
                String query1="Select name form data";
                System.out.println();
                        stmt.executeUpdate(query);
                    
                
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        
    }
}


public static void search1(String x){
    Runtime runtime=Runtime.getRuntime();
    try{
        Thread.sleep(500);
        Process process=runtime.exec(x);

    }
    catch(Exception e){

    }

}
    /** Creates new form frame1 */
    public Jarvis() {
        initComponents();
        this.setShape(new RoundRectangle2D.Double(0  , 00, 370, 250, 30, 30));
        
        Voice jarvis=new Voice("kevin16");
        jarvis.say("Systems    online   all    check           at             your                service                  sir");
        jDialog6.setVisible(true);
        jDialog7.setVisible(true);
        jTextField1.setBackground(Color.BLACK);
      int delay = 1000000;
  ActionListener taskPerformer = new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
          int delay=100000;
      int msg=JOptionPane.showConfirmDialog(null, "I am completely exhausted Sir.   \n " +
                            "Can I Sleep Now","Confirm",JOptionPane.YES_NO_OPTION);
                    if(msg==0){
                        type(jTextArea2," Good Bye Sir");
                        try{
                        Thread.sleep(200);
                        }catch(Exception e){}
                       System.exit(0);

      }
                    else{
                     delay=delay-100;
                    }}
  };
  new Timer(delay, taskPerformer).start();


jDialog4.setVisible(false);
       
        jComboBox1.setVisible(false);
        new Thread(){
        public void run(){
            while(timerun==0){
                    Calendar cal=Calendar.getInstance();
                    int hour=cal.get(Calendar.HOUR);
                    int min=cal.get(Calendar.MINUTE);
                    int AM_PM=cal.get(Calendar.AM_PM);
                    String day_night="";
                    if(AM_PM==1){
                        day_night="PM";
                    }else{
                        day_night="AM";
                    }

                    String time=hour + ":" + min + " "+day_night ;
                    jLabel6.setText(time);

                    }}


        }.start();
    }
 public Jarvis(String name) {
        String username = name;
        initComponents();
      
  int delay = 100000;
  ActionListener taskPerformer = new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
          int delay=100000;
      int msg=JOptionPane.showConfirmDialog(null, "I am completely exhausted Sir.   \n " +
                            "Can I Sleep Now","Confirm",JOptionPane.YES_NO_OPTION);
                    if(msg==0){
                        type(jTextArea2," Good Bye Sir");
                        try{
                        Thread.sleep(200);
                        }catch(Exception e){}
                       System.exit(0);

      }
                    else{
                     delay=delay-100;
                    }}
  };
  new Timer(delay, taskPerformer).start();
  

jDialog4.setVisible(false);
      
        jComboBox1.setVisible(false);
        new Thread(){
        public void run(){
            while(timerun==0){
                    Calendar cal=Calendar.getInstance();
                    int hour=cal.get(Calendar.HOUR);
                    int min=cal.get(Calendar.MINUTE);
                    int AM_PM=cal.get(Calendar.AM_PM);
                    String day_night="";
                    if(AM_PM==1){
                        day_night="PM";
                    }else{
                        day_night="AM";
                    }

                    String time=hour + ":" + min + " "+day_night ;
                    jLabel6.setText(time);

                    }}


        }.start();
 }
 
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jDialog4 = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jDialog2 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton7 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jDialog3 = new javax.swing.JDialog();
        jLabel21 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel22 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jDialog5 = new javax.swing.JDialog();
        jTextArea2 = new java.awt.TextArea();
        jDialog6 = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jDialog7 = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();

        jDialog1.setBounds(new java.awt.Rectangle(120, 120, 0, 0));
        jDialog1.setMinimumSize(new java.awt.Dimension(300, 400));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jPanel5.setBackground(new java.awt.Color(0, 102, 153));
        jPanel5.setLayout(null);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Open", "Close", "Run", "Click" }));
        jComboBox1.setOpaque(false);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel5.add(jComboBox1);
        jComboBox1.setBounds(20, 60, 70, 20);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp3player/jar.png"))); // NOI18N
        jLabel18.setText("jLabel18");
        jPanel5.add(jLabel18);
        jLabel18.setBounds(30, 40, 270, 240);

        jLabel8.setBackground(new java.awt.Color(51, 102, 0));
        jLabel8.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("System Operations");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel8);
        jLabel8.setBounds(0, 30, 140, 30);

        jLabel9.setBackground(new java.awt.Color(51, 102, 0));
        jLabel9.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Conversational");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel9MouseReleased(evt);
            }
        });
        jPanel5.add(jLabel9);
        jLabel9.setBounds(0, 0, 120, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp3player/cell_light_hexagon_shadow_15345_602x339 (1).jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel5.add(jLabel2);
        jLabel2.setBounds(0, 0, 340, 300);

        jPanel2.add(jPanel5);
        jPanel5.setBounds(0, 0, 340, 300);

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        jDialog4.setBounds(new java.awt.Rectangle(750, 350, 0, 0));
        jDialog4.setMinimumSize(new java.awt.Dimension(149, 150));
        jDialog4.setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setOpaque(false);
        jPanel3.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 204, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Which one Sir?");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(0, 0, 150, 20);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 0, 51));
        jButton2.setText("Microsoft Publisher");
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(0, 110, 150, 30);

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(51, 0, 51));
        jButton5.setText("Microsoft Access");
        jButton5.setBorder(null);
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5);
        jButton5.setBounds(0, 90, 150, 30);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 0, 51));
        jButton4.setText("Microsoft Excel");
        jButton4.setBorder(null);
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4);
        jButton4.setBounds(0, 70, 150, 30);

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(51, 0, 51));
        jButton6.setText("    Microsoft Powerpoint");
        jButton6.setBorder(null);
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6);
        jButton6.setBounds(0, 50, 150, 30);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 0, 51));
        jButton3.setText("Microsoft Word");
        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(0, 30, 150, 30);

        javax.swing.GroupLayout jDialog4Layout = new javax.swing.GroupLayout(jDialog4.getContentPane());
        jDialog4.getContentPane().setLayout(jDialog4Layout);
        jDialog4Layout.setHorizontalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jDialog4Layout.setVerticalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jDialog2.setMinimumSize(new java.awt.Dimension(200, 200));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 100, 310, 160);

        jButton7.setText("send");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(250, 270, 55, 23);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Type your Answer here");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(10, 80, 300, 20);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp3player/jarvis_sound_scheme_real_jarvis_voice__by_bjayn-d7142vx.png"))); // NOI18N
        jLabel11.setText("jLabel11");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(-10, 0, 790, 470);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp3player/cell_light_hexagon_shadow_15345_602x339 (1).jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 0, 332, 300);

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
        );

        jDialog3.getContentPane().setLayout(null);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Path");
        jDialog3.getContentPane().add(jLabel21);
        jLabel21.setBounds(10, 140, 120, 14);
        jDialog3.getContentPane().add(jTextField2);
        jTextField2.setBounds(10, 110, 340, 20);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane2.setViewportView(jTextArea3);

        jDialog3.getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 160, 340, 100);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Name of app");
        jDialog3.getContentPane().add(jLabel22);
        jLabel22.setBounds(10, 90, 120, 14);

        jButton8.setText("Send");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jDialog3.getContentPane().add(jButton8);
        jButton8.setBounds(280, 270, 70, 23);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp3player/jarvis_sound_scheme_real_jarvis_voice__by_bjayn-d7142vx.png"))); // NOI18N
        jLabel20.setText("jLabel11");
        jDialog3.getContentPane().add(jLabel20);
        jLabel20.setBounds(-10, -80, 790, 470);

        jTextArea2.setBackground(new java.awt.Color(46, 46, 46));
        jTextArea2.setColumns(20);
        jTextArea2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextArea2.setEditable(false);
        jTextArea2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(69, 228, 76));
        jTextArea2.setRows(5);

        javax.swing.GroupLayout jDialog5Layout = new javax.swing.GroupLayout(jDialog5.getContentPane());
        jDialog5.getContentPane().setLayout(jDialog5Layout);
        jDialog5Layout.setHorizontalGroup(
            jDialog5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
            .addGroup(jDialog5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDialog5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jTextArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jDialog5Layout.setVerticalGroup(
            jDialog5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(jDialog5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDialog5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jTextArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jDialog6.setAlwaysOnTop(true);
        jDialog6.setBounds(new java.awt.Rectangle(1100, 0, 0, 0));
        jDialog6.setFocusable(false);
        jDialog6.setMinimumSize(new java.awt.Dimension(280, 230));
        jDialog6.setUndecorated(true);
        jDialog6.setOpacity(0.7F);
        jDialog6.setResizable(false);
        jDialog6.getContentPane().setLayout(null);

        jLabel6.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jDialog6.getContentPane().add(jLabel6);
        jLabel6.setBounds(190, 10, 80, 20);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jDialog6.getContentPane().add(jLabel16);
        jLabel16.setBounds(110, 40, 160, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp3player/jar.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jDialog6.getContentPane().add(jLabel1);
        jLabel1.setBounds(4, -6, 260, 240);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 228, Short.MAX_VALUE)
        );

        jDialog6.getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 280, 230);

        jDialog7.setBounds(new java.awt.Rectangle(1230, 780, 0, 0));
        jDialog7.setMinimumSize(new java.awt.Dimension(15, 15));
        jDialog7.setUndecorated(true);
        jDialog7.setResizable(false);
        jDialog7.getContentPane().setLayout(null);

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp3player/circle_filled.png"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 131, Short.MAX_VALUE))
        );

        jDialog7.getContentPane().add(jPanel7);
        jPanel7.setBounds(0, 0, 40, 170);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(1000, 600, 20, 20));
        setMinimumSize(new java.awt.Dimension(380, 80));
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jTextField1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Type your query here....");
        jTextField1.setBorder(null);
        jTextField1.setOpaque(false);
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(20, 20, 370, 30);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setPreferredSize(new java.awt.Dimension(110, 22));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel4MouseReleased(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(470, 0, 30, 22);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp3player/Text Field.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(-10, 10, 460, 46);

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 138, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel6);
        jPanel6.setBounds(0, 0, 500, 140);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField1.setForeground(Color.WHITE);
}//GEN-LAST:event_jTextField1MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
if(evt.getKeyCode()==KeyEvent.VK_ENTER){
    Voice jarvis=new Voice("kevin16");
        String name=jTextField1.getText();
         int no= name.length();
         String app=jTextField1.getText().substring(5);
            String app1=app.toUpperCase();
        jTextArea2.append("\n User: "+name+"\n");
        String command=name.toUpperCase();
        if(command.contains("OPEN")){

            
            if(app1.contains("COMPUTER")){
                jarvis.say("Here we go");
                jTextArea2.append("Jarvis: Here we go");
                
                try{

                    Thread.sleep(200);
                    Open("c:/");
                } catch(Exception e){
                    JOptionPane.showMessageDialog(this, e);}

            } else if(app1.contains("INTERNET EXPLORER")||app1.contains("SEARCH")||app1.contains("INTERNET")){
                jarvis.say("Sure Sir");
                jTextArea2.append("Jarvis: sure Sir");

                try{
                    Thread.sleep(200);
                    Open("C:/Program Files/Internet Explorer/iexplore.exe");
                } catch(Exception e){}
            }

            else if(app1.contains("CALCULATOR")){
                jarvis.say("here we go");
                jTextArea2.append("Jarvis: Here we go");

                try{
                    Thread.sleep(200);
                    search1("calc.exe");

                } catch(Exception e){}
            } else if(app1.contains("MICROSOFT OFFICE")){
               
               try{
                    Thread.sleep(200);
                    jDialog4.setVisible(true);

                } catch(Exception e){} 
                

            } else if(app1.contains("PAINT")){
               jarvis.say("here we go");
                jTextArea2.append("Jarvis: Here we go");
                try{
                    Thread.sleep(200);
                    Open("C:/Windows/system32/mspaint.exe");
                } catch(Exception e){
                    JOptionPane.showMessageDialog(this, e);}
            }
            else{
                Desktop desk=Desktop.getDesktop();
                FilenameFilter filter=new FilenameFilter(){
                    public boolean accept(File d,String nam){
                        String lowercase=nam.toLowerCase();
                        if(lowercase.equalsIgnoreCase(app)){
                            return true;
                        }else{
                            return false;
                        }
                        
                    }
                };
                FileVisitor<Path> fv=new SimpleFileVisitor<Path>(){
                    @Override
                    public FileVisitResult visitFile(Path file,BasicFileAttributes a)
                            throws IOException{
                        System.out.println(file);
                        return FileVisitResult.CONTINUE;
                    }
                }; 
            }
        } else if(command.contains("PLAY")){
                try{
                    Class.forName("java.sql.DriverManager");
                    Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/mp3","root","");
                    Statement stmt=(Statement)con.createStatement();
                    String query="Select path from data where name like '%"+app+"%';";
                    ResultSet rs=stmt.executeQuery(query);
                    if(rs.next()){
                        String path=rs.getString("path");
                    Mp3Player a=new Mp3Player();
                    new MP3().MC.play(path);
                    
                    }
                    else{
                        jarvis.say("File not found Sir");
                    }
                }catch(Exception e){}
                
                
            } else if(command.contains("REVERSE")){
                int num1=Integer.parseInt(name.substring(11));
                int revno=0;
                int temp;
                temp=num1;
                while(temp>0){
                    revno=(revno*10)+(temp%10);
                    temp=temp/10;
                }
                if(revno==num1){
                    jarvis.say("the reverse number is "+revno+" also its a palandrome number");
                    jTextArea2.append("Jarvis: the reverse no is "+revno+" sir. its a palandrome number ");
                }else{
                    jarvis.say("Sir the reverse number is "+revno);
                    jTextArea2.append("Jarvis: The reverse no is "+revno+ " Sir");
                }}
            else if(command.contains("TIME")){
                    DateFormat dateFormat=new SimpleDateFormat("HH:mm:ss");
                    Calendar cal=Calendar.getInstance();
                    String x=  "The time is "+dateFormat.format(cal.getTime())+" Sir";
                    jarvis.say("the time is "+x);
                    jTextArea2.append("Jarvis : "+x);

                } else if(command.contains("+")){
                    
                    int loc1=name.indexOf("+");
                    double no1=Integer.parseInt(name.substring(0,loc1));
                     double no2=Integer.parseInt(name.substring(loc1+1,no));
                    double result=no1+no2;
                    jarvis.say("the Sum is "+Double.toString(result));
                    jTextArea2.append("Jarvis: "+Double.toString(result));
                }
                    else if(command.contains("*")){
                    int loc2=name.indexOf("*");
                   double no1=Integer.parseInt(name.substring(0,loc2));
                   double no2=Integer.parseInt(name.substring(loc2+1,no));
                   double result=no1*no2;
                   jarvis.say("the product is "+Double.toString(result));
                    jTextArea2.append("Jarvis: "+Double.toString(result));
                            }
                    else if(command.contains("/")){
                    int loc2=name.indexOf("/");
                   double no1=Integer.parseInt(name.substring(0,loc2));
                   double no2=Integer.parseInt(name.substring(loc2+1,no));
                   double result=no1/no2;
                   jarvis.say("we get "+Double.toString(result));
                    jTextArea2.append("Jarvis: "+Double.toString(result));
                            }
                    else if(command.contains("-")){
                    int loc2=name.indexOf("-");
                   double no1=Integer.parseInt(name.substring(0,loc2));
                   double no2=Integer.parseInt(name.substring(loc2+1,no));
                   double result=no1-no2;
                   jarvis.say("on substraction we get"+Double.toString(result));
                    jTextArea2.append("Jarvis: "+Double.toString(result));
                            }
                    

                else if(command.contains("SHUTDOWN PC")){
                    Runtime runtime=Runtime.getRuntime();
                    jarvis.say("Sir this will shutdown the pc. your dta me lost");
                    int msg=JOptionPane.showConfirmDialog(this,"Sir this will Shutdown the pc.Your data may lost","Confirm",JOptionPane.YES_NO_OPTION);
                    if(msg==0){
                        try{
                            Thread.sleep(200);
                            jarvis.say("good bye Sir");
                            Process proc=runtime.exec("shutdown -s -t 0");
                            System.exit(0);
                        }catch(Exception e){}
                    }
                } else if(command.contains("CLICK")){

                     jarvis.say("Sure Sir");
                    jTextArea2.append("jarvis: Sure Sir");
                    String part=command.substring(5).toLowerCase();
                    if(part.contains("start")){
                        Robot robot = null;
                        try {
                            robot = new Robot();
                        } catch (AWTException ex) {
                            Logger.getLogger(Jarvis.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        

                    }
                    }else if(command.contains("SHOW DESKTOP")){
                        jarvis.say("Wait Sir");
                        jTextArea2.append("jarvis: Wait Sir");
                        Robot r = null;
                        try {
                            r = new Robot();
                        } catch (AWTException ex) {
                            Logger.getLogger(Jarvis.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                    }
                    else if(command.contains("HISTORY")){
                        jDialog5.setVisible(true);
                    }
                    
                    

                    else {
            try{
                Class.forName("java.sql.DriverManager");
                Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ques","root","");
                Statement stmt =  (Statement) con.createStatement();
                //String ques="Select question from ques where question='"+name+"';";
                String query="Select answer from ques where question='"+name+"';";
                ResultSet rs=stmt.executeQuery(query);
                //ResultSet rs1=stmt.executeQuery(query);
                //if(rs1.next()){
                if(rs.next()){

                    String answer=rs.getString("answer");
                    jarvis.say(answer);
                    jTextArea2.append("Jarvis: "+answer);

                }

                else{
                    jarvis.say("I did'nt get the Command, Sir! But you can improve me by teaching this. Want to");
                    int msg=JOptionPane.showConfirmDialog(this, "I did'nt get the Command, Sir! \n " +
                            "But you can improve me by teaching this. Want to","Confirm",JOptionPane.YES_NO_OPTION);
                    if(msg==0){
                        jDialog1.setVisible(true);
                    }
                }

            } catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());}


                    }
}

    }//GEN-LAST:event_jTextField1KeyPressed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here
        type(jTextArea2,"Sure Sir");
        Open("C:/ProgramData/Microsoft/Windows/Start Menu/Programs/Microsoft Office/Microsoft Office PowerPoint 2007.lnk");
        jDialog4.setVisible(false);
}//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        type(jTextArea2,"Sure Sir");
        Open("C:/ProgramData/Microsoft/Windows/Start Menu/Programs/Microsoft Office/Microsoft Office Access 2007.lnk");
        jDialog4.setVisible(false);
}//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        type(jTextArea2,"Sure Sir");
        Open("C:/ProgramData/Microsoft/Windows/Start Menu/Programs/Microsoft Office/Microsoft Office Excel 2007.lnk");
jDialog4.setVisible(false);


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        // TODO add your handling code here:
        type(jTextArea2,"Sure Sir");
        Open("C:/ProgramData/Microsoft/Windows/Start Menu/Programs/Microsoft Office/Microsoft Office Word 2007.lnk");
jDialog4.setVisible(false);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        type(jTextArea2,"Sure Sir");
        Open("C:/ProgramData/Microsoft/Windows/Start Menu/Programs/Microsoft Office/Microsoft Office Publisher 2007.lnk");
        jDialog4.setVisible(false);




    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        
        
         DateFormat dateFormat=new SimpleDateFormat("HH:mm");
        DateFormat a=new SimpleDateFormat("hh:mm");
                    Calendar cal=Calendar.getInstance();
                    String x= dateFormat.format(cal.getTime());
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        if(jLabel6.getText().contains("AM")){
          jLabel16.setText("Good Morning");
 
        }
        else if(jLabel6.getText().contains("PM")){
            jLabel16.setText("Good Evening");
            

        }
    }//GEN-LAST:event_formWindowOpened

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        jDialog1.setVisible(false);
jDialog2.setVisible(true);
     
    

           
        
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        jDialog2.setVisible(false);
        jDialog3.setVisible(true);
        
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jLabel9MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseReleased
        // TODO add your handling code here:
        jDialog2.setVisible(true);
    }//GEN-LAST:event_jLabel9MouseReleased

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        String name=jTextField1.getText();
        try{

            Class.forName("java.sql.DriverManager");
            Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/ques","root","");
            Statement stmt=con.createStatement();
            String query="Select answer from ques where question='"+name+"';";
            ResultSet rs=stmt.executeQuery(query);
            //String ans= JOptionPane.showInputDialog(this,"Write the answer here",JOptionPane.OK_OPTION);
            String ans=jTextArea1.getText();
            
                
            String add="Insert into ques values('"+name+"','"+ans+"');";
            stmt.executeUpdate(add);
            jDialog2.setVisible(false);
            JOptionPane.showMessageDialog(this, "data Stored for future");
            
        } catch(Exception e){}
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
         String name=jTextField1.getText();
         String path=jTextArea3.getText();
         String app=jTextField2.getText();
        try{

            Class.forName("java.sql.DriverManager");
            Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/jarvis","root","root");
            Statement stmt=con.createStatement();
            String add="Insert into ques values('"+name+"','"+path+"');";
            stmt.executeUpdate(add);
            jDialog3.setVisible(false);
            JOptionPane.showMessageDialog(this, "I will remember it");
            
        } catch(Exception e){}
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jLabel4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseReleased
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseReleased

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jarvis().setVisible(true);
               
                extract("E:\\");
                extract("D:\\");
                extract("F:\\");
                extract("I:\\");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JDialog jDialog4;
    private javax.swing.JDialog jDialog5;
    private javax.swing.JDialog jDialog6;
    private javax.swing.JDialog jDialog7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private java.awt.TextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    
}
