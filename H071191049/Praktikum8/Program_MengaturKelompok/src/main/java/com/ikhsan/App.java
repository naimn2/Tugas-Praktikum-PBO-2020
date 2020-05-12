package com.ikhsan;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application{   
    @Override
    public void start(Stage stage) {
        DataSource dataSource = new DataSource();
        AddMenu menu = new AddMenu();
        Style style = new Style();

        Label label = new Label("PEMBAGIAN KELOMPOK MAHASISWA ILKOM19");
        label.setStyle(style.getStyle2(1));
        HBox judul = new HBox(label);
        judul.setPadding(new Insets(20, 0, 0, 0));
        judul.setAlignment(Pos.CENTER);

        //setting table mahasiswa
        TableColumn <Mahasiswa, String> kolomNama = new TableColumn<>("Nama");
        TableColumn <Mahasiswa, String> kolomNIM = new TableColumn<>("NIM");
        TableColumn <Mahasiswa, String> kolomJk = new TableColumn<>("Jenis Kelamin");
        TableColumn <Mahasiswa, String> kolomKLP = new TableColumn<>("Kelompok");
       
        kolomNama.setMinWidth(150);
        kolomNIM.setMinWidth(150);
        kolomJk.setMinWidth(150);
        kolomKLP.setMinWidth(150);
        
        kolomNama.setCellValueFactory(mahasiswa -> mahasiswa.getValue().namaProperty());
        kolomNIM.setCellValueFactory(mahasiswa -> mahasiswa.getValue().nimProperty());
        kolomJk.setCellValueFactory(mahasiswa -> mahasiswa.getValue().jkProperty());
        kolomKLP.setCellValueFactory(mahasiswa -> mahasiswa.getValue().kelompokProperty());

        TableView <Mahasiswa> tabelMahasiswa = new TableView<>();
        tabelMahasiswa.setPlaceholder(new Label("Tabel Masih Kosong"));
        tabelMahasiswa.getColumns().addAll(kolomNama, kolomNIM, kolomJk, kolomKLP);
        //mamsukkan nilai slite ke tableview
        tabelMahasiswa.setItems(dataSource.getMahasiswaOList());
        

        //Hbox bagian bawah
        Button addBtn = new Button("Tambah");
        addBtn.setPrefSize(90, 35);
        addBtn.setStyle(style.getStyle2(2));

        addBtn.setOnAction(act->{
            //melemparkan table ke menu agar bisa ditambah
            menu.stageAddMahasiswa(tabelMahasiswa);
        });
        
        HBox hbox = new HBox(addBtn);
        hbox.setPadding(new Insets(0, 10, 0, 0));
        hbox.setAlignment(Pos.CENTER_RIGHT);

        VBox vbox = new VBox(judul, tabelMahasiswa, hbox );
        vbox.setStyle("-fx-background-color: #34B4CD;");
        vbox.setPadding(new Insets(0, 25, 25, 25));
        vbox.setSpacing(15);
        
        Scene scene = new Scene(vbox);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Program Pembagian Kelompok");
        Image icon = null;
        try {
            icon = new Image(new FileInputStream("src/main/java/com/ikhsan/klp.png"));
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        stage.getIcons().add(icon);
        stage.show();
    }

    public static void main(String[] args) 
    {
        launch();
    }
}

