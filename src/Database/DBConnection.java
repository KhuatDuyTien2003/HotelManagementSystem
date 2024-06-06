/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;




import java.sql.*;  

public class DBConnection{

    public static Connection connectDB(){  
        try{  
             Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/hms_mn", "root", "");
            return conn;
           
        }catch(Exception e){ 
            System.out.println(e);
        }  
          return null;
    }  
  
}  
