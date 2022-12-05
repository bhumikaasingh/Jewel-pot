package View;


import Controller.ProfileController;
//import com.mysql.cj.xdevapi.Statement;
import com.sun.jdi.connect.spi.Connection;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.*;
//import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.profilemod;
import database.DbConnection;
import java.sql.*;

public class profile extends javax.swing.JFrame {
       String filename = null;
       byte[] person_image = null;
       public profile() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        editProfile = new javax.swing.JButton();
        updateprofile = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userinfo = new javax.swing.JTextField();
        contactinfo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        emailinfo = new javax.swing.JTextField();
        r = new javax.swing.JLabel();
        lbl_image = new javax.swing.JLabel();
        profileimage = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        editProfile.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        editProfile.setText("Edit Profile");
        editProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editProfileActionPerformed(evt);
            }
        });
        jPanel1.add(editProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, -1, -1));

        updateprofile.setBackground(new java.awt.Color(0, 102, 255));
        updateprofile.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        updateprofile.setText("Update");
        updateprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateprofileActionPerformed(evt);
            }
        });
        jPanel1.add(updateprofile, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, -1, -1));

        logout.setBackground(new java.awt.Color(255, 51, 51));
        logout.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        logout.setText("LogOut");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel1.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("UserName:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 62, 20));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Contact:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 50, 20));

        userinfo.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        userinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userinfoActionPerformed(evt);
            }
        });
        jPanel1.add(userinfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 150, -1));

        contactinfo.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        contactinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactinfoActionPerformed(evt);
            }
        });
        jPanel1.add(contactinfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 150, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Email:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 50, 20));

        emailinfo.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        emailinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailinfoActionPerformed(evt);
            }
        });
        jPanel1.add(emailinfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 150, -1));
        jPanel1.add(r, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 70, 20));
        jPanel1.add(lbl_image, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 100, 90));

        profileimage.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Desktop\\projectimage\\profilepic.png")); // NOI18N
        profileimage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileimageActionPerformed(evt);
            }
        });
        jPanel1.add(profileimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 100, 90));

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\jewelleryManagement\\src\\View\\dashboardimage.jpg")); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editProfileActionPerformed
        // TODO add your handling code here:
        
//        try{
//            String username = "root";
//            String password = "4312@LR#1234";
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration");
//            String query1 = "SELECT * FROM register";
//            Statement st = con.createstatement();
//           
//        }catch(Exception e){
//        }
        
    }//GEN-LAST:event_editProfileActionPerformed
    
         

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutActionPerformed

    private void userinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userinfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userinfoActionPerformed

    private void contactinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactinfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactinfoActionPerformed

    private void emailinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailinfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailinfoActionPerformed

    private void updateprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateprofileActionPerformed
        // TODO add your handling code here:
        ProfileController asd = new ProfileController();
        List <profilemod> details = asd.getalldetails();
        ArrayList <String> str = new ArrayList<>();
        str.add(0,"hello");
        for(profilemod alldetails : details){
            str.add(alldetails.getid(),alldetails.getusername());
            System.out.println(alldetails.getid() + alldetails.getusername());
        }
        profilemod profile = new profilemod();
        int id = profile.getid();
        
       ProfileController controller = new ProfileController();
       controller.updateprofilemod(id,userinfo.getText(),emailinfo.getText(),contactinfo.getText());
       
       System.out.println("profile" );
    }//GEN-LAST:event_updateprofileActionPerformed

    private void profileimageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileimageActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon imageicon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lbl_image.getWidth(),lbl_image.getHeight(),Image.SCALE_SMOOTH));
        lbl_image.setIcon(imageicon);
        try{
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buff = new byte[1024];
            
            for(int readNum;(readNum=fis.read(buff)) !=-1;){
                bos.write(buff,0,readNum);
                
            }
            person_image = bos.toByteArray();
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_profileimageActionPerformed

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
            java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField contactinfo;
    private javax.swing.JButton editProfile;
    public javax.swing.JTextField emailinfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_image;
    private javax.swing.JButton logout;
    private javax.swing.JButton profileimage;
    private javax.swing.JLabel r;
    private javax.swing.JButton updateprofile;
    public javax.swing.JTextField userinfo;
    // End of variables declaration//GEN-END:variables
}
