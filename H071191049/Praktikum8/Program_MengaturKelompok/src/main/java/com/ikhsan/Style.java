package com.ikhsan;

public class Style {
    String getStyle(int i){
        String title = "-fx-text-fill:white;"
                        +"-fx-font-size:30;"
                        +"-fx-font-family:'arial';"
                        +"-fx-font-weight:bold;";
        String subtitle = "-fx-text-fill:#34B4CD;"
                            +"-fx-font-weight:bold;"
                            +"-fx-font-family:'arial';";
                            
        String box = "-fx-background-radius: 29;"
                +"-fx-border-radius: 29;"
                +"-fx-border-width: 3;"
                +"-fx-border-color: white;";
        String button = "-fx-background-color: #E34D52;"
                        +"-fx-border-radius: 25;"
                        +"-fx-background-radius: 25;"
                        +"-fx-text-fill: white;"
                        +"-fx-font-size: 23;"
                        +"-fx-font-family: 'Arial';";
        String tf = "-fx-background-radius: 15;"
                        +"-fx-border-radius: 15;"
                        +"-fx-border-width: 1;"
                        +"-fx-border-color: #34B4CD;"
                        +"-fx-background-color: white;"
                        +"-fx-font-size:16;"
                        +"-fx-font-family:'arial';"
                        +"-fx-text-fill: #34B4CD;";
        String infoSub = "-fx-font-family:'arial';"
                        +"-fx-font-weight:bold;";
        String button2 = "-fx-background-color:White;"
                        +"-fx-font-size:19;"
                        +"-fx-text-fill:#E34D52;"
                        +"-fx-font-weight:bold;"
                        +"-fx-border-radius:15;"
                        +"-fx-background-radius:15;";
    switch (i) {
        case 1:
            return title;
        case 2:
            return subtitle +"-fx-font-size:28;"; 
        case 3: 
            return box + "-fx-background-color: #E2FFD8;";
        case 4:
            return box +  "-fx-background-color: #FEFFEC;";
        case 5:
            return button;
        case 6:
            return subtitle  +"-fx-font-size:20;";
        case 7:
            return subtitle  +"-fx-font-size:18;";
        case 8:
            return tf;
        case 9:
            return subtitle  +"-fx-font-size:16;";
        case 10:
            return infoSub + "-fx-font-size:22;" + "-fx-text-fill: white;";
        case 11:
            return infoSub + "-fx-font-size:19;" + "-fx-text-fill: #352F2F;";
        case 12:
            return button2;
        default:
            break;
        }
        return null;
    }
    String getStyle2(int i){
        String title = "-fx-font-size: 23;"
                        +"-fx-font-family:'arial';"
                        +"-fx-text-fill:white;"
                        +"-fx-font-weight:bold;";
        String button = "-fx-background-color:white;"
                        +"-fx-border-radius: 20;"
                        +"-fx-background-radius: 20;"
                        +"-fx-text-fill: #34B4CD;"
                        +"-fx-font-size: 17;"
                        +"-fx-font-weight: bold;"
                        +"-fx-font-family: 'Arial';";
        
        switch (i) {
            case 1:
                return title;
            case 2:
                return button;
            default:
                break;
        }
        return null;
    }
}