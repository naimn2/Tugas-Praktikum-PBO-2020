package com.ikhsan;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Mahasiswa {

    //untuk segera menampilkan perubahan dalam sel yg diedit 
    //Agar pembaharuan akan langsung tampil pada tabel
    private StringProperty nama = new SimpleStringProperty();
    private StringProperty nim = new SimpleStringProperty();
    private StringProperty kelompok = new SimpleStringProperty();
    private StringProperty jk = new SimpleStringProperty();

    Mahasiswa(){}

    Mahasiswa(String nama, String nim,String jk,String kelompok){
        this.nama.set(nama);
        this.nim.set(nim);
        this.jk.set(jk);
        this.kelompok.set(kelompok);
    }
    //Mereturn StringProperty
    StringProperty namaProperty(){
        return nama;
    }
    StringProperty nimProperty(){
        return nim;
    }
    StringProperty kelompokProperty(){
        return kelompok;
    }
    StringProperty jkProperty(){
        return jk;
    }
}