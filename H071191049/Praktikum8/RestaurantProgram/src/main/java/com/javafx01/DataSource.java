package com.javafx01;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.ArrayList;

public class DataSource {
    private String read (String name){
        Mypath mypath = new Mypath();
        Path path = Paths.get(mypath.getPath(name));
        String fileContent = null;
        try {
            fileContent = new String(Files.readAllBytes(path));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return fileContent;
    }
    public ArrayList<Makanan> getDaftarMakanan(){
        String input = read("DaftarMakanan.txt");
        String [] makananContent = input.split("\\r?\\n");
        ArrayList<Makanan> makanan = new ArrayList<>();
        for(int i=0;i<makananContent.length;i++){
            String[] makananPart = makananContent[i].split(";");
            makanan.add(new Makanan(makananPart[0],Integer.valueOf(makananPart[1]),makananPart[2]));
        }
        return makanan;
    }
    
}