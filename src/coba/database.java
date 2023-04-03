/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class database{

    private static Connection mysql;

    public static Connection koneksiDB() throws SQLException {
        if (mysql == null) {
            try {
                String DB = "jdbc:mysql://localhost:3306/uaspbo"; // tokobuku database
                String user = "root"; // user database
                String pass = ""; // password database
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                mysql = (Connection) DriverManager.getConnection(DB, user, pass);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Koneksi Gagal");
            }
        }
        return mysql;
    }
}
