import java.util.Scanner;
public class Main {
    static Scanner inp = new Scanner(System.in);
    static Boolean jalankan = true;
    static Double nilaiA;
    static Double nilaiB;
    static Double nilaiC;
    public static void main(String[] args) {
        Bangun bangun;
        while (jalankan) {
            System.out.println("---------------------------------");
            System.out.println("              MENU ");
            System.out.println("---------------------------------");
            System.out.println(" [1] Bangun Datar");
            System.out.println(" [2] Bangun Ruang");
            System.out.println(" [0] Keluar");
            System.out.println("---------------------------------");
            System.out.print(" > ");
            int pilih = -1;
            try {
                pilih = inp.nextInt();
            } catch (Exception e){
                inp.nextLine();
                System.out.println("Input tidak valid");
                continue;
            }
            switch (pilih) {
                case 1:
                    bangun = bangunDatar();
                    if (bangun == null) {
                        continue;
                    }
                    System.out.println("---------------------------------");
                    System.out.printf("Jenis \t: %s\n", bangun.getName());
                    System.out.printf("Luas \t: %.3f\n", bangun.getLuas());
                    System.out.println("---------------------------------");
                    jalankan = akhiriProgram();
                    break;
                case 2:
                    bangun = bangunRuang();
                    if (bangun == null) {
                        continue;
                    }
                    System.out.println("---------------------------------");
                    System.out.printf("Jenis \t: %s\n", bangun.getName());
                    System.out.printf("Volume \t: %.3f\n", bangun.getVolume());
                    System.out.println("---------------------------------");
                    jalankan = akhiriProgram();
                    break;
                case 0:
                    jalankan = akhiriProgram();
                    break;
                default:
                    System.out.println("Input Salah");
            }
        }
    }

    public static Boolean akhiriProgram(){
        System.out.println("Akhiri Program (Y/N)?");
        System.out.print("> ");
        String end = inp.next();
        if(end.equalsIgnoreCase("y")){
            return false;
        }
        else if(end.equalsIgnoreCase("n")){
            return true;
        }
        else{
            akhiriProgram();
        }
        return false;
    }

    public static Bangun bangunDatar() {
        System.out.println("---------------------------------");
        System.out.println("          BANGUN DATAR  ");
        System.out.println("---------------------------------");
        System.out.println(" [1] Persegi");
        System.out.println(" [2] Persegi Panjang");
        System.out.println(" [3] Lingkaran");
        System.out.println(" [4] Segitiga");
        System.out.println(" [5] Trapesium");
        System.out.println(" [6] Jajargenjang");
        System.out.println(" [7] Belah Ketupat");
        System.out.println(" [8] Layang-Layang");
        System.out.println(" [0] Kembali");
        System.out.println("---------------------------------");
        System.out.print(" > ");
        int pilih = -1;
        try {
            pilih = inp.nextInt();
            System.out.println("---------------------------------");
        } catch (Exception e){
            inp.nextLine();
            System.out.println("Input Salah");
            bangunDatar();
        }
        try {
            switch (pilih) {
                case 1:
                    System.out.print("Input Sisi : ");
                    nilaiA = inp.nextDouble();
                    return new Persegi(nilaiA);
                case 2:
                    System.out.print("Input Panjang : ");
                    nilaiA = inp.nextDouble();
                    System.out.print("Input Lebar : ");
                    nilaiB = inp.nextDouble();
                    return new PersegiPanjang(nilaiA, nilaiB);
                case 3:
                    System.out.print("Input Jari-jari : ");
                    nilaiA = inp.nextDouble();
                    return new Lingkaran(nilaiA);
                case 4:
                    System.out.print("Input Alas : ");
                    nilaiA = inp.nextDouble();
                    System.out.print("Input Tinggi : ");
                    nilaiB = inp.nextDouble();
                    return new Segitiga(nilaiA, nilaiB);
                case 5:
                    System.out.print("Input sisi Atas : ");
                    nilaiA = inp.nextDouble();
                    System.out.print("Input sisi Alas : ");
                    nilaiB = inp.nextDouble();
                    System.out.print("Input tinggi : ");
                    nilaiC = inp.nextDouble();
                    return new Trapesium(nilaiA, nilaiB, nilaiC);
                case 6:
                    System.out.print("Input Alas : ");
                    nilaiA = inp.nextDouble();
                    System.out.print("Input Tinggi : ");
                    nilaiB = inp.nextDouble();
                    return new Jajargenjang(nilaiA, nilaiB);
                case 7:
                    System.out.print("Input Diagonal : ");
                    nilaiA = inp.nextDouble();
                    return new BelahKetupat(nilaiA);
                case 8:
                    System.out.print("Input Diagonal 1 : ");
                    nilaiA = inp.nextDouble();
                    System.out.print("Input Diagonal 2 : ");
                    nilaiB = inp.nextDouble();
                    return new LayangLayang(nilaiA, nilaiB);
                case 0:
                    return null;
                default:
                    System.out.println("Input Salah");
                    bangunDatar();
            }
        } catch (Exception e) {
            System.out.println("Input Salah");
            inp.nextLine();
            bangunDatar();
        }
		return null;
    }

    public static Bangun bangunRuang() {
        System.out.println("---------------------------------");
        System.out.println("         Bangun Ruang");
        System.out.println("---------------------------------");
        System.out.println(" [1] Kubus");
        System.out.println(" [2] Balok");
        System.out.println(" [3] Bola");
        System.out.println(" [4] Tabung");
        System.out.println(" [5] Prisma Segitiga");
        System.out.println(" [6] Limas Segitiga");
        System.out.println(" [7] Limas Segiempat");
        System.out.println(" [8] Kerucut");
        System.out.println(" [0] Kembali");
        System.out.println("---------------------------------");
        System.out.print(" > ");
        int pilih = -1;
        try {
            pilih = inp.nextInt();
        } catch (Exception e){
            inp.nextLine();
            System.out.println("Input Salah");
            bangunRuang();
        }
        try {
            switch (pilih) {
                case 1:
                    System.out.print("Input Sisi : ");
                    nilaiA = inp.nextDouble();
                    return new Kubus(nilaiA);
                case 2:
                    System.out.print("Input lebar : ");
                    nilaiA = inp.nextDouble();
                    System.out.print("Input panjang : ");
                    nilaiB = inp.nextDouble();
                    System.out.print("Input tinggi");
                    nilaiC = inp.nextDouble();
                    return new Balok(nilaiA, nilaiB, nilaiC);
                case 3:
                    System.out.print("Input jari-jari : ");
                    nilaiA = inp.nextDouble();
                    return new Bola(nilaiA);
                case 4:
                    System.out.print("Input Panjang : ");
                    nilaiA = inp.nextDouble();
                    System.out.print("Input Jari-jari : ");
                    nilaiB = inp.nextDouble();
                    return new Tabung(nilaiA, nilaiB);
                case 5:
                    System.out.print("Input Sisi 1 Segitiga : ");
                    nilaiA = inp.nextDouble();
                    System.out.print("Input Sisi 2 Segitiga : ");
                    nilaiB = inp.nextDouble();
                    System.out.print("Input Tinggi Prisma : ");
                    nilaiC = inp.nextDouble();
                    return new PrismaSegitiga(nilaiA, nilaiB, nilaiC);
                case 6:
                    System.out.print("Input Alas Segitiga : ");
                    nilaiA = inp.nextDouble();
                    System.out.print("Input Tinggi Segitiga : ");
                    nilaiB = inp.nextDouble();
                    System.out.print("Input Tinggi Limas : ");
                    nilaiC = inp.nextDouble();
                    return new LimasSegitiga(nilaiA, nilaiB, nilaiC);
                case 7:
                    System.out.print("Input Panjang Alas : ");
                    nilaiA = inp.nextDouble();
                    System.out.print("Input Lebar Alas : ");
                    nilaiB = inp.nextDouble();
                    System.out.print("Input Tinggi Prisma : ");
                    nilaiC = inp.nextDouble();
                    return new LimasSegiempat(nilaiA, nilaiB, nilaiC);
                case 8:
                    System.out.print("Input Jari-Jari : ");
                    nilaiA = inp.nextDouble();
                    System.out.print("Input Tinggi Kerucut : ");
                    nilaiB = inp.nextDouble();
                    return new Kerucut(nilaiA, nilaiB);
                case 0:
                    return null;
                default:
                    System.out.println("Input Salah");
                    bangunRuang();
            }
        } catch (Exception ae) {
            System.out.println("Input Salah");
            inp.nextLine();
            bangunRuang();
        }
        return null;
    }
}
