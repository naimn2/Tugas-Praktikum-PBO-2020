package com.javafx01;

import java.util.*;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.scene.text.TextBoundsType;
import javafx.stage.StageStyle;

public class Pesanan{
    private StackPane circlePane = new StackPane();
    private VBox makananBox = new VBox();
    private VBox pesananTerpilihVBox = new VBox();
    private HBox totalHargaBox = new HBox();
    private List<Makanan> terpilih = new ArrayList<>();
    private List<HBox> infoBox = new ArrayList<>();
    private int totalHarga;
    private int totalPilihan;
    private Alert alert;
    private Mypath path = new Mypath();

    VBox getLayout(){
        VBox pesananLayout = new VBox();
        pesananTerpilihVBox.getChildren().clear();
        pesananLayout = new VBox();
        pesananTerpilihVBox.setMinHeight(384);
        pesananLayout.getChildren().addAll(getPesananTitle(),pesananTerpilihVBox,getButtonSend());
        pesananLayout.setPrefWidth(194);
        pesananLayout.setStyle("-fx-background-color: #34373F");
        return pesananLayout;
    }
    //menerima lemparan dari menu
    void addPilihan(Makanan makanan){
        if(!terpilih.contains(makanan)){
            makanan.setJumlah(1);
            terpilih.add(makanan);
            pesananTerpilihVBox.getChildren().clear();
            totalPilihan++;
            updtMakananBox();
            updtTotalHargaBox();
            updateCircle();
            updateAlert();
            pesananTerpilihVBox.setPrefSize(194, 384);
            pesananTerpilihVBox.getChildren().addAll(makananBox, totalHargaBox);
        }
    }
    //tulisan Pesanan
    private HBox getPesananTitle(){
        Label pesananAlertLabel = new Label("Pesanan");
        pesananAlertLabel.setStyle("-fx-font-family:'arial';-fx-font-size:21;-fx-text-fill:#F3F2F4;-fx-font-weight:bold");
        pesananAlertLabel.setPadding(new Insets(15, 0, 15, 17));
        updateCircle();
        HBox pesananAlertHBox = new HBox(pesananAlertLabel,circlePane);
        pesananAlertHBox.setSpacing(3);
        pesananAlertHBox.setAlignment(Pos.CENTER_LEFT);
        pesananAlertHBox.setPrefHeight(48);
        return pesananAlertHBox;
    }

    //circle
    private void updateCircle(){
        System.out.println(terpilih.size());
        if(terpilih.size()==0){
            circlePane.getChildren().clear();
            return;
        }
        Circle circle = new Circle();
        Text text = new Text(String.valueOf(totalPilihan));
        text.setBoundsType(TextBoundsType.VISUAL);
        text.setFill(Color.WHITE);
        text.setStyle("-fx-font-family:'arial';-fx-font-size:19;-fx-text-fill:#ffff;-fx-font-weight:Bold;");
        circle.setRadius(14);
        circle.setFill(Color.rgb(75, 158, 242));
        circlePane.getChildren().addAll(circle,text);
        circlePane.setStyle("-fx-background-color: transparent");
    }

    //
    private void updtMakananBox(){
        makananBox.getChildren().clear();
        infoBox.clear();
        totalHarga = 0;
        for(int i=0;i<terpilih.size();i++){  
            makananBox.getChildren().add(getObject(i));
        }
    }
    private HBox getObject(int i){
        totalHarga+=terpilih.get(i).getHarga()*terpilih.get(i).getJumlah();
        ImageView image = terpilih.get(i).getImage();
        image.setFitHeight(33);
        image.setFitWidth(33);
        Label name = terpilih.get(i).getName();
        name.setStyle("-fx-text-fill:#C7C8CC;-fx-font-family:'Segoe UI';-fx-font-size:9");
        infoBox.add(new HBox());
        makeObject(i);
        VBox vBoxInfo = new VBox(name,infoBox.get(i));
        vBoxInfo.setSpacing(4);
        HBox hbox = new HBox(image,vBoxInfo);
        hbox.setSpacing(5);
        hbox.setPadding(new Insets(8, 16, 8, 16));
        return hbox;
    }
    //memperbaharui infoBox
    private void makeObject(int i){
        Label info = new Label();
        info.setMaxSize(16, 18);
        info.setPrefWidth(16);
        info.setText(String.valueOf(terpilih.get(i).getJumlah()));
        info.setId("infoLabel");
        info.getStylesheets().add(Makanan.class.getResource("Gaya.css").toExternalForm());
        info.setAlignment(Pos.CENTER);
        Label sumMoney = new Label();
        sumMoney.setPrefSize(72, 12);
        sumMoney.setAlignment(Pos.CENTER_RIGHT);
        sumMoney.setStyle("-fx-text-fill:#C7C8CC;-fx-font-family:'Segoe UI';-fx-font-size:9;-fx-font-weight:bold");
        int sumPrice = terpilih.get(i).getJumlah()*terpilih.get(i).getHarga();
        sumMoney.setText(path.toRp(sumPrice));
        Button btnless = terpilih.get(i).getMinButton();
        Button btnplus = terpilih.get(i).getMaxButton();
        infoBox.get(i).getChildren().addAll(btnless,info,btnplus,sumMoney);
        final int jk = i;
        btnplus.setOnAction(act->{
            infoBox.get(i).getChildren().clear();
            terpilih.get(jk).tambah();
            makeObject(jk);
            totalHarga+=terpilih.get(i).getHarga();
            totalPilihan++;
            updateCircle();
        });
        btnless.setOnAction(act->{
            infoBox.get(jk).getChildren().clear();
            terpilih.get(jk).kurang();
            makeObject(jk);
            if(sumPrice>0){
                totalHarga-=terpilih.get(i).getHarga();
                totalPilihan--;
                updateCircle();
                updtTotalHargaBox();
            }
            if(terpilih.get(i).getJumlah()==0){
                terpilih.remove(i);
                updtMakananBox();
                updateAlert();
                updateCircle();
            }
        });
        updtTotalHargaBox();
    }

    private void updtTotalHargaBox(){
        totalHargaBox.getChildren().clear();
        if(totalHarga>0){
            Label totalHargaLabel = new Label();
            totalHargaLabel.setText("Total Harga  : "+path.toRp(totalHarga)); 
            totalHargaLabel.setPrefSize(160, 34);
            totalHargaLabel.setStyle("-fx-text-fill:#C7C8CC;-fx-font-size:9;-fx-background-color: #52535A;-fx-background-radius:4px;-fx-border-radius:15px;");
            totalHargaLabel.setPadding(new Insets(0, 0, 0, 11));
            totalHargaBox.getChildren().add(totalHargaLabel);
            totalHargaBox.setAlignment(Pos.CENTER);
        }
    } 
    

    //Kirim Pesanan
    private HBox getButtonSend(){
        updateAlert();
        Button sendButton = new Button("Kirim Pesanan");
        sendButton.setId("sendButton");
        sendButton.getStylesheets().add(Makanan.class.getResource("Gaya.css").toExternalForm());
        sendButton.setPrefSize(160, 32);
        HBox sendHBox = new HBox(sendButton);
        sendHBox.setPrefSize(194,64);
        sendHBox.setAlignment(Pos.CENTER);
        sendHBox.setPadding(new Insets(0, 0, 10, 0));
        sendButton.setOnAction(act->{
            alert.showAndWait();
        });
        return sendHBox;
    }
    private void updateAlert(){
        alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(null);
        alert.setHeaderText(null);
        if(terpilih.size()==0){
            alert.setAlertType(AlertType.WARNING);
            alert.setContentText("MAAF ANDA BELUM MEMILIH MENU");
        }else{
            alert.setContentText("TERIMA KASIH TELAH MEMESAN");
        }
        alert.initStyle(StageStyle.TRANSPARENT);  
    }
}