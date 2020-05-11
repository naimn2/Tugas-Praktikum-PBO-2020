package com.ikhsan;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class AddMenu {

    private Style style = new Style();
    void stageAddMahasiswa(TableView<Mahasiswa> studentTable) {
        
        Stage stage = new Stage();
        DataSource dataSource = new DataSource();
        
        //title
        Label label = new Label("TAMBAH MAHASISWA");
        label.setStyle(style.getStyle(1));
        HBox atas = new HBox(label);
        atas.setAlignment(Pos.CENTER);
        label.setPadding(new Insets(20, 0, 0, 0));

        //Menu Kiri
        //subtitle
        Label klpLabel = new Label("Kelompok");
        klpLabel.setStyle(style.getStyle(2));
        HBox klpBox = new HBox(klpLabel);
        klpBox.setAlignment(Pos.CENTER);

        //radio button
        ToggleGroup kTGroup = new ToggleGroup();
        RadioButton[] klpButtons = new RadioButton[4];
        for(int i=0;i<4;i++){
            klpButtons[i] = new RadioButton("Kelompok "+(i+1));
            klpButtons[i].setToggleGroup(kTGroup);
            klpButtons[i].setStyle(style.getStyle(6));
        }
        //pengatur layout kiri
        GridPane klpPane = new GridPane();
        klpPane.setVgap(25);
        klpPane.setHgap(30);
        klpPane.add(klpButtons[0], 0, 0);
        klpPane.add(klpButtons[1], 1, 0);
        klpPane.add(klpButtons[2], 0, 1);
        klpPane.add(klpButtons[3], 1, 1);

        //vbox menu kiri
        VBox kiri = new VBox(klpBox,klpPane);
        kiri.setPadding(new Insets(23, 0, 0, 30));
        kiri.setStyle(style.getStyle(3)); 
        kiri.setSpacing(20);
        kiri.setMinSize(402, 251);

        //Kanan
        //subtitle
        Label data = new Label("Data");
        data.setStyle(style.getStyle(2));
        HBox titl = new HBox(data);
        titl.setAlignment(Pos.CENTER);

        //label
        Label[] labelKanan = new Label[3];
        String[] val = {"NIM","Nama","Jenis Kelamin"};
        for (int i=0;i<labelKanan.length;i++) {
            labelKanan[i] = new Label(val[i]);
            labelKanan[i].setStyle(style.getStyle(7));
        }
        //texfield
        TextField nimTField = new TextField();
        nimTField.setStyle(style.getStyle(8));
        TextField namaTField = new TextField();
        namaTField.setStyle(style.getStyle(8));

        //radio button
        ToggleGroup jkTGroup = new ToggleGroup();
        RadioButton lakiButton = new RadioButton("Laki-Laki");
        lakiButton.setStyle(style.getStyle(9));
        RadioButton peremButton = new RadioButton("Perempuan");
        peremButton.setStyle(style.getStyle(9));
        lakiButton.setToggleGroup(jkTGroup);
        peremButton.setToggleGroup(jkTGroup);

        //pengatur layout kanan
        GridPane gridPane = new GridPane();
        gridPane.add(labelKanan[0], 0, 0);
        gridPane.add(nimTField, 1, 0);
        gridPane.add(labelKanan[1], 0, 1);
        gridPane.add(namaTField, 1, 1);
        gridPane.add(labelKanan[2], 0, 2);
        gridPane.add(lakiButton, 1, 2);
        gridPane.add(peremButton, 1, 3);
        gridPane.setHgap(12);
        gridPane.setVgap(9);

        //vbox kanan
        VBox kanan = new VBox(titl, gridPane);
        kanan.setSpacing(10);
        kanan.setMinSize(402, 251);
        kanan.setStyle(style.getStyle(4)); 
        kanan.setPadding(new Insets(23, 0, 0, 30));

        //HBOX kiri+kanan
        HBox tengah = new HBox(kiri, kanan);
        tengah.setPadding(new Insets(0, 39, 0, 39));
        tengah.setSpacing(23);

        //Button simpan
        Button button = new Button("Simpan");
        button.setStyle(style.getStyle(5));
        button.setMinSize(110, 40);
        HBox bawah = new HBox(button);
        bawah.setAlignment(Pos.CENTER_RIGHT);
        bawah.setPadding(new Insets(0, 15, 0, 0));
        
        //action Button Simpan
        button.setOnAction(e -> {
            String nama = null;
            String nim = null;
            String jk = null;
            String klp = null;

            //Memberi value
            nim = nimTField.getText();
            nama = namaTField.getText();

            if (klpButtons[0].isSelected()){
                klp = "Kelompok 1";
            }
            else if (klpButtons[1].isSelected()){
                klp = "Kelompok 2";
            }
            else if (klpButtons[2].isSelected()){
                klp = "Kelompok 3";
            }  
            else if (klpButtons[3].isSelected()){
                klp = "Kelompok 4";
            }

            if (peremButton.isSelected()) {
                jk = "Perempuan";
            }else if (lakiButton.isSelected()) {
                jk = "Laki-laki";
            }

            //check
            if(nama.equals("")){
                allertError("Nama kosong");
            }else if(nim.equals("")){
                allertError("NIM kosong");
            }else if(jk.equals("")){
                allertError("Jenis Kelamin kosong");
            } else if(klp == null){
                allertError("kelompok kosong");
            }else{
                try {
                    //menambah nilai ke tableview dan database
                    studentTable.getItems().add(dataSource.addValue(nama, nim, jk, klp));
                    infoBox(nama, nim, jk, klp);
                    stage.close();
                }catch (Exception e1) {
                    allertError("NIM Sudah Ada");
                }
            }
        });

        //Layout utama
        VBox menu = new VBox(atas,tengah,bawah);
        menu.setSpacing(18);
        menu.setStyle("-fx-background-color: #34B4CD");

        Scene scene1 = new Scene(menu, 900, 400);
        stage.setScene(scene1);
        stage.setTitle("Form Tambah Mahasiswa");
        stage.setResizable(false);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
    }
    
    private void infoBox(String nama, String nim, String jk, String klp){
        Stage info = new Stage();
        Label berhasil = new Label("MENAMBAH DATA BERHASIL");
        berhasil.setStyle(style.getStyle(10));;
        berhasil.setPadding(new Insets(0, 0, 10, 0));

        Label namaLabel = new Label("Nama : "+ nama);
        namaLabel.setStyle(style.getStyle(11));
        Label nimLabel = new Label("NIM : "+ nim);
        nimLabel.setStyle(style.getStyle(11));
        Label jkLabel = new Label("Jenis Kelamin : "+ jk); 
        jkLabel.setStyle(style.getStyle(11));
        Label klpLabel = new Label("Kelompok : "+ klp);
        klpLabel.setStyle(style.getStyle(11));
        VBox vBox = new VBox(namaLabel, nimLabel, jkLabel, klpLabel);
        vBox.setAlignment(Pos.CENTER);
        vBox.setStyle("-fx-background-color:white;");
        vBox.setPadding(new Insets(5, 5, 5, 5));

        Button okBtn = new Button("OK");
        okBtn.setPrefSize(100, 40);
        okBtn.setStyle(style.getStyle(12));

        VBox vbox = new VBox(berhasil, vBox, okBtn);
        vbox.setSpacing(15);
        vbox.setStyle("-fx-background-color:#E34D52;-fx-background-radius:15");
        vbox.setAlignment(Pos.CENTER);
        Scene scene = new Scene(vbox, 500, 360);
        info.initStyle(StageStyle.TRANSPARENT);
        info.initModality(Modality.APPLICATION_MODAL);
        info.setScene(scene);
        info.show();
        okBtn.setOnAction(act->{
            info.close();
        });
    }
    
    private void allertError(String error){
        Alert alert = new Alert(AlertType.WARNING);
        alert.setTitle(null);
        alert.setHeaderText(null);
        alert.setContentText("Maaf "+error);
        alert.initStyle(StageStyle.TRANSPARENT);
        alert.showAndWait();
    }
}