package com.javafx01;

import java.io.*;

public class Mypath {
    public String getPath(String name){
        String absolute=null;
        try {
            File f = new File("RestaurantProgram/src/main/java/com/javafx01/SumberData/"+name);
            absolute = f.getAbsolutePath(); 
        } catch (Exception e) {

        }
        return absolute;
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