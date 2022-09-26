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
import passwordmanagerbeta.FrmUsers;

/**
 *
 * @author Helen
 */
public class ModuloUsers2 {
    
    public String Name;
    public String Login;
    public String Password;
    public String Profile;
        
    Connection conexao = null;
    PreparedStatement pst = null;
    public ResultSet rs = null;

    public void loadList(){
        String sql="select * from tbUsuarios";
        conexao = ModuloConexao.conector();        
        try{
           pst = conexao.prepareStatement(sql);
           rs = pst.executeQuery();           
           FrmUsers.tbListUsers.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    public void consultar(String id){                        
        String sql="select * from tbUsuarios where iduser=?;";
        conexao = ModuloConexao.conector();
        try {                           
            pst = conexao.prepareStatement(sql);
            pst.setString(1, id);
            rs = pst.executeQuery();
            if(rs.next()){
                Name = rs.getString(2);
                Login = rs.getString(3);
                Password = rs.getString(4);
                Profile = rs.getString(5);
                FrmUsers.btnOnOff.setEnabled(true);
                FrmUsers.btnDelete.setEnabled(true);
            }
            else{
                JOptionPane.showMessageDialog(null,"Usuario não encontrado!");
            }            
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    public void adicionar (String id, String name, String login, String password, String profile){        
        String sqlIN="insert into tbUsuarios(usuario, login, senha, perfil) values(?,?,?,?)";
        String sqlUP="update tbUsuarios set usuario=?, login=?, senha=?, perfil=? where iduser=?";
        conexao = ModuloConexao.conector();
        try {
            if(login == FrmUsers.txbLogin.getText() & id == FrmUsers.txbID.getText()){
                pst = conexao.prepareStatement(sqlUP);
                pst.setString(1,name);
                pst.setString(2,login);
                pst.setString(3,password);
                pst.setString(4,profile);
                pst.setString(5, id);
                pst.executeUpdate();
                ((DefaultTableModel) FrmUsers.tbListUsers.getModel()).setRowCount(0);
                loadList();
                JOptionPane.showMessageDialog(null,"Update user Successfully");
            }
            else{
                pst = conexao.prepareStatement(sqlIN);
                pst.setString(1,name);
                pst.setString(2,login);
                pst.setString(3,password);
                pst.setString(4,profile);
                pst.executeUpdate();
                ((DefaultTableModel) FrmUsers.tbListUsers.getModel()).setRowCount(0);
                loadList();
                JOptionPane.showMessageDialog(null,"New user created Successfully");
            }                        
              
//            int addc = pst.executeUpdate();
//            if(addc > 0){
//                ((DefaultTableModel) FrmUsers.tbListUsers.getModel()).setRowCount(0);
//                loadList();
//                JOptionPane.showMessageDialog(null,"New user created Successfully");                
//            }                        
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    public void deletar(String id){
       String sql = "delete from tbUsuarios where iduser=?";
        try{
            int deletar = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this user?", "Warning!", JOptionPane.YES_NO_OPTION);
            if(deletar == JOptionPane.YES_OPTION){
//                boolean checkid = id.isEmpty();
//                if(checkid != true){
                conexao = ModuloConexao.conector();
                pst = conexao.prepareStatement(sql);
                pst.setString(1,id);
                pst.executeUpdate();
                ((DefaultTableModel) FrmUsers.tbListUsers.getModel()).setRowCount(0);
                loadList();
                JOptionPane.showMessageDialog(null,"User Successfully Removed");                 
//                }
            }   
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        } 
    }
}
