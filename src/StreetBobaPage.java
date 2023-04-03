//membuat koneksi 
import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class StreetBobaPage {//superclass
    //Acces modifier protected (enkapsulasi)
    protected Connection koneksi;
    protected PreparedStatement prepsat;
    protected Statement stat;
    protected ResultSet hasil;
    protected String sql;
    protected String pilihan, mkn, mnm;

    public Connection getKoneksi() {
        return koneksi;
    }

    public void setKoneksi(Connection koneksi) {
        this.koneksi = koneksi;
    }

    public PreparedStatement getPrepsat() {
        return prepsat;
    }

    public void setPrepsat(PreparedStatement prepsat) {
        this.prepsat = prepsat;
    }

    public Statement getStatement() {
        return stat;
    }

    public void setStatement(Statement statement) {
        this.stat = statement;
    }

    public ResultSet getHasil() {
        return hasil;
    }

    public void setHasil(ResultSet hasil) {
        this.hasil = hasil;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public String getPilihan() {
        return pilihan;
    }

    public void setPilihan(String pilihan) {
        this.pilihan = pilihan;
    }
    
    //overloading
    public void setPilihan(String makanan, String minuman) {
        this.mkn = makanan;
        this.mnm = minuman;
    }

    //method
    public ResultSet tampilData() {
        sql = "select * from pelanggan";
        try {
            stat = koneksi.createStatement();
            hasil = stat.executeQuery(sql);
        } catch (Exception e) {
        }
        return hasil;
    }
}