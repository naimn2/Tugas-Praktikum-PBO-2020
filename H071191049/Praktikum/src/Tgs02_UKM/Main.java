package Tgs02_UKM;
import java.util.Scanner;

public class Main {
    static Scanner san = new Scanner (System.in);
    public static void main(String[] args) {
        System.out.printf("\n== SELAMAT DATANG DI UKM PROGRAMMER ==");
        System.out.printf("\n[1] Pengurus Inti\n[2] Koordinator Staf Dan Bidang");
        System.out.printf("\n>");
        int i = san.nextInt();
        switch (i) {
            case 1:
                PengurusInti pengurusInti = new PengurusInti();
                pengurusInti.action();
                break;
            case 2:
                Koordinator koordinator = new Koordinator();
                koordinator.action();
                break;
            default:
                break;
        }
    }
}