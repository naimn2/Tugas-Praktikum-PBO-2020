package com.javafx01;

import java.io.*;
import java.util.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Menu {
	private DataSource datasource = new DataSource();
    private List<Makanan> makanan = datasource.getDaftarMakanan();
    private Pesanan pesanan = new Pesanan();

    
    HBox getLayout(){
        HBox vbb = new HBox();
        vbb.getChildren().add(0,layoutMenu());
        vbb.getChildren().add(1,pesanan.getLayout());
        return vbb;   
    }

    private VBox layoutMenu(){
        VBox menuLayout = new VBox(getTitle(),getMenuMakanan());
        menuLayout.setPrefWidth(465);
        menuLayout.setStyle("-fx-background-color: #F9F9F9");
        return menuLayout;
    }

    private HBox getTitle(){
        Mypath path = new Mypath();
        Image image = null;
        try {
            image = new Image(new FileInputStream(path.getPath()+"Logo.png"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(308);
        imageView.setFitHeight(55);
        VBox inCenter = new VBox(imageView);
        inCenter.setAlignment(Pos.CENTER);
        HBox title = new HBox(inCenter);
        title.setAlignment(Pos.CENTER);
        title.setMinHeight(80);
        title.setPrefWidth(455);
        return title;
    }
    
    private ScrollPane getMenuMakanan(){
        FlowPane daftarMenu = new FlowPane();
        daftarMenu.setPadding(new Insets(20, 15, 20, 15));
        daftarMenu.setVgap(20);
        daftarMenu.setHgap(12);
       // daftarMenu.setPrafWrapLength(455);
        daftarMenu.setPrefWidth(447);
        for(int i=0;i<makanan.size();i++){
            final int thisis = i;
            Button makananButton = new Button();
            makananButton.setId("imageButton");
            makananButton.getStylesheets().add(Makanan.class.getResource("Gaya.css").toExternalForm());
            makananButton.setMinSize(130,130);
            makananButton.setGraphic(makanan.get(i).getImage());
            makananButton.setCursor(Cursor.HAND);

            //melemparkan  makanan ke pesanan
            makananButton.setOnAction(act->{
                pesanan.addPilihan(makanan.get(thisis));
            });

            Label price = makanan.get(i).getPrice();
            price.setStyle("-fx-font-size:14;-fx-font-family:'Calibri';-fx-text-fill:#707070;-fx-font-weight: bold");
            Label name = makanan.get(i).getName();
            name.setStyle("-fx-font-size:14;-fx-font-family:'Calibri';-fx-text-fill:#707070");
            VBox buttonMenu = new VBox(makananButton,name,price);
            buttonMenu.setMaxHeight(168);
            buttonMenu.setMaxWidth(130);
            daftarMenu.getChildren().add(buttonMenu);
        }

        ScrollPane scrollMenu = new ScrollPane();
        scrollMenu.setBorder(null);
        scrollMenu.setContent(daftarMenu);
        scrollMenu.setPrefWidth(460);
        scrollMenu.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
        scrollMenu.setStyle("-fx-background-color:#F9F9F9;-fx-border-color:transparent;");
        return scrollMenu;
    }
}