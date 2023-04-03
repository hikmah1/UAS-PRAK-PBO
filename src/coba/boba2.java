package coba;

import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ASUS
 */
public class boba2 extends Boba1 {

    private String ID_Breed;
    private String Breed;
    private String Nama;
    private String Notelp;

    public String getId_Breed() {
        return ID_Breed;
    }

    public String getbreed() {
        return Breed;
    }

    public String getnama() {
        return Nama;
    }

    public String getnotelp() {
        return Notelp;
    }

    public void setId_Breed(String ID_Breed) {
        this.ID_Breed = ID_Breed;
    }

    public void setbreed(String Breed) {
        this.Breed = Breed;
    }

    public void setnama(String Nama) {
        this.Nama = Nama;
    }

    public void setnotelp(String notelp) {
        this.Notelp = notelp;
    }
    @Override
    public void cetakClass(){
        getId_Breed(); 
    }


    @Override
    public ResultSet tampilData() {
        query = "select*from cute";
        try {
            statement = koneksi.createStatement();
            hasil = statement.executeQuery(query);
        } catch (Exception e) {
        }
        return hasil;
    }

    public void SimpanData(String ID_Breed, String Breed,
            String Nama, String Notelp) {
        query = "insert into cute values (?,?,?,?)";
        try {
            prepsat = koneksi.prepareStatement(query);
            prepsat.setString(1, ID_Breed);
            prepsat.setString(2, Breed);
            prepsat.setString(3, Nama);
            prepsat.setString(4, Notelp);

            prepsat.executeUpdate();
            prepsat.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
