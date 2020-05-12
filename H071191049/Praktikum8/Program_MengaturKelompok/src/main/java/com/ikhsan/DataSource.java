package com.ikhsan;

import java.sql.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DataSource {

    DataSource() {
        createTable();
    }

    Connection connectToDataBase(String url) {
        Connection connection = null;
        try {
            // Membuat koneksi dengan database dengan url
            connection = DriverManager.getConnection(url);
            System.out.println("Koneksi Berhasil");
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return connection;
    }
    //Untuk Membuat Tabel di data.db
    void createTable() {
        Connection connection = connectToDataBase("jdbc:sqlite:data.db");
        Statement statement = null;
        String sqlCode = "CREATE TABLE IF NOT EXISTS MAHASISWA"
                        + " (NIM char(15) PRIMARY KEY,"
                        +" NAMA text NOT NULL,"
                        + " LP text NOT NULL,"
                        +" KELOMPOK text NOT NULL)";
        try {
            statement = connection.createStatement();
            statement.execute(sqlCode);
        } catch (Exception e) {
            System.err.println(e.toString());
        } finally {
            if (connection != null){
                try {
                    connection.close();
                } catch (Exception e) {
                    System.err.println(e.getLocalizedMessage());
                }
            }
        }
    }

    //ObservableList digunakan agar update pada list langsung terlihat
    //mereturn mahasiswa ke app
    ObservableList<Mahasiswa> getMahasiswaOList() {
        Connection c = connectToDataBase("jdbc:sqlite:data.db");
        String sqlCode;
        //untuk mengeksekusi query sql dengan jdbc
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ObservableList<Mahasiswa> oList = FXCollections.observableArrayList();
        try {
            sqlCode = "SELECT * FROM MAHASISWA ORDER BY KELOMPOK;";
            stmt = c.prepareStatement(sqlCode);
            rs = stmt.executeQuery();
            while (rs.next()) {
                String nama = rs.getString("NAMA");
                String nim = rs.getString("NIM");
                String jk = rs.getString("LP");
                String kelompok = rs.getString("KELOMPOK");
                oList.add(new Mahasiswa(nama, nim, jk, kelompok));
            }
        } catch (SQLException e) {
        } finally {
            if (c != null)
                try {
                    c.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        }
        return oList;
    }

    //manambahkan value baru ke sqlite
    Mahasiswa addValue(String nama, String nim, String jk, String kelompok) throws Exception{
        PreparedStatement stmt = null;
        Connection c = connectToDataBase("jdbc:sqlite:data.db");
        String sqlCode;
        Mahasiswa mahasiswa = new Mahasiswa();
        try{
            sqlCode = "INSERT INTO MAHASISWA (NIM, NAMA, LP, KELOMPOK) VALUES (?, ?, ?, ?);";
            stmt = c.prepareStatement(sqlCode);
            stmt.setString(1, nim);
            stmt.setString(2, nama);
            stmt.setString(3, jk);
            stmt.setString(4, kelompok);
            mahasiswa = new Mahasiswa(nama, nim, jk, kelompok);
            stmt.executeUpdate();
        } catch (SQLException e) {
            //exception karena nim/ primary key ganda
            throw new Exception();
        }finally{
            if(c != null){
                try{
                    c.close();
                }catch(SQLException e){
                    System.out.println(e.getLocalizedMessage());
                }
            }
        }
        return mahasiswa;
    }

    
}