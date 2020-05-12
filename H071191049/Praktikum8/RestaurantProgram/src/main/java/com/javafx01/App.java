package com.javafx01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.*;
/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        stage.setResizable(false);
        Mypath path = new Mypath();
        stage.setTitle("Restaurant-Bugis");
        Image icon = null;
        try {
            icon = new Image(new FileInputStream(path.getPath("icon.png")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        stage.getIcons().add(icon);
        Menu menu = new Menu();
        HBox layoutDasar = new HBox(menu.getLayout());
        Scene scene = new Scene(layoutDasar,660,496);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }

}