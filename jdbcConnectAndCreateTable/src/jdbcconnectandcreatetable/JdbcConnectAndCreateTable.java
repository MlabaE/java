/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcconnectandcreatetable;
import java.sql.*;
import java.io.*;

/**
 *
 * @author mlaba
 */
public class JdbcConnectAndCreateTable {
    static  Connection conn = null;
    static  Statement stmt = null;
    
    
     static final String USER = "root";
     static final String PASS = "";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        connect();
        createTable();
              
    }
    
    public static void connect()
    {
         // create connection to database
        try{
            //load jdbc 
            Class.forName("com.mysql.jdbc.Driver");  
            
            //Connection conn = null;
            
            conn = DriverManager.getConnection("jdbc:mysql://localhost/fxdatabasestudents","root"," ");
            
            System.out.println("Database is connected !");
            
            //conn.close();
            
        }catch(Exception e){
            System.out.println("did not connect to database - error: "+e);
        }
    }
    
    public static void createTable(){
    
        try{

            
            System.out.println("Creating table:");
            
            stmt = conn.createStatement();
            
            String sql = "CREATE TABLE REGISTRATION  (id INTEGER not NULL, firstname VARCHAR(255), lastname VARCHAR(255), age INTEGER, PRIMARY KEY(id))";
            
            stmt.executeUpdate(sql);
            
            System.out.println("Table created !");
            
        }catch(Exception ex)
        {System.out.println("can not create table Error: "+ex);}
        
    }
    
}
