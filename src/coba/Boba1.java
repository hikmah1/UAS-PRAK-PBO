package coba;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Boba1 {
    protected Connection koneksi; //variable
    protected PreparedStatement prepsat;
    protected Statement statement;
    protected ResultSet hasil;
    protected String query;

    protected Boba1() {
        try {
            database db = new database(); // objek 
            koneksi = db.koneksiDB();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    protected Connection getCRUDkoneksi() {
        return koneksi;
    }

    protected void setCRUDkoneksi(Connection CRUDkoneksi) {
        this.koneksi = CRUDkoneksi;
    }

    protected PreparedStatement getCRUDpsmt() {
        return prepsat;
    }

    protected void setCRUDpsmt(PreparedStatement CRUDpsmt) {
        this.prepsat = CRUDpsmt;
    }

    protected Statement getCRUDstat() {
        return statement;
    }

    protected void setCRUDstat(Statement CRUDstat) {
        this.statement = CRUDstat;
    }

    protected ResultSet getCRUDhasil() {
        return hasil;
    }

    protected void setCRUDhasil(ResultSet CRUDhasil) {
        this.hasil = CRUDhasil;
    }

    protected String getCRUDquery() {
        return query;
    }

    protected void setCRUDquery(String CRUDquery) {
        this.query = CRUDquery;
    }

    public ResultSet tampilData() {
        query = "select*from tipe";
        try {
            statement = koneksi.createStatement();
            hasil = statement.executeQuery(query);
        } catch (Exception e) {
        }
        return hasil;
    }
// overload = menyediakan parameter untuk jumlah variable pada subclass
    
    public void cetakClass(){
        
    }

    public void simpanData(String a, String b, String c) {
        
    }
    
     public void simpanData(String a, String b) {
         
    }
     
    public void simpanData(String a, String b, String c, String d) { 
    }
    
    
    public void simpanData(String a, String b, String c, String d, String e) { 
    }
}