package com.javafx01;

public class Mypath {
    public String getPath(){
        return "D:/COMPUTER-SCIENCE/JAVA/CS-SEMESTER-2/Tugas-Praktikum-PBO/H071191049/Praktikum8/RestaurantProgram/src/main/java/com/javafx01/SumberData/";
    }
    public String toRp(int money){
        String harga = String.valueOf(money);
        String a = "";
        int j = 1;
        for(int i=harga.length()-1;i>=0;i--){
            a+=harga.charAt(i);
            if(j%3==0){
                a+=".";
            }
            j++;
        } 
        String hargaRp = "Rp";
        for(int i=a.length()-1;i>=0;i--){
            hargaRp += a.charAt(i);
        }
       return hargaRp;
    }
}