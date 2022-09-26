/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package passwordmanagerbeta;
import br.com.passwordmanagerbeta.dba.ModuloUsers2;
import javax.swing.JOptionPane;

public class FrmUsers extends javax.swing.JInternalFrame {

    public FrmUsers() {
        initComponents();
        mdusers2.loadList();
        tbListUsers.setCellSelectionEnabled(false);
        tbListUsers.setRowSelectionAllowed(true);
    }
    
    ModuloUsers2 mdusers2 = new ModuloUsers2();
    
    private void limpar()
    {
        txbName.setText(null);
        txbLastName.setText(null);
        txbLogin.setText(null);
        txbPassword.setText(null);
        txbConfirmPassword.setText(null);
        txbID.setText(null);        
    }
    
    private void onKeys(){        
        FrmUsers.btnSave.setEnabled(true);
        FrmUsers.btnClear.setEnabled(true);
    }
    
    private void offKeys(){
        FrmUsers.btnOnOff.setEnabled(false);
        FrmUsers.btnClear.setEnabled(false);     
        FrmUsers.btnSave.setEnabled(false);
        FrmUsers.txbID.requestFocus();
        FrmUsers.btnDelete.setEnabled(false);
    }
    
    private void setValues(){
        int st = tbListUsers.getSelectedRow();
        String tstId = tbListUsers.getModel().getValueAt(st, 0).toString();
        txbID.setText(tstId);        
        mdusers2.consultar(tstId);        
        txbName.setText(mdusers2.Name);
        txbLogin.setText(mdusers2.Login);
        txbPassword.setText(mdusers2.Password);
        cbProfile.setSelectedItem(mdusers2.Profile);        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txbConfirmPassword = new javax.swing.JTextField();
        txbID = new javax.swing.JTextField();
        lbPassword = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        txbPassword = new javax.swing.JTextField();
        txbName = new javax.swing.JTextField();
        lbLastName = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        txbLastName = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        lbProfile = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        cbProfile = new javax.swing.JComboBox<>();
        btnOnOff = new javax.swing.JToggleButton();
        lbLogin = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbListUsers = new javax.swing.JTable();
        txbLogin = new javax.swing.JTextField();
        lbConfirmPassword = new javax.swing.JLabel();
        lbIconID = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        txbConfirmPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txbConfirmPasswordKeyReleased(evt);
            }
        });

        txbID.setText("ID");
        txbID.setEnabled(false);

        lbPassword.setText("Password");

        lbName.setText("Name");

        txbPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txbPasswordKeyReleased(evt);
            }
        });

        txbName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txbNameKeyReleased(evt);
            }
        });

        lbLastName.setText("Last Name");

        btnDelete.setText("Delete");
        btnDelete.setEnabled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        txbLastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txbLastNameKeyReleased(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.setEnabled(false);
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        lbProfile.setText("Profile");

        btnSave.setText("Save");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        cbProfile.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "admin", "user", "suporte" }));

        btnOnOff.setText("Enabled");
        btnOnOff.setEnabled(false);

        lbLogin.setText("Login");

        tbListUsers = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tbListUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Username", "Password", "Profile"
            }
        ));
        tbListUsers.setCellSelectionEnabled(true);
        tbListUsers.setFocusable(false);
        tbListUsers.getTableHeader().setReorderingAllowed(false);
        tbListUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbListUsersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbListUsers);

        txbLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txbLoginKeyReleased(evt);
            }
        });

        lbConfirmPassword.setText("Confirm");

        lbIconID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIconID.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/passwordmanagerbeta/icons/id002A.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txbID)
                            .addComponent(lbIconID, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnOnOff, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbName)
                            .addComponent(lbLastName)
                            .addComponent(txbName)
                            .addComponent(txbLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbProfile)
                            .addComponent(lbLogin)
                            .addComponent(txbLogin)
                            .addComponent(cbProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbPassword)
                            .addComponent(lbConfirmPassword)
                            .addComponent(txbPassword)
                            .addComponent(txbConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lbPassword)
                            .addGap(40, 40, 40)
                            .addComponent(lbConfirmPassword))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbProfile)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbProfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txbPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addComponent(lbLogin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txbConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txbLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbName)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(lbLastName))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(txbName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txbLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbIconID, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(txbID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSave)
                            .addComponent(btnDelete))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnClear)
                            .addComponent(btnOnOff))
                        .addGap(12, 12, 12)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        setBounds(0, 0, 731, 491);
    }// </editor-fold>//GEN-END:initComponents

    private void txbConfirmPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txbConfirmPasswordKeyReleased
        boolean onBtn = txbConfirmPassword.getText().isEmpty();
        if(onBtn != true) {
            btnClear.setEnabled(true);
        }
        else{
            btnClear.setEnabled(false);
        }
    }//GEN-LAST:event_txbConfirmPasswordKeyReleased

    private void txbPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txbPasswordKeyReleased
        boolean onBtn = txbPassword.getText().isEmpty();
        if(onBtn != true) {
            btnClear.setEnabled(true);
            btnSave.setEnabled(true);
        }
        else{
            btnClear.setEnabled(false);
        }
    }//GEN-LAST:event_txbPasswordKeyReleased

    private void txbNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txbNameKeyReleased
        boolean onBtn = txbName.getText().isEmpty();
        if(onBtn != true) {
            btnClear.setEnabled(true);
            btnSave.setEnabled(true);
        }
        else{
            btnClear.setEnabled(false);
        }
    }//GEN-LAST:event_txbNameKeyReleased

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
//        chamado o metodo delete na classe Modulo Users
        String id = txbID.getText();                
        mdusers2.deletar(id);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txbLastNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txbLastNameKeyReleased
        boolean onBtn = txbLastName.getText().isEmpty();
        if(onBtn != true) {
            btnClear.setEnabled(true);
            btnSave.setEnabled(true);
        }
        else{
            btnClear.setEnabled(false);
        }
    }//GEN-LAST:event_txbLastNameKeyReleased

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        //seta as textbox como null para limpar os campos
        try{
            limpar();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }

    }//GEN-LAST:event_btnClearActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        //chamado o metodo adicionar na classe Modulo Users
        try {
            String id = txbID.getText();
            String login = txbLogin.getText();
            String name = txbName.getText();
            String password = txbPassword.getText();
            
            boolean checkName = name.isEmpty();
            boolean checkLog = login.isEmpty();
            boolean checkPass = password.isEmpty();
            
            if(checkName != false | checkLog != false | checkPass != false){ 
                JOptionPane.showMessageDialog(null,"Preencha todos os campos obrigatorios");
                
            }
            else{
                String profile = cbProfile.getSelectedItem().toString();
                mdusers2.adicionar(id, name, login, password, profile);              
            }                          
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txbLoginKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txbLoginKeyReleased
        boolean onBtn = txbLogin.getText().isEmpty();
        if(onBtn != true) {
            btnClear.setEnabled(true);
            btnSave.setEnabled(true);
        }
        else{
            btnClear.setEnabled(false);
        }
    }//GEN-LAST:event_txbLoginKeyReleased

    private void tbListUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbListUsersMouseClicked
        //        METODO RESPONSAVEL POR IDENTIFICAR O DUPLO CLICK        
        System.out.println
        ( "Click at (" + evt.getX() + ":" + evt.getY() + ")" );
        if (evt.getClickCount() == 2){            
            System.out.println( " o clique foi duplo");
            limpar();
            setValues();

            boolean onBtn = txbID.getText().isEmpty();
            if(onBtn != true) {
                onKeys();
            }
        }
        else{
            System.out.println( " o clique foi simples");
        }
    }//GEN-LAST:event_tbListUsersMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnClear;
    public static javax.swing.JButton btnDelete;
    public static javax.swing.JToggleButton btnOnOff;
    public static javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbProfile;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbConfirmPassword;
    private javax.swing.JLabel lbIconID;
    private javax.swing.JLabel lbLastName;
    private javax.swing.JLabel lbLogin;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbProfile;
    public static javax.swing.JTable tbListUsers;
    private javax.swing.JTextField txbConfirmPassword;
    public static javax.swing.JTextField txbID;
    private javax.swing.JTextField txbLastName;
    public static javax.swing.JTextField txbLogin;
    private javax.swing.JTextField txbName;
    private javax.swing.JTextField txbPassword;
    // End of variables declaration//GEN-END:variables
}
