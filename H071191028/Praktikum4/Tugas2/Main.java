package Tugas2;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner pew = new Scanner(System.in);
      
        System.out.println("1. Pengurus inti");
        System.out.println("2. Koordinator");
        System.out.println("3. Staff");
        System.out.println();
        System.out.println("Pilih Bagian");
        int input = pew.nextInt();
        if(input==1){
            System.out.println("Masukkan data diri :");
            System.out.println("Nama :");
            pew.nextLine();
            String name = pew.nextLine();
            System.out.println("Prodi :");
            String prodi = pew.nextLine();
            System.out.println("NIM");
            String nim = pew.next();
            PengurusInti pengurus = new PengurusInti(name, prodi, nim);
            
            pengurus.showIdentity();
        }else if(input==2){
            System.out.println("Masukkan data diri :");
            System.out.println("Nama :");
            pew.nextLine();
            String name = pew.nextLine();
            System.out.println("Prodi :");
            String prodi = pew.nextLine();
            System.out.println("NIM :");
            String nim = pew.next();
            Koordinator koord = new Koordinator(name, prodi, nim);
            koord.showIdentity();
        }
        else if(input==3){
            System.out.println("Masukkan data diri :");
            System.out.println("Nama :");
            pew.nextLine();
            String name = pew.nextLine();
            System.out.println("Prodi :");
            String prodi = pew.nextLine();
            System.out.println("NIM :");
            String nim = pew.next();
            Staff staff = new Staff(name, prodi, nim);
            staff.showIdentity();
        }
    }
}