/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_Kuliah.Account_Connetions;
/**
 *
 * @author ZEUS
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    private static final String Url = "jdbc:mysql://localhost/gudang2";
    private static final String username = "root";
    private static final String password = "";
    private static Connection connection;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection(Url, username, password);
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println((char)27 +  "[01;31m \nError : Gagal terkoneksi ke Database " + e.getMessage() + (char)27 + "[00;00m");
            }
        }
        return connection;
    }
}


