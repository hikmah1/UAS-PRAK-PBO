//koneksi
import java.sql.*;
import javax.swing.JOptionPane;
import com.mysql.jdbc.Statement;

//subclass dari BobaStreetPage (inheritance)
public class BobaDrink extends StreetBobaPage implements Boba{
//state (enkapsulasi)
    protected String pilihan1;
    protected String jenisPesanan;
    protected int banyak;
    protected int harga;
    protected int total;
    
    Connection conn = null;
//method setget tiap state

    public String getPilihan1() {
        return pilihan;
    }
    
    public void setPilihan1(String pilihan) {
        this.pilihan = "Minuman";
    }
    
    public void setPilihan1(String Minuman, String Harga) {
       
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
    BobaDrink(String pilihan, String jenisPilihan, int banyak, int harga, int total) {
        setPilihan(pilihan);
        setJenisPesanan(jenisPilihan);
        setBanyak(banyak);
        setHarga(harga);
        setTotal(total);
    
}
    @Override //mengOverride dari class BobaSreetPage
    public ResultSet tampilData() {
        sql = "select * from mnm";
        try {
            stat = koneksi.createStatement();
            hasil = stat.executeQuery(sql);
        } catch (Exception e) {
        }
        return hasil;
    }
    
    //mengOverride dari class BobaSreetPage
    @Override
    public void simpanData() { // behavior
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/boba","root","");
            sql = "insert into mnm values ('"+0+"','"+getPilihan()+"','"+getJenisPesanan()+"',"
                    + "'"+String.valueOf(getBanyak())+"')";
            Statement p = (Statement) conn.createStatement();
            p.executeQuery(sql);
            JOptionPane.showMessageDialog(null, "Simpan Berhasil");
          
        } catch (Exception e) {
            System.out.println("belum berhasil " + e);
        }   
    }
    
    @Override
    public void insert(){
      
        try{
             database kk = new database();
            sql = "insert into mnm values ("+0+",'"+getPilihan()+"','"+getJenisPesanan()+"',"
                    + "'"+String.valueOf(getBanyak())+"')";
            Statement p = (Statement) kk.koneksiDB().createStatement();
            p.execute(sql);
            JOptionPane.showMessageDialog(null, "Pesanan Diproses");
          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Pesanan Bermasalah!");
            System.out.println(e);
        } 
    }
    
}

