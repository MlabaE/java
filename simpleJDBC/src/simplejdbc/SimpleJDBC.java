/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplejdbc;
import java.sql.*;

/**
 *
 * @author mlaba
 */
public class SimpleJDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create connection to database
        try{
            //load jdbc 
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection conn = null;
            
            conn = DriverManager.getConnection("jdbc:mysql://localhost/fxdatabasestudents","root"," ");
            
            System.out.print("Database is connected !");
            
            conn.close();
            
        }catch(Exception e){
            System.out.println("did not connect to database - error: "+e);
        }
    }
    
}
