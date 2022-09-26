/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.passwordmanagerbeta.dba;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import passwordmanagerbeta.FrmDataBase;
import passwordmanagerbeta.FrmUsers;

/**
 *
 * @author Helen
 */
public class ModuloDataBase {
        
    Connection conexao = null;
    PreparedStatement pst = null;
    public ResultSet rs = null;

    public void loadList(){
        String sql="show tables from dbPassManager;";
        conexao = ModuloConexao.conector();        
        try{
           pst = conexao.prepareStatement(sql);
           rs = pst.executeQuery();           
           FrmDataBase.tbListDataBase.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }    
    
    public void adicionar (String txbDB){        
        String sqlIN="create table " + txbDB + " ( idserv int primary key AUTO_INCREMENT, servico varchar(50) not null unique, username varchar(15) not null, pass varchar(15) not null, descricao varchar (1000) );";
        //String sqlUP="update tbUsuarios set usuario=?, login=?, senha=?, perfil=? where iduser=?";
        try {                        
            conexao = ModuloConexao.conector();
            pst = conexao.prepareStatement(sqlIN);
            pst.executeUpdate();
            ((DefaultTableModel) FrmDataBase.tbListDataBase.getModel()).setRowCount(0);
            loadList();
            JOptionPane.showMessageDialog(null,"New Data Base created Successfully");                       
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    public void deletar(String txbDB){
       String sql = "drop table " + txbDB + " ;";
        try{
            int deletar = JOptionPane.showConfirmDialog(null, "! Critical Level Action ! Are you sure you want to delete this Database ?", "Warning!", JOptionPane.YES_NO_OPTION);
            if(deletar == JOptionPane.YES_OPTION){
                conexao = ModuloConexao.conector();
                pst = conexao.prepareStatement(sql);
                pst.executeUpdate();
                ((DefaultTableModel) FrmUsers.tbListUsers.getModel()).setRowCount(0);
                loadList();
                JOptionPane.showMessageDialog(null,"User Successfully Removed");                 
            }   
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        } 
    }
}
