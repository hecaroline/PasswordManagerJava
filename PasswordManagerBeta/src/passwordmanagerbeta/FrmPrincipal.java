/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package passwordmanagerbeta;

import java.text.DateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Helen
 */
public class FrmPrincipal extends javax.swing.JFrame {

    FrmUsers tlusers = new FrmUsers();
    FrmLogin tlLogin = new FrmLogin();
    FrmServices tlservices = new FrmServices();
    FrmITDocs tlitdocs = new FrmITDocs();
    FrmServerKeys tlservkeys = new FrmServerKeys();
    
    public FrmPrincipal() {
        initComponents();
        // Substituindo o Label de Data e HORA
        Date data = new Date();
        DateFormat formt = DateFormat.getDateInstance(DateFormat.SHORT);
        //lbData.setText(formt.format(data));
        menDataSET.setText(formt.format(data));
        menSubUsers.doClick();
        tlservices.setVisible(true);
        peDesktop.add(tlservices);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        peDesktop = new javax.swing.JDesktopPane();
        menMenuBar = new javax.swing.JMenuBar();
        menUserSET = new javax.swing.JMenu();
        menDataSET = new javax.swing.JMenu();
        menRegister = new javax.swing.JMenu();
        menSubUsers = new javax.swing.JMenuItem();
        menSubServices = new javax.swing.JMenuItem();
        menSubServKey = new javax.swing.JMenuItem();
        menSubITDocs = new javax.swing.JMenuItem();
        menReports = new javax.swing.JMenu();
        menSubServicesReports = new javax.swing.JMenuItem();
        menSubITDocsReports = new javax.swing.JMenuItem();
        menSubServKeyReports = new javax.swing.JMenuItem();
        menHelp = new javax.swing.JMenu();
        menSubAbout = new javax.swing.JMenuItem();
        menOptions = new javax.swing.JMenu();
        menLogoff = new javax.swing.JMenuItem();
        menExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        peDesktop.setBackground(new java.awt.Color(255, 255, 255));
        peDesktop.setPreferredSize(new java.awt.Dimension(727, 480));

        javax.swing.GroupLayout peDesktopLayout = new javax.swing.GroupLayout(peDesktop);
        peDesktop.setLayout(peDesktopLayout);
        peDesktopLayout.setHorizontalGroup(
            peDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 727, Short.MAX_VALUE)
        );
        peDesktopLayout.setVerticalGroup(
            peDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        menUserSET.setBackground(new java.awt.Color(153, 204, 255));
        menUserSET.setText("USERNAME");
        menMenuBar.add(menUserSET);

        menDataSET.setBackground(new java.awt.Color(153, 204, 255));
        menDataSET.setText("DATE");
        menDataSET.setToolTipText("");
        menDataSET.setEnabled(false);
        menMenuBar.add(menDataSET);

        menRegister.setText("Register");

        menSubUsers.setText("Users");
        menSubUsers.setEnabled(false);
        menSubUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menSubUsersActionPerformed(evt);
            }
        });
        menRegister.add(menSubUsers);

        menSubServices.setText("Services");
        menSubServices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menSubServicesActionPerformed(evt);
            }
        });
        menRegister.add(menSubServices);

        menSubServKey.setText("Server Keys");
        menSubServKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menSubServKeyActionPerformed(evt);
            }
        });
        menRegister.add(menSubServKey);

        menSubITDocs.setText("IT Docs");
        menSubITDocs.setEnabled(false);
        menSubITDocs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menSubITDocsActionPerformed(evt);
            }
        });
        menRegister.add(menSubITDocs);

        menMenuBar.add(menRegister);

        menReports.setText("Reports");
        menReports.setEnabled(false);

        menSubServicesReports.setText("Services");
        menReports.add(menSubServicesReports);

        menSubITDocsReports.setText("IT Docs");
        menReports.add(menSubITDocsReports);

        menSubServKeyReports.setText("Server Key");
        menReports.add(menSubServKeyReports);

        menMenuBar.add(menReports);

        menHelp.setText("Help");

        menSubAbout.setText("About");
        menSubAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menSubAboutActionPerformed(evt);
            }
        });
        menHelp.add(menSubAbout);

        menMenuBar.add(menHelp);

        menOptions.setText("Options");

        menLogoff.setText("Logoff");
        menLogoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menLogoffActionPerformed(evt);
            }
        });
        menOptions.add(menLogoff);

        menExit.setText("Exit");
        menExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menExitActionPerformed(evt);
            }
        });
        menOptions.add(menExit);

        menMenuBar.add(menOptions);

        setJMenuBar(menMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(peDesktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(peDesktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menSubUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menSubUsersActionPerformed
        tlusers.setVisible(true);
        peDesktop.add(tlusers);
    }//GEN-LAST:event_menSubUsersActionPerformed

    private void menSubAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menSubAboutActionPerformed
        // TODO add your handling code here:
        FrmHelp hlp = new FrmHelp();
        hlp.setVisible(true);
    }//GEN-LAST:event_menSubAboutActionPerformed

    private void menLogoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menLogoffActionPerformed
        int sair = JOptionPane.showConfirmDialog(null, "Are you sure you want to disconnect your account?", "Aten????o", JOptionPane.YES_NO_OPTION);
        if(sair == JOptionPane.YES_OPTION){            
            tlLogin.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_menLogoffActionPerformed

    private void menExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menExitActionPerformed
        // TODO add your handling code here:
        int sair = JOptionPane.showConfirmDialog(null, "Are you sure you want to close the program?", "Aten????o", JOptionPane.YES_NO_OPTION);
        if(sair == JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_menExitActionPerformed

    private void menSubServicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menSubServicesActionPerformed
        tlservices.setVisible(true);
        peDesktop.add(tlservices);        
    }//GEN-LAST:event_menSubServicesActionPerformed

    private void menSubServKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menSubServKeyActionPerformed
        tlservkeys.setVisible(true);
        peDesktop.add(tlservkeys); 
    }//GEN-LAST:event_menSubServKeyActionPerformed

    private void menSubITDocsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menSubITDocsActionPerformed
        tlitdocs.setVisible(true);
        peDesktop.add(tlitdocs); 
    }//GEN-LAST:event_menSubITDocsActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JMenu menDataSET;
    private javax.swing.JMenuItem menExit;
    private javax.swing.JMenu menHelp;
    private javax.swing.JMenuItem menLogoff;
    public javax.swing.JMenuBar menMenuBar;
    private javax.swing.JMenu menOptions;
    public javax.swing.JMenu menRegister;
    public static javax.swing.JMenu menReports;
    private javax.swing.JMenuItem menSubAbout;
    public static javax.swing.JMenuItem menSubITDocs;
    private javax.swing.JMenuItem menSubITDocsReports;
    private javax.swing.JMenuItem menSubServKey;
    private javax.swing.JMenuItem menSubServKeyReports;
    private javax.swing.JMenuItem menSubServices;
    private javax.swing.JMenuItem menSubServicesReports;
    public static javax.swing.JMenuItem menSubUsers;
    public static javax.swing.JMenu menUserSET;
    private javax.swing.JDesktopPane peDesktop;
    // End of variables declaration//GEN-END:variables
}
