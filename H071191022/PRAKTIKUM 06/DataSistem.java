import java.util.Scanner;

abstract class Matkul{

    static private String[] listMatkul = {
        "Pemrograman Berorientasi Objek",
        "Bahasa Inggris",
        "Matematika Dasar II",
        "Wawasan IPTEKS", 
        "Kewarganegaraan",
        "Aljabar Linear", 
        "Metode Statistika",
        "Logika Komputer",
        "Technopreneurship"
    };

    static public void showListMatkul() {
        for (String s : listMatkul)
            System.out.println("-> " + s);
    }


    public abstract String getNama();
    public abstract String getDosen();
    public abstract int getSks();
}

class AljabarLinear extends Matkul{

    @Override
    public String getNama() {
        return "Aljabar Linear";
    }

    @Override
    public String getDosen() {
        return "Dr. Nurdin, S.Si., M.Si.";
    }

    @Override
    public int getSks() {
        return 3;
    }
}

class BahasaInggris extends Matkul{

    @Override
    public String getNama() {
        return "Bahasa Inggris";
    }

    @Override
    public String getDosen() {
        return "Sukmawati Marzuki";
    }

    @Override
    public int getSks() {
        return 2;
    }

}

class Ipteks extends Matkul{

    @Override
    public String getNama() {
        return "Wawasan Ipteks";
    }

    @Override
    public String getDosen() {
        return "Dr. Sri Suryani, DEA";
    }

    @Override
    public int getSks() {
        return 2;
    }

}
class Kewarganegaraan extends Matkul{

    @Override
    public String getNama() {
        return "Kewarganegaraan";
    }

    @Override
    public String getDosen() {
        return "Pak Irham";
    }

    @Override
    public int getSks() {
        return 2;
    }

}

class LogikaKomputer extends Matkul{

    @Override
    public String getNama() {
        return "Logika Komputer";
    }

    @Override
    public String getDosen() {
        return "Andi Muhammad Anwar, S.Si., M.Si.";
    }

    @Override
    public int getSks() {
        return 3;
    }
}

class Matdas_2 extends Matkul{

    @Override
    public String getNama() {
        return "Matematika Dasar II";
    }

    @Override
    public String getDosen() {
        return "Dr. Armin Lawi, S.Si., M.Si.";
    }

    @Override
    public int getSks() {
        return 3;
    }
}

class MetodeStatistika extends Matkul{

    @Override
    public String getNama() {
        return "Metode Statistika";
    }

    @Override
    public String getDosen() {
        return "Dr. Nurtiti Sunusi, S.Si., M.Si.";
    }

    @Override
    public int getSks() {
        return 3;
    }
}

class Pbo extends Matkul{

    @Override
    public String getNama() {
        return "Pemrograman Berorientasi Objek";
    }

    @Override
    public String getDosen() {
        return "Supri Amir, ST. MS.i";
    }

    @Override
    public int getSks() {
        return 3;
    }
}

class Technopreneurship extends Matkul {

    @Override
    public String getNama() {
        return "Technopreneurship";
    }

    @Override
    public String getDosen() {
        return "Dr. Diaraya, M.Ak.";
    }

    @Override
    public int getSks() {
        return 3;
    }
}

class DataSistem {

    static String namaMataKuliah;
    static String dosen;
    static int sks;
    static boolean matkulSalah;

    public static void main(String[] args) throws Exception {   

        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.print("\nNama         => ");
            String nama = sc.nextLine();
            System.out.print("NIM          => ");
            String nim = sc.nextLine();
            System.out.print("Mata Kuliah  => ");
            String matkul = sc.nextLine();
            getDataMatkul(matkul);
    
            while (matkulSalah) {
                System.out.print("Mata Kuliah  => ");
                matkul = sc.nextLine();
                getDataMatkul(matkul);
            }

            System.out.print("Nilai UTS    => ");
            double uts = sc.nextDouble();
            System.out.print("Nilai UAS    => ");
            double uas = sc.nextDouble();
            sc.nextLine();
            
            showData(nama, nim, matkul, uts, uas);
            resetData();

            // while (true) {
            //     System.out.print("Apakah anda ingin lanjut (y/n)?\n => ");
            //     String yesOrNo = sc.nextLine();
            //     if (yesOrNo.equalsIgnoreCase("y")) break;
            //     else if (yesOrNo.equalsIgnoreCase("n")) return;
            //     else System.out.println("Tolong input \"y\" atau \"n\"");
            // }
        }
    }

    static void showData(String nama, String nim, String matkul, double uts, double uas) {
        getDataMatkul(matkul);
        if (matkulSalah) return;
        System.out.println("\nSISTEM AKADEMIK");
        System.out.println("-------------------------------------------------");
        System.out.println("Nama        : " + nama);
        System.out.println("NIM         : " + nim);
        System.out.println("Mata Kuliah : " + namaMataKuliah);
        System.out.println("SKS         : " + sks);
        System.out.println("Dosen       : " + dosen);
        System.out.println("Nilai UTS   : " + uts);
        System.out.println("Nilai UAS   : " + uas);
        System.out.println("Nilai Akhir : " + (uts + uas) / 2);
        System.out.println("Angka Mutu  : " + getAngkaMutu((uts + uas) / 2));
        System.out.println("-------------------------------------------------\n");
    }

    static void getDataMatkul(String matkul) {
        matkulSalah = false;
        if (matkul.equalsIgnoreCase("Pemrograman Berorientasi Objek")) {
            Matkul mataKuliah = new Pbo();
            setData(mataKuliah);
        } else if (matkul.equalsIgnoreCase("Bahasa Inggris")) {
            Matkul mataKuliah = new BahasaInggris();
            setData(mataKuliah);
        } else if (matkul.equalsIgnoreCase("Matematika Dasar II")) {
            Matkul mataKuliah = new Matdas_2();
            setData(mataKuliah);
        } else if (matkul.equalsIgnoreCase("Wawasan Ipteks")) {
            Matkul mataKuliah = new Ipteks();
            setData(mataKuliah);
        } else if (matkul.equalsIgnoreCase("Kewarganegaraan")) {
            Matkul mataKuliah = new Kewarganegaraan();
            setData(mataKuliah);
        } else if (matkul.equalsIgnoreCase("Aljabar Linear")) {
            Matkul mataKuliah = new AljabarLinear();
            setData(mataKuliah);
        } else if (matkul.equalsIgnoreCase("Metode Statistika")) {
            Matkul mataKuliah = new MetodeStatistika();
            setData(mataKuliah);
        } else if (matkul.equalsIgnoreCase("Logika Komputer")) {
            Matkul mataKuliah = new LogikaKomputer();
            setData(mataKuliah);
        } else if (matkul.equalsIgnoreCase("Technopreneurship")) {
            Matkul mataKuliah = new Technopreneurship();
            setData(mataKuliah);
        } else {
            matkulSalah = true;
            System.out.println("\nMaaf mata kuliah \"" + matkul + "\", tidak ada dalam daftar mata kuliah.");
            System.out.println("Silahkan input mata kuliah dibawah ini :");
            Matkul.showListMatkul();
        }
    }

    static void setData(Matkul mataKuliah) {
        namaMataKuliah = mataKuliah.getNama();
        dosen = mataKuliah.getDosen();
        sks = mataKuliah.getSks();
    }

    static void resetData() {
        namaMataKuliah = null;
        dosen = null;
        sks = 0;
    }

    static String getAngkaMutu(double nilaiAkhir) {
        if (nilaiAkhir >= 85) return "A";
        else if (nilaiAkhir >= 80) return "A-";
        else if (nilaiAkhir >= 75) return "B+";
        else if (nilaiAkhir >= 70) return "B";
        else if (nilaiAkhir >= 65) return "B-";
        else if (nilaiAkhir >= 60) return "C+";
        else if (nilaiAkhir >= 55) return "C";
        else if (nilaiAkhir >= 50) return "C-";
        else if (nilaiAkhir >= 40) return "D";
        else return "E";

    }

}