import java.util.Scanner;
public class Main {
    static Scanner inp = new Scanner(System.in);
    static Boolean jalankan = true;
    static double nilaiA;
    static double nilaiB;
    static double nilaiC;
    static double nilaiD;
    static double nilaiE;
    static int dicari;
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
                    cariApa(pilih);
                    bangun = bangunDatar();
                    if (bangun == null) {
                        continue;
                    }
                    System.out.println("---------------------------------");
                    System.out.printf("Jenis    : %s\n", bangun.getName());
                    switch (dicari) {
                        case 1:
                            System.out.printf("Luas     : %f\n",bangun.getLuas());
                            break;
                        case 2:
                            System.out.printf("Keliling : %f\n",bangun.getKeliling());
                        default:
                            break;
                    }
                    System.out.println("---------------------------------");
                    jalankan = akhiriProgram();
                    break;
                case 2:
                    cariApa(pilih);
                    bangun = bangunRuang();
                    if (bangun == null) {
                        continue;
                    }
                    System.out.println("---------------------------------");
                    System.out.printf("Jenis          : %s\n", bangun.getName());
                    switch (dicari) {
                        case 1:
                            System.out.printf("Volume         : %f\n", bangun.getVolume());
                            break;
                        case 2:
                            System.out.printf("Luas Permukaan : %f\n", bangun.getLuasPermukaan());
                            break;
                        default:
                            break;
                    }
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
                    if(dicari==1){
                        System.out.print("Input Alas : ");
                        nilaiA = inp.nextDouble();
                        System.out.print("Input Tinggi : ");
                        nilaiB = inp.nextDouble();
                        return new Segitiga(nilaiA, nilaiB);
                    }else{
                        System.out.print("Input sisi1 : ");
                        nilaiA = inp.nextDouble();
                        System.out.print("Input sisi2 : ");
                        nilaiB = inp.nextDouble();
                        System.out.print("Input sisi3 : ");
                        nilaiC = inp.nextDouble();
                        return new Segitiga(nilaiA, nilaiB, nilaiC);
                    }
                case 5:
                    System.out.print("Input sisi Atas : ");
                    nilaiA = inp.nextDouble();
                    System.out.print("Input sisi Alas : ");
                    nilaiB = inp.nextDouble();
                    System.out.print("Input tinggi : ");
                    nilaiC = inp.nextDouble();
                    if(dicari==2){
                        System.out.print("Input sisiMiring : ");
                        nilaiD = inp.nextDouble();
                        return new Trapesium(nilaiA, nilaiB, nilaiC, nilaiD);
                    }
                    return new Trapesium(nilaiA, nilaiB, nilaiC);
                case 6:
                    System.out.print("Input Alas : ");
                    nilaiA = inp.nextDouble();
                    System.out.print(dicari==1?"Input Tinggi : ":"Input Sisi Miring : ");
                    nilaiB = inp.nextDouble();
                    return new Jajargenjang(nilaiA, nilaiB);
                case 7:
                    System.out.print(dicari==1?"Input Diagonal : ":"Input Sisi : ");
                    nilaiA = inp.nextDouble();
                    return new BelahKetupat(nilaiA);
                case 8:
                    System.out.print(dicari==1?"Input Diagonal 1 : ":"Input Sisi 1 : ");
                    nilaiA = inp.nextDouble();
                    System.out.print(dicari==1?"Input Diagonal 2 : ":"Input Sisi 2 : ");
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
                    System.out.print("Input Jari-jari : ");
                    nilaiB = inp.nextDouble();
                    if(dicari==2){
                        return new Tabung(nilaiB);
                    }
                    System.out.print("Input Panjang : ");
                    nilaiA = inp.nextDouble();
                    return new Tabung(nilaiA, nilaiB);
                case 5:
                    System.out.print("Input Sisi 1 Segitiga : ");
                    nilaiA = inp.nextDouble();
                    System.out.print("Input Sisi 2 Segitiga : ");
                    nilaiB = inp.nextDouble();
                    System.out.print("Input Tinggi Prisma : ");
                    nilaiC = inp.nextDouble();
                    if(dicari==2){
                        System.out.print("Input Sisi Alas Segitiga : ");
                        nilaiD = inp.nextDouble();
                        System.out.print("Input Tinggi Segitiga : ");
                        nilaiE = inp.nextDouble();
                        return new PrismaSegitiga(nilaiA, nilaiB, nilaiD, nilaiC, nilaiE);
                    }
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
    public static void cariApa(int pilih) {
        switch (pilih) {
            case 1:
                System.out.println("---------------------------------");
                System.out.println("[1] Luas Bangun Datar");
                System.out.println("[2] Keliling Bangun Datar");
                System.out.println("[0] Keluar");
                break;
            case 2:
                System.out.println("---------------------------------");
                System.out.println("[1] Volume Bangun Ruang");
                System.out.println("[2] Luas Permukaan Bangun Ruang");
                System.out.println("[0] Keluar");
                break;
            default:
                System.out.println("Input Tidak Valid");
                cariApa(pilih);
        }
        System.out.print("> ");
        int input = -1;
        try {
            input = inp.nextInt();
        } catch (Exception e){
            inp.nextLine();
            System.out.println("Input tidak valid");
            cariApa(pilih);
        }
        if(input!=2 && input!=1 && input!=0){
            System.out.println("Input Tidak Valid");
            cariApa(pilih);
        }else if(input==0){
            akhiriProgram();
        }else{
            dicari = input;
        }
    }
}
