/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.infox2.dal;

import java.sql.*;
/**
 *
 * @author Alexsandro
 */
public class ModuloConexao {
    public static Connection conector(){
        java.sql.Connection conexao = null;
        String driver = "com.mysql.jdbc.Driver";
        String url= "jdbc:mysql://localhost:3306/dbinfox2";
        String user= "root";
        String password = "";
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user,password);
            return conexao;
            System.out.println(e);
        } catch (Exception e) {
            
            return null;
            
        }
        
    }
    
}
