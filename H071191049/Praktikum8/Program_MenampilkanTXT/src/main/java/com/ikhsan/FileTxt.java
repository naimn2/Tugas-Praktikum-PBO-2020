package com.ikhsan;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class FileTxt {
    Label titleTXT;
    TextArea textArea;

    Label getLabel(){
        titleTXT = new Label();
        titleTXT.setId("label");
        titleTXT.getStylesheets().add(App.class.getResource("Gaya.css").toExternalForm());
        return titleTXT;
    }
    
    TextArea getTextArea(){
        textArea = new TextArea(""); 
        textArea.setMinHeight(489);
        textArea.setId("areaStyle");
        textArea.getStylesheets().add(App.class.getResource("Gaya.css").toExternalForm());
        return textArea;
   }
    
   
    


    

}