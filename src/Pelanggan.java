import java.sql.*;
import javax.swing.JOptionPane;
import com.mysql.jdbc.Statement;

//subclass dari BobaStreetPage (inheritance)

public class Pelanggan extends StreetBobaPage implements Boba{
//state (enkapsulasi)
    private String namaPelanggan;
    private String username;
    private String password;
    private String passcheck;

        Connection conn = null;
        //method setget tiap state
    
    public String getPasscheck() {
        return passcheck;
    }

    public void setPasscheck(String passcheck) {
        this.passcheck = passcheck;
    }
        
    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    Pelanggan(String nama, String user, String pass, String check) {
        setNamaPelanggan(nama);
        setUsername(user);
        setPassword(pass);
        setPasscheck(check);
    
}
    //method mengOverride dari class BobaSreetPage
    @Override 
    public ResultSet tampilData() { //untuk menampilkan data
        sql = "select * Pelanggan";
        try {
            stat = koneksi.createStatement();
            hasil = stat.executeQuery(sql);
            JOptionPane.showMessageDialog(null, "Tampil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Tidak Tampil"+e);
        }
        return hasil;
    }
    
    @Override
    public void simpanData() { // method menyimpan data ke db
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/boba","root","");
            sql = "insert into pelanggan values ("+0+",'"+getNamaPelanggan()+"','"+getUsername()+"',"
                    + "'"+getPassword()+"')";
            Statement p = (Statement) conn.createStatement();
            p.execute(sql);
            JOptionPane.showMessageDialog(null, "Simpan Berhasil");
          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Simpan belum Berhasil"+ e);
          
        }   
    }
    
    @Override
    public void insert(){ //memasukkan data ke db
      
        try{
             database kk = new database();
            sql = "insert into pelanggan values ("+0+",'"+getNamaPelanggan()+"','"+getUsername()+"',"
                    + "'"+getPassword()+"')";
            Statement p = (Statement) kk.koneksiDB().createStatement();
            p.execute(sql);
            JOptionPane.showMessageDialog(null, "Insert Berhasil");
          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Insert belum Berhasil"+ e);
            
        } 
    }

}

