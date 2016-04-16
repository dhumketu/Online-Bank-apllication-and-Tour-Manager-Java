/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheGothamCityBank;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.accessibility.Accessible;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;
import javax.swing.ImageIcon;



/**
 *
 * @author yaman
 */

public class tour_manager extends javax.swing.JFrame {

    /**
     * Creates new form tour_manager
     */
    Fileio obj = new Fileio();
    public tour_manager() {
        initComponents();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField23 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jComboBox55 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBounds(new java.awt.Rectangle(0, 0, 720, 480));
        setLocation(new java.awt.Point(150, 70));
        setMinimumSize(new java.awt.Dimension(820, 580));
        getContentPane().setLayout(null);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(1, 1, 1));
        jTextField1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(251, 251, 251));
        jTextField1.setText("              The Tour Guides Of Gotham City");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(70, 10, 597, 67);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TheGothamCityBank/index.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 10, 62, 67);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText(" Tour From  : ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 100, 140, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("Top Cities  : ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 140, 130, 26);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 0", "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setSelectedIndex(1);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(190, 140, 101, 26);

        jLabel5.setText("map");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(340, 450, 210, 190);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 153));
        jLabel6.setText(" Tour To  :  ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(410, 100, 130, 28);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 102));
        jLabel7.setText(" Top Cities : ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(400, 140, 130, 26);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 0", "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.setSelectedIndex(1);
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(530, 140, 101, 30);

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(10, 410, 320, 280);

        jTextArea4.setEditable(false);
        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(570, 210, 200, 270);

        jTextArea5.setEditable(false);
        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jScrollPane5.setViewportView(jTextArea5);

        getContentPane().add(jScrollPane5);
        jScrollPane5.setBounds(10, 210, 310, 190);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USA", "UK", "India", "Australia", "Europe", "Japan" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox3);
        jComboBox3.setBounds(190, 100, 100, 27);

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USA", "UK", "India", "Australia", "Europe", "Japan" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox4);
        jComboBox4.setBounds(520, 100, 100, 27);

        jTextField2.setEditable(false);
        jTextField2.setText("$00000\n");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(330, 110, 70, 27);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(330, 370, 72, 29);

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(340, 410, 72, 29);

        jTextField23.setEditable(false);
        jTextField23.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTextField23.setText("Cuisine Details");
        getContentPane().add(jTextField23);
        jTextField23.setBounds(450, 250, 116, 25);

        jTextField25.setEditable(false);
        jTextField25.setText("US English");
        jTextField25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField25ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField25);
        jTextField25.setBounds(330, 250, 81, 27);

        jTextField24.setEditable(false);
        jTextField24.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTextField24.setText("Language Spoken:");
        getContentPane().add(jTextField24);
        jTextField24.setBounds(320, 220, 143, 25);

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(430, 280, 130, 110);

        jTextField19.setEditable(false);
        jTextField19.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTextField19.setText("Distance Calculator");
        getContentPane().add(jTextField19);
        jTextField19.setBounds(130, 170, 148, 25);

        jTextField20.setEditable(false);
        jTextField20.setText("0000000 km");
        jTextField20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField20ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField20);
        jTextField20.setBounds(300, 170, 90, 27);

        jTextField26.setEditable(false);
        jTextField26.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTextField26.setText("Interesting Places");
        getContentPane().add(jTextField26);
        jTextField26.setBounds(650, 40, 139, 25);

        jComboBox55.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mt. Rushmore", "Statue Of Liberty", "City of Hollywood", "City Of Las Vegas" }));
        jComboBox55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox55ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox55);
        jComboBox55.setBounds(620, 70, 159, 27);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TheGothamCityBank/0_0.jpg"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(640, 80, 95, 135);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed
        String []names = new String[20];
        String []iata = new String[20];
        double []latitude = new double[20];
        double []longitude = new double[20];
        String []name = new String[20];
        String []iatas = new String[20];
        double []latitudes = new double[20];
        double []longitudes = new double[20];
        
    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        String cntry = (String) jComboBox4.getSelectedItem();
        int ch1 = jComboBox3.getSelectedIndex(),ch2=jComboBox4.getSelectedIndex();
        double exchange = obj.mat[ch1][ch2];
        
        String cty="";
        String city = (String)jComboBox2.getSelectedItem();
        for(String temp:city.split(" "))
        {
            cty = cty + temp; 
        }
        if(cty=="")cty=city;
        System.out.println(city + iatas[jComboBox1.getSelectedIndex()]+iata[jComboBox2.getSelectedIndex()]);
        try {
            Process p = new ProcessBuilder("./java_shell_script.sh",cntry,city,iatas[jComboBox1.getSelectedIndex()],iata[jComboBox2.getSelectedIndex()]).start();
        } catch (IOException ex) {
            Logger.getLogger(tour_manager.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            TimeUnit.SECONDS.sleep(50);
            BufferedReader weather_file = new BufferedReader(new FileReader("weather.txt"));
            String line="",txt="";
            while((line = weather_file.readLine())!=null)
            {
                txt=txt+"\n"+line;
            }
            jTextArea5.setText(txt);
            txt="";
            BufferedReader dist_file = new BufferedReader(new FileReader("price.txt"));
            while((line = dist_file.readLine())!=null)
            {
                txt=txt+line;
            }
            //exchange = exchange * Double.parseDouble(txt.substring(3));
            String symbol ="";
            ch1 = jComboBox3.getSelectedIndex();
            if(ch1==0 || ch1==3 || ch1==4)symbol = "$ ";
            else if(ch1==1)symbol = "GBP ";
            else if(ch1==2)symbol = "INR ";
            else symbol = "Yen ";
                    
            jTextField2.setText(symbol+txt+"");
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(tour_manager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(tour_manager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(tour_manager.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            double lat = latitude[jComboBox2.getSelectedIndex()];
            double lon = longitude[jComboBox2.getSelectedIndex()];
            System.out.print(lat + "  "+lon);
            String imageUrl = "https://maps.googleapis.com/maps/api/staticmap?center="+ lat+ ","+ lon+ "&zoom=11&size=612x612&scale=2&maptype=roadmap";
            String destinationFile = "11image.jpg";
            // read the map image from Google
            // then save it to a local file: image.jpg
            //
            URL url = new URL(imageUrl);
            InputStream is = url.openStream();
            OutputStream os = new FileOutputStream(destinationFile);
            byte[] b = new byte[2048];
            int length;
            while ((length = is.read(b)) != -1) {
            os.write(b, 0, length);
            }
            is.close();
            os.close();
            }       catch (MalformedURLException ex) {
                        System.out.println("Hello World malformed Url 1");
                    } catch (java.io.IOException ex) {
                        System.out.println("Hello World malformed Url 2");
                    }
            // create a GUI component that loads the image: image.jpg
    
    ImageIcon imageIcon = new ImageIcon((new ImageIcon("11image.jpg")).getImage().getScaledInstance(630, 600,java.awt.Image.SCALE_SMOOTH));
    jLabel5.setIcon(imageIcon);
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
        int i=0;
        String city = (String) jComboBox3.getSelectedItem();
        FileReader in;
        try {
            in = new FileReader(city);
            BufferedReader br = new BufferedReader(in);
            String line;
            try {
                while((line = br.readLine())!=null){
                    i=i+1;
                    StringTokenizer st = new StringTokenizer(line,"\t");
                    name[i] = (String) st.nextElement();
                    iatas[i] = (String) st.nextElement();
                    latitudes[i] = Double.parseDouble((String) st.nextElement());
                    longitudes[i] = Double.parseDouble((String) st.nextElement());
                }
            } catch (IOException ex) {
                Logger.getLogger(tour_manager.class.getName()).log(Level.SEVERE, null, ex);
            }
            //for(int j=0;j<=i;j++)
            //System.out.println(name[j]+" "+iatas[j]);
            DefaultComboBoxModel model = new DefaultComboBoxModel( name );
            jComboBox1.setModel( model );
            in.close();
        }catch (FileNotFoundException ex) {
            Logger.getLogger(tour_manager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(tour_manager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
        
        obj.read();
        int i=0,j=0,ch2 = jComboBox4.getSelectedIndex(),ch1 = jComboBox3.getSelectedIndex();
        jLabel8.setIcon(new ImageIcon("./src/TheGothamCityBank/"+ch2+"_"+"0"+".jpg"));
        Scanner scc = null;
        try {
            scc = new Scanner(new File("arr.txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TheGothamCityBank.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(i=0;i<ch2;i++)
        {    for(j=0;j<4;j++)
            {   String temp=scc.nextLine();
                //System.out.println(temp);
            }
        }
        String []arr=new String[4];
        for(j=0;j<4;j++)
        arr[j]=scc.nextLine();
        DefaultComboBoxModel model = new DefaultComboBoxModel(arr);
        jComboBox55.setModel( model );
        scc.close();
        
        jTextField20.setText(obj.mat1[ch1][ch2]+"");
        if(ch2==0)
        {
            jTextField25.setText("US English");
            jTextArea2.setText("Lobster Newberg\nWaldorf salad\nVichyssoise\nEggs benedict\nNew York strip steak");
        }
        if(ch2==1)
        {
            jTextField25.setText("British English");
            jTextArea2.setText("Kippers\nBeef Wellington\nKedegree");
        }
        if(ch2==2)
        {
            jTextField25.setText("Hindi");
            jTextArea2.setText("Idli-Sambhar\nDal Bhat\nLitti\nRajma Chwal");
        }
        if(ch2==3)
        {
            jTextField25.setText("Aus. English");
            jTextArea2.setText("Hamburger & beetroot\nChicken curry pie\nChicken and corn soup");
        }
        if(ch2==4)
        {
            jTextField25.setText("Germanic");
            jTextArea2.setText("Italian Pasta\nFrench Bread\nGrilled STeak");
        }
        if(ch2==5)
        {
            jTextField25.setText("Japanese");
            jTextArea2.setText("Sushi\nYakiniku\nYakizakana");
        }
        i=0;
        String city = (String) jComboBox4.getSelectedItem();
        
        try {
            Process p = new ProcessBuilder("./news_shell.sh",city).start();
        } catch (IOException ex) {
            Logger.getLogger(tour_manager.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException ex) {
            Logger.getLogger(tour_manager.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        try {
            
            FileReader in = new FileReader(city);
            FileReader in2 = new FileReader(city+"pre");
            BufferedReader br = new BufferedReader(in);
            BufferedReader br2 = new BufferedReader(in2);
            String line,txtarea="";
            
            String txt="";
            BufferedReader news_file = new BufferedReader(new FileReader("news.txt"));
            while((line = news_file.readLine())!=null)
            {
                txt=txt+"\n"+line;
            }
            jTextArea3.setText(txt);
            
            
            try {
                while((line = br2.readLine())!=null){
                    txtarea = txtarea + line+"\n";
                }
                jTextArea4.setText(txtarea);
                while((line = br.readLine())!=null){
                    i=i+1;
                    StringTokenizer st = new StringTokenizer(line,"\t");
                    names[i] = (String) st.nextElement();
                    iata[i] = (String) st.nextElement();
                    latitude[i] = Double.parseDouble((String) st.nextElement());
                    longitude[i] = Double.parseDouble((String) st.nextElement());
                }
            } catch (IOException ex) {
                Logger.getLogger(tour_manager.class.getName()).log(Level.SEVERE, null, ex);
            }
            model = new DefaultComboBoxModel( names );
            jComboBox2.setModel( model );
            in.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(tour_manager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(tour_manager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            Process p = new ProcessBuilder("./say_weather_shell.sh").start();
        } catch (IOException ex) {
            Logger.getLogger(tour_manager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         try {
            Process p = new ProcessBuilder("./say_news_shell.sh").start();
        } catch (IOException ex) {
            Logger.getLogger(tour_manager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField25ActionPerformed

    private void jTextField20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField20ActionPerformed

    private void jComboBox55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox55ActionPerformed
        int ch=jComboBox55.getSelectedIndex();
        
        int ch1=jComboBox4.getSelectedIndex();
        jLabel8.setIcon(new ImageIcon("./src/TheGothamCityBank/"+ch1+"_"+ch+".jpg"));
        
   
    }//GEN-LAST:event_jComboBox55ActionPerformed

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
            java.util.logging.Logger.getLogger(tour_manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tour_manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tour_manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tour_manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tour_manager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox55;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    // End of variables declaration//GEN-END:variables
}