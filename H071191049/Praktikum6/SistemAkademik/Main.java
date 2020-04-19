import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner san = new Scanner(System.in);
        System.out.print("Nama ::> ");
        String name = san.nextLine();
        System.out.print("NIM ::> ");
        String nim = san.next();
        System.out.print("Kelas ::> ");
        String kelas = san.nextLine();
        System.out.println("Mata Kuliah");
        System.out.print("Nilai UTS ::> ");
        double nilaiUTS = san.nextDouble();
        System.out.print("Nilai UAS ::> ");
        double nilaiUAS = san.nextDouble();
    }
}