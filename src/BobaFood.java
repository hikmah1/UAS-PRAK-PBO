import java.sql.*;
import javax.swing.JOptionPane;
import com.mysql.jdbc.Statement;

//subclass dari BobaStreetPage (inheritance)

public class BobaFood extends StreetBobaPage implements Boba{
//state (enkapsulasi)
    protected String pilihan;
    protected String jenisPesanan;
    protected int banyak;
    protected int harga;
    protected int total;
    
    Connection conn = null;
//method setget tiap state

    @Override
    public String getPilihan() {
        return pilihan;
    }

    @Override
    public void setPilihan(String pilihan) {
        this.pilihan = "Makanan";
    }

    public String getJenisPesanan() {
    return jenisPesanan;
    }

    public void setJenisPesanan(String jenisPesanan) {
        this.jenisPesanan = jenisPesanan;
    }
    
    public int getBanyak() {
        return banyak;
    }

    public void setBanyak(int banyak) {
        this.banyak = banyak;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }    
    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }


    /**
     *
     * @return
     */
    BobaFood(String pilihan, String jenisPilihan, int banyak, int harga, int total) {
        setPilihan(pilihan);
        setJenisPesanan(jenisPilihan);
        setBanyak(banyak);
        setHarga(harga);
        setTotal(total);
    
}
    @Override //mengOverride dari class BobaSreetPage
    public ResultSet tampilData() {
        sql = "select * from BobaFood";
        try {
            stat = koneksi.createStatement();
            hasil = stat.executeQuery(sql);
        } catch (Exception e) {
        }
        return hasil;
    }
    
    @Override
    public void simpanData() { // behavior
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/boba","root","");
            sql = "insert into mkn values ("+0+",'"+getPilihan()+"','"+getJenisPesanan()+"',"
                    + "'"+String.valueOf(getBanyak())+"')";
            Statement p = (Statement) conn.createStatement();
            p.executeQuery(sql);
            JOptionPane.showMessageDialog(null, "Simpan Berhasil");
          
        } catch (Exception e) {
            System.out.println("Pesanan masalah" + e);
        }   
    }
    
    @Override
    public void insert(){
      
        try{
             database kk = new database();
            sql = "insert into mkn values ("+0+",'"+getPilihan()+"','"+getJenisPesanan()+"',"
                    + "'"+String.valueOf(getBanyak())+"')";
            Statement p = (Statement) kk.koneksiDB().createStatement();
            p.execute(sql);
            JOptionPane.showMessageDialog(null, "Pesanan Diproses");
          
        } catch (Exception e) {
            System.out.println("Pesanan Bermasalah" + e);
        } 
    }
    
}

