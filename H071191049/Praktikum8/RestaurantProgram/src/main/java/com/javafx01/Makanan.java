package com.javafx01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class Makanan {
    private String name;
    private int price;
    private String imagePath;
    private Mypath path = new Mypath();
    int jumlah;
    

    public void setJumlah(int jumlah){
        this.jumlah = jumlah;
    }
    public Makanan(String name, int price, String imagePath) {
        this.name = name;
        this.price = price;
        this.imagePath = imagePath;
    }

    public void tambah(){
        jumlah++;
    }
    public void kurang(){
        if(jumlah>0){
            jumlah--;
        }  
    }
    public int getJumlah(){
        return jumlah;
    }

    ImageView getImage() {
        Image image = null;
        try {
            image = new Image(new FileInputStream(path.getPath()+imagePath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ImageView imageView = new ImageView(image);        
        return imageView;
    } 
    Label getName(){
        Label labelName = new Label(name);
        return labelName;
    }
    Label getPrice(){
        Label labelPrice = new Label(path.toRp(price));
        
        return labelPrice;
    }
    int getHarga(){
        return price;
    }
    

    Button getMinButton(){
        Button min = new Button("-");
        min.setMaxSize(16, 12);
        min.setId("minButton");
        min.getStylesheets().add(Makanan.class.getResource("Gaya.css").toExternalForm());
        return min;
    
    }
    Button getMaxButton(){
        Button max = new Button("+");
        max.setMaxSize(16, 12);
        max.setId("maxButton");
        max.getStylesheets().add(Makanan.class.getResource("Gaya.css").toExternalForm());
        return max;

    }
}
