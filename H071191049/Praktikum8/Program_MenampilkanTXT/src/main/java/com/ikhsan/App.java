package com.ikhsan;

import java.io.*;
import java.nio.file.Files;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        FileTxt fileTxt = new FileTxt();
        //bgian atas
        Button button = new Button("Select File");
        button.setPrefSize(187, 40);
        button.setAlignment(Pos.CENTER);
        button.setId("buttonStyle");
        button.getStylesheets().add(App.class.getResource("Gaya.css").toExternalForm());
        
        HBox bgianAtas = new HBox(button);
        bgianAtas.setPrefSize(516, 90);
        bgianAtas.setAlignment(Pos.CENTER);
        bgianAtas.setPadding(new Insets(10, 0, 6, 0));
        
        
        //bagian tengah
        HBox bgiantitle = new HBox(fileTxt.getLabel());
        bgiantitle.setId("title");
        bgiantitle.getStylesheets().add(App.class.getResource("Gaya.css").toExternalForm());
        bgiantitle.setMaxWidth(486);
        bgiantitle.setPrefHeight(20);
        bgiantitle.setAlignment(Pos.CENTER);
       
        button.setOnAction(act->{
            FileChooser fileChooser = new FileChooser();
            fileChooser.getExtensionFilters()
             .add(
                new FileChooser.ExtensionFilter("TXT files (*TXT files (*.TXT)", "*.TXT"));
            File file = fileChooser.showOpenDialog(null);
            if(file!=null){
                try {
                    Stream<String> lines = Files.lines(file.toPath());
                    String data = lines.collect(Collectors.joining("\n"));
                    lines.close();
                    fileTxt.textArea.clear();
                    fileTxt.textArea.setText(data);
                    fileTxt.titleTXT.setText(file.getName());
                } catch (Exception e) {
                }
            }
        });

        BorderPane bgianbawah = new BorderPane();
        bgianbawah.setCenter(fileTxt.getTextArea());
        bgianbawah.setMinSize(516, 666);
        bgianbawah.setPadding(new Insets(0, 15, 30, 15));

    
        VBox vbox = new VBox(bgianAtas,bgiantitle, bgianbawah);
        vbox.setId("latar");
        vbox.getStylesheets().add(App.class.getResource("Gaya.css").toExternalForm());
        vbox.setAlignment(Pos.CENTER);

        Scene scene = new Scene(vbox,516, 775);
        stage.setScene(scene);
        Image icon = null;
        try {
            icon = new Image(new FileInputStream("D:/COMPUTER-SCIENCE/JAVA/CS-SEMESTER-2/"
            +"Tugas-Praktikum-PBO/H071191049/Praktikum8/"
            +"PROGRAM_MENAMPILKANTXT/src/main/java/com/ikhsan/txtO.png"));
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        stage.getIcons().add(icon);
        stage.setTitle("TXT. OPENER");
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}