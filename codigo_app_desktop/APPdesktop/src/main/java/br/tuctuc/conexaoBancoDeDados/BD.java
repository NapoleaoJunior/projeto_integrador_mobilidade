/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.tuctuc.conexaoBancoDeDados;

import java.sql.*;

public class BD {

    public static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private String url = "jdbc:mysql://localhost:3307/tuctuc";
    private String user = "root";
    private String password = "senac";
    private Connection conn;
    
    public boolean conectaBD(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.conn = DriverManager.getConnection(url,user,password);
        }catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    public boolean encerrarConexao(){
       try{
           this.conn.close();
           
       }catch(SQLException e){
           e.printStackTrace();
           return false;
       }
       return true;
}
    public PreparedStatement getPreparedStatement(String query){
        try{
            return this.conn.prepareStatement(query);  
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return null;
    }
}
