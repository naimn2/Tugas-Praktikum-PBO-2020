import java.util.ArrayList;
import java.util.Scanner;

class Pegawai{
    String name;
    int gaji = 2500000;

    public Pegawai(String name) {
        this.name = name;
    }

    public void showInfo() {
        System.out.println(this.name + " mendapatkan gaji Rp. " + this.gaji);
    }
}

class Dosen extends Pegawai {
    int sks;

    public Dosen(String name, int sks) {
        super(name);
        this.sks = sks;
    }

    public int getGaji() {
        return gaji + (this.sks * 120000);
    }

    public void showInfo() {
        System.out.println(this.name + " mendapatkan gaji Rp. " + this.getGaji());
    }
}

class Staff extends Pegawai {

    int kehadiran;

    public Staff(String name, int kehadiran) {
        super(name);
        this.kehadiran = kehadiran;
    }

    public int getGaji() {
        return gaji + (this.kehadiran * 50000);
    }

    public void showInfo() {
        System.out.println(this.name + " mendapatkan gaji Rp. " + getGaji());
    }
}

public class Main_1 {

    public static void main(String[] args) {
        Scanner sep = new Scanner(System.in);
        ArrayList <Pegawai> si = new ArrayList<>();

        int i = 0;
        while (i < 3) {
            System.out.print("Nama ::> ");
            String name = sep.next();
            System.out.println("1. Dosen");
            System.out.println("2. Staff");
            System.out.println("3. Pegawai Biasa");
            System.out.print("Jabatan : ");
            int jabatan = sep.nextInt();

            switch (jabatan) {
                case 1:
                System.out.print("Jumlah sks ::> ");
                int sks = sep.nextInt();
                Dosen dosen = new Dosen(name,sks);
                si.add(dosen);
                break;

                case 2:
                System.out.println("Jumlah kehadiran ::> ");
                int kehadiran = sep.nextInt();
                Staff staff = new Staff(name,kehadiran);
                si.add(staff);
                break;
                        
                case 3:
                Pegawai pegawai = new Pegawai(name);
                si.add(pegawai);

                default:
                break;
            }
            i++;
        }

        for (Pegawai pegawai : si) {
            pegawai.showInfo();
        }
    }
}

