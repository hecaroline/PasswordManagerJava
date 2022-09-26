/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.passwordmanagerbeta.dba;

import java.sql.*;

/**
 *
 * @author Helen
 */
public class ModuloConexao {
    //Metodo responsavel por estabelecer a conexão com o banco
    public static Connection conector()
    {
        java.sql.Connection conexao = null;
        // linha de baixo chama o driver
        String driver = "com.mysql.cj.jdbc.Driver";
        // Armazenando informações referente ao Banco
        String url = "jdbc:mysql://192.168.56.105/dbPassManager";
        String user = "dba";
        String password = "pass";
        //Estabelecendo a Conexão com o Banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        }
        catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    
}
