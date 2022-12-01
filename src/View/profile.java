package View;


import Controller.ProfileController;

public class profile extends javax.swing.JFrame {

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
        jLabel6 = new javax.swing.JLabel();

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

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/dashboardimage.jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 530));

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
        
//        ProfileController controller = new ProfileController();
//       controller.profilemod(userinfo.getText(),emailinfo.getText(),contactinfo.getText());
        
    }//GEN-LAST:event_updateprofileActionPerformed

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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logout;
    private javax.swing.JButton updateprofile;
    public javax.swing.JTextField userinfo;
    // End of variables declaration//GEN-END:variables
}
