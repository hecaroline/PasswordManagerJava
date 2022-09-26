/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package passwordmanagerbeta;

import br.com.passwordmanagerbeta.dba.ModuloServices;

public class FrmServices extends javax.swing.JInternalFrame {    
    
    FrmDataBase tlDataBase = new FrmDataBase();
    ModuloServices mdservices = new ModuloServices();
    
    
    public FrmServices() {
        initComponents();        
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txbID = new javax.swing.JTextField();
        lbName = new javax.swing.JLabel();
        lbLastName = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        txbPassword = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnOnOff = new javax.swing.JToggleButton();
        lbLogin = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbListServices = new javax.swing.JTable();
        txbUsername = new javax.swing.JTextField();
        lbIconID = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txbDescription = new javax.swing.JTextArea();
        lbLogin1 = new javax.swing.JLabel();
        btnDataBase = new javax.swing.JButton();
        txbUsername1 = new javax.swing.JTextField();
        cbDataBase = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();
        txbSearch = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Control Users");
        setToolTipText("");

        txbID.setText("ID");
        txbID.setEnabled(false);

        lbName.setText("Service");

        lbLastName.setText("Username");

        btnDelete.setText("Delete");
        btnDelete.setEnabled(false);

        btnClear.setText("Clear");
        btnClear.setEnabled(false);

        btnSave.setText("Save");
        btnSave.setEnabled(false);

        btnOnOff.setText("Enabled");
        btnOnOff.setEnabled(false);

        lbLogin.setText("Password");

        tbListServices = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tbListServices.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Services", "Username", "Password", "Data Base"
            }
        ));
        tbListServices.setCellSelectionEnabled(true);
        tbListServices.setFocusable(false);
        tbListServices.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbListServices);
        tbListServices.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        lbIconID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIconID.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/passwordmanagerbeta/icons/id002A.png"))); // NOI18N

        txbDescription.setColumns(20);
        txbDescription.setRows(5);
        jScrollPane2.setViewportView(txbDescription);

        lbLogin1.setText("Description");

        btnDataBase.setBackground(new java.awt.Color(255, 153, 153));
        btnDataBase.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDataBase.setText("Data Base");
        btnDataBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataBaseActionPerformed(evt);
            }
        });

        cbDataBase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnSearch.setText("Search");

        txbSearch.setForeground(new java.awt.Color(204, 204, 204));
        txbSearch.setText("Write... ");
        txbSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txbSearchMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbLogin)
                            .addComponent(lbLogin1)
                            .addComponent(lbName)
                            .addComponent(txbID, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(txbUsername1)
                            .addComponent(txbPassword)
                            .addComponent(lbIconID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnOnOff, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(btnDataBase, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lbLastName)
                                .addComponent(txbUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbDataBase, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbIconID, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txbID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(lbName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txbUsername1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(lbLogin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txbPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnDataBase, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSave)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnClear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnOnOff)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txbUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbLastName)
                                        .addGap(28, 28, 28)))))
                        .addGap(12, 12, 12)
                        .addComponent(lbLogin1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbDataBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch)
                            .addComponent(txbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        setBounds(0, 0, 731, 480);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDataBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataBaseActionPerformed
        tlDataBase.setVisible(true);
        //mdservices.loadList();
        tbListServices.setCellSelectionEnabled(false);
        tbListServices.setRowSelectionAllowed(true);
    }//GEN-LAST:event_btnDataBaseActionPerformed

    private void txbSearchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txbSearchMousePressed
        txbSearch.setText(null);
    }//GEN-LAST:event_txbSearchMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnClear;
    private javax.swing.JButton btnDataBase;
    public static javax.swing.JButton btnDelete;
    public static javax.swing.JToggleButton btnOnOff;
    public static javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cbDataBase;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbIconID;
    private javax.swing.JLabel lbLastName;
    private javax.swing.JLabel lbLogin;
    private javax.swing.JLabel lbLogin1;
    private javax.swing.JLabel lbName;
    public static javax.swing.JTable tbListServices;
    private javax.swing.JTextArea txbDescription;
    public static javax.swing.JTextField txbID;
    private javax.swing.JTextField txbPassword;
    private javax.swing.JTextField txbSearch;
    private javax.swing.JTextField txbUsername;
    private javax.swing.JTextField txbUsername1;
    // End of variables declaration//GEN-END:variables
}
