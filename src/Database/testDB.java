/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import java.sql.Connection;

/**
 *
 * @author kdt09
 */
public class testDB {
    public static void main(String[] args) {
        Connection conn = DBConnection.connectDB();
        if(conn != null){
            System.out.println("HHHHHH");
        }
    }
}
