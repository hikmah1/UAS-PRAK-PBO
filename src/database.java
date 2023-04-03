import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author User
 */
public class database {
    private static Connection mysqlkonek;
    public static Connection koneksiDB() throws SQLException {
        if (mysqlkonek == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/boba"; // database
                String user = "root"; // user database
                String pass = ""; // password database
                
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                mysqlkonek = (Connection) DriverManager.getConnection(url, user, pass);
                JOptionPane.showMessageDialog(null, "Koneksi berhasil");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Koneksi Gagal");
            }
        }
        return mysqlkonek;
    }
   
}


 

