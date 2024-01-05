/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.firstapp;
import java.sql.*;
 
import java.sql.SQLException;
/**
 *
 * @author fatimaezzahra
 */
public class data {
   
               private String user="sql3673830";
   private String pass="XeBbRIaYBk";
    private String con="jdbc:mysql://sql3.freesqldatabase.com/sql3673830";
private Connection c;
     public Connection connet()throws SQLException{
                  

return c=DriverManager.getConnection(con,user,pass);
     
}
}