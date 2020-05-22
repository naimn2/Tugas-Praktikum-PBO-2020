package Septi;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

public class Resto extends Application{
    
    private Label harga1, harga2, harga3, harga4, harga5;
    private CheckBox menu1, menu2, menu3, menu4, menu5;
    private GridPane gPane;
    private TextField tfJumlah1, tfJumlah2, tfJumlah3, tfJumlah4, tfJumlah5;
    private Button submitButton, proceedButton;
    private TextFlow tFlow;
    
    @Override
    public void start(Stage stage) throws Exception{

        stage.setTitle("Resto Aku");

        VBox boxJudul = new VBox();
        VBox vBox = new VBox();
        tFlow = new TextFlow();

        gPane = new GridPane();
        gPane.setPadding(new Insets(10,10,10,10));
        gPane.setVgap(3);
        gPane.setHgap(20);

        Label lJudul = new Label("DANBAM CAFE");
        lJudul.setFont(Font.font("Cooper",FontWeight.EXTRA_BOLD ,30));
        lJudul.setTextFill(Color.web("#D6CDA0"));
        boxJudul.getChildren().add(lJudul);
        boxJudul.setAlignment(Pos.CENTER);
        boxJudul.setStyle("-fx-background-color: #B49A38;");

        Label lMenu = new Label("DAFTAR MENU");
        lMenu.setFont(Font.font("Hannotate TC", FontWeight.BOLD,14));
        lMenu.setTextFill(Color.web("#7A7354"));
        gPane.add(lMenu,0,1);

        Label jumlahPesanan = new Label("Jumlah : ");
        jumlahPesanan.setFont(Font.font("Athelas",FontWeight.BOLD, 14));
        jumlahPesanan.setTextFill(Color.web("#8F8A77"));
        gPane.add(jumlahPesanan,2,1);

        Label lHarga = new Label("Harga");
        lHarga.setFont(Font.font("Athelas",FontWeight.BOLD,14));
        lHarga.setTextFill(Color.web("#8F8A77"));
        gPane.add(lHarga, 4, 1);

        //Menu 1 :
        menu1 = new CheckBox("Red Velvet Cake");
        tfJumlah1 = new TextField();
        harga1 = new Label("Rp. 250.000");

        menu1.setStyle("-fx-text-fill: #6F6641; ");
        menu1.setFont(Font.font("Candara", FontWeight.BOLD, 14));

        tfJumlah1.setFont(Font.font("Futura", FontWeight.BOLD,12));
        tfJumlah1.setPrefWidth(1);

        harga1.setFont(Font.font("Futura", FontWeight.BOLD, 12));
        harga1.setTextFill(Color.web("#6F6641"));

        gPane.add(menu1, 0, 2);
        gPane.add(tfJumlah1, 2, 2);
        gPane.add(harga1, 4, 2);

        //Menu 2 :
        menu2 = new CheckBox("Cheese Cake");
        tfJumlah2 = new TextField();
        harga2 = new Label("Rp. 200.000");

        menu2.setStyle("-fx-text-fill: #6F6641; ");
        menu2.setFont(Font.font("Candara",FontWeight.BOLD,14));

        tfJumlah2.setFont(Font.font("Futura",FontWeight.BOLD,12));
        tfJumlah2.setPrefSize(1,1);

        harga1.setFont(Font.font("Futura",FontWeight.BOLD,12));
        harga1.setTextFill(Color.web("#6F6641"));

        gPane.add(menu2, 0, 3);
        gPane.add(tfJumlah2, 2, 3);
        gPane.add(harga2, 4, 3);

        //Menu 3 :
        menu3 = new CheckBox("Cake Pop");
        tfJumlah3 = new TextField();
        harga3 = new Label("Rp. 50.000");

        menu3.setStyle("-fx-text-fill: #6F6641; ");
        menu3.setFont(Font.font("Candara", FontWeight.BOLD, 14));

        tfJumlah3.setFont(Font.font("Futura", FontWeight.BOLD, 12));
        tfJumlah3.setPrefSize(1, 1);

        harga3.setFont(Font.font("Futura", FontWeight.BOLD, 12));
        harga3.setTextFill(Color.web("#6F6641"));

        gPane.add(menu3, 0, 4);
        gPane.add(tfJumlah3, 2, 4);
        gPane.add(harga3, 4, 4);        
        
        //Menu 4 :
        menu4 = new CheckBox("Chocolate Cake");
        tfJumlah4 = new TextField();
        harga4 = new Label("Rp. 300.000");

        menu4.setStyle("-fx-text-fill: #6F6641; ");
        menu4.setFont(Font.font("Candara", FontWeight.BOLD, 14));

        tfJumlah4.setFont(Font.font("Futura", FontWeight.BOLD, 12));
        tfJumlah4.setPrefSize(1, 1);

        harga4.setFont(Font.font("Futura", FontWeight.BOLD, 12));
        harga4.setTextFill(Color.web("#6F6641"));

        gPane.add(menu4, 0, 5);
        gPane.add(tfJumlah4, 2, 5);
        gPane.add(harga4, 4, 5);        
        
        //Menu 5 :
        menu5 = new CheckBox("Green Tea Cake");
        tfJumlah5 = new TextField();
        harga5 = new Label("Rp. 230.000");

        menu5.setStyle("-fx-text-fill: #6F6641; ");
        menu5.setFont(Font.font("Candara", FontWeight.BOLD, 14));

        tfJumlah5.setFont(Font.font("Futura", FontWeight.BOLD, 12));
        tfJumlah5.setPrefSize(1, 1);

        harga5.setFont(Font.font("Futura", FontWeight.BOLD, 12));
        harga5.setTextFill(Color.web("#6F6641"));

        gPane.add(menu5, 0, 6);
        gPane.add(tfJumlah5, 2, 6);
        gPane.add(harga5, 4, 6);


        submitButton = new Button("Submit Order");
        submitButton.setOnAction(e-> itemOrder());

        submitButton.setFont(Font.font("Athelas", FontWeight.BOLD, 12));
        submitButton.setStyle("-fx-text-fill: #8F8A77; -fx-body-color: #5F5424; ");
        gPane.add(submitButton, 0, 10);
        
        gPane.setAlignment(Pos.BASELINE_LEFT);
        vBox.getChildren().addAll(boxJudul,gPane);

        StackPane sPane = new StackPane();

        Scene scene = new Scene(sPane, 450, 600);
        sPane.setStyle("-fx-background-color: #DBB925; ");
        sPane.getChildren().addAll(vBox);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

    }

    private void itemOrder() {
        
        Label iOrder = new Label("Pesanan : ");
        iOrder.setFont(Font.font("Athelas",12));
        iOrder.setTextFill(Color.web("#6F6641"));
        gPane.add(iOrder, 0, 12);

        // Menu 1 : 
        String jumlah1 = tfJumlah1.getText();
        String menuSatu = null;
        if (menu1.isSelected()){
            menuSatu = menu1.getText();
        }

        Text order1 = new Text();
        if (menuSatu != null){
            order1.setText(String.valueOf(String.format("\n%s%s", jumlah1, menuSatu)));
            order1.setFont(Font.font("Candara",12));
            order1.setFill(Color.web("#6F6641"));
        }else{
            order1.setText("");
        }

        // Menu 2 : 
        String jumlah2 = tfJumlah2.getText();
        String menuDua = null;
        if (menu2.isSelected()){
            menuDua = menu2.getText();
        }

        Text order2 = new Text();
        if (menuDua != null){
            order2.setText(String.valueOf(String.format("\n%s%s", jumlah2, menuDua)));
            order2.setFont(Font.font("Candara",12));
            order2.setFill(Color.web("#6F6641"));
        }else{
            order2.setText("");
        }
        
        // Menu 3 : 
        String jumlah3 = tfJumlah1.getText();
        String menuTiga = null;
        if (menu3.isSelected()){
            menuTiga = menu3.getText();
        }

        Text order3 = new Text();
        if (menuTiga!= null){
            order3.setText(String.valueOf(String.format("\n%s%s", jumlah3, menuTiga)));
            order3.setFont(Font.font("Candara",12));
            order3.setFill(Color.web("#6F6641"));
        }else{
            order3.setText("");
        }

        // Menu 4 : 
        String jumlah4 = tfJumlah4.getText();
        String menuEmpat = null;
        if (menu4.isSelected()){
            menuEmpat = menu4.getText();
        }

        Text order4 = new Text();
        if (menuEmpat != null){
            order4.setText(String.valueOf(String.format("\n%s%s", jumlah4, menuEmpat)));
            order4.setFont(Font.font("Candara",12));
            order4.setFill(Color.web("#6F6641"));
        }else{
            order4.setText("");
        }

        // Menu 5 : 
        String jumlah5 = tfJumlah5.getText();
        String menuLima = null;
        if (menu5.isSelected()){
            menuLima = menu5.getText();
        }

        Text order5 = new Text();
        if (menuLima != null){
            order5.setText(String.valueOf(String.format("\n%s%s", jumlah5, menuLima)));
            order5.setFont(Font.font("Candara",12));
            order5.setFill(Color.web("#6F6641"));
        }else{
            order5.setText("");
        }

        tFlow.getChildren().addAll(order1,order2,order3,order4,order5);
        gPane.add(tFlow, 0, 13);

        proceedButton = new Button("Proses");
        proceedButton.setFont(Font.font("Athleas",12));
        proceedButton.setStyle("-fx-text-fill: #8F8A77; -fx-body-color: #D2CBAE; ");
        proceedButton.setOnAction(e -> Bill());
        gPane.add(proceedButton, 0, 15);

    }

    private void Bill(){

        Label bill = new Label("BILL : ");
        bill.setFont(Font.font("Athleas",13));
        bill.setTextFill(Color.web("#8F8A77"));
        gPane.add(bill, 0, 19);

        int bill1, bill2, bill3, bill4, bill5;

        if (tfJumlah1.getText().isEmpty()){
            bill1 = 0;
        }else{
            bill1 = Integer.parseInt(tfJumlah1.getText());
        }


        if (tfJumlah2.getText().isEmpty()){
            bill2 = 0;
        }else{
            bill2 = Integer.parseInt(tfJumlah2.getText());
        }


        if (tfJumlah3.getText().isEmpty()){
            bill3 = 0;
        }else{
            bill3 = Integer.parseInt(tfJumlah3.getText());
        }


        if (tfJumlah4.getText().isEmpty()){
            bill4 = 0;
        }else{
            bill4 = Integer.parseInt(tfJumlah4.getText());
        }


        if (tfJumlah5.getText().isEmpty()){
            bill5 = 0;
        }else{
            bill5 = Integer.parseInt(tfJumlah5.getText());
        }

        double subTotal = (bill1*250000) + (bill2*200000) + (bill3*50000) + (bill4*300000) + (bill5*230000);
        double pajak = subTotal * (0.1);
        double total = subTotal + pajak;

        DecimalFormat idKurs = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols rp = new DecimalFormatSymbols();

        rp.setCurrencySymbol("Rp. ");
        rp.setMonetaryDecimalSeparator(',');
        rp.setGroupingSeparator('.');
        idKurs.setDecimalFormatSymbols(rp);

        Text stotal = new Text();
        stotal.setText(String.valueOf(String.format(" Subtotal  : %s,-", idKurs.format(subTotal))));
        stotal.setFont(Font.font("Candara", FontWeight.BOLD, 14));
        stotal.setFill(Color.web("#D2CBAE"));
        gPane.add(stotal, 0, 21);

        Text taxx = new Text();
        taxx.setText(String.valueOf(String.format(" Tax          : %s,-", idKurs.format(pajak))));
        taxx.setFont(Font.font("Calisto MT", FontWeight.BOLD, 14));
        taxx.setFill(Color.web("#D2CBAE"));
        gPane.add(taxx, 0, 22);

        Label totall = new Label();
        totall.setText(String.valueOf(String.format(" Total       : %s,- ", idKurs.format(total))));
        totall.setFont(Font.font("Calisto MT", FontWeight.EXTRA_BOLD, 14));
        totall.setTextFill(Color.web("#D2CBAE"));
        totall.setStyle("-fx-background-color: #8F8A77");
        gPane.add(totall, 0, 24);

    }

    public static void main(String[] args) {
        launch(args);
    }
}