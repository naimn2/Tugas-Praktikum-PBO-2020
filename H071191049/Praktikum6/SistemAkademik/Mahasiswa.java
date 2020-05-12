import java.util.Scanner;
public class Mahasiswa {
    String name;
    String nim;
    String kelas;
    char kelasku;
    MataKuliah mataKuliah;
    Mahasiswa(String name, String nim, String kelas){
        this.name = name;
        this.nim = name;
        this.kelas = kelas;
        kelasku = kelas.charAt(kelas.length()-1);
    }
    public void updateData(){
        Scanner san = new Scanner(System.in);
        boolean jalankan = true;
        while(jalankan){
            System.out.println("Mata Kuliah");
            System.out.println("1. Aljabar Linear");
            System.out.println("2. Bahasa Inggris");
            System.out.println("3. Kewarganegaraan");
            System.out.println("4. Logika Komputer");
            System.out.println("5. Matematika Dasar II");
            System.out.println("6. Metode Statistika");
            System.out.println("7. Pemrograman Berbasis Objek");
            System.out.println("8. Technoprenership");
            System.out.println("9. Wawasan IPTEKS");
            int inpMataKuliah = -1;
            try{
            System.out.print("::>");
            inpMataKuliah = san.nextInt();
            }catch(Exception e){
                System.out.println("Input Salah");
                san.nextLine();
                continue;
            }
            mataKuliah = setMataKuliah(inpMataKuliah);
            if(mataKuliah==null){
                san.nextLine();
                continue;
            }else{
                jalankan=false;
            }
            mataKuliah.setKelasku(kelasku);
            System.out.print("Nilai UTS ::> ");
            double nilaiUTS = san.nextDouble();
            mataKuliah.setNilaiUTS(nilaiUTS);
            System.out.print("Nilai UAS ::> ");
            double nilaiUAS = san.nextDouble();
            mataKuliah.setNilaiUAS(nilaiUAS);
        }
    }
     
    private MataKuliah setMataKuliah(int inp) {
        switch(inp){
            case 1:
                return new AljabarLinear();
            case 2:
                return new BahasaInggris();
            case 3: 
                return new Kewarganegaraan();
            case 4: 
                return new LogikaKomputer();
            case 5:
                return new MatdasII();
            case 6: 
                return new MetodeStatistika();
            case 7:
                return new PBO();
            case 8:
                return new Technopreunership();
            case 9:
                return new WawasanIpteks();
            default:
                System.out.println("Input Salah");
                return null;
        }
    }
    public void output(){
        System.out.println("============================================================");
        System.out.println("                     SISTEM AKADEMIK");
        System.out.println("============================================================");
        System.out.println("Nim            : "+nim);
        System.out.println("Nama           : "+mataKuliah.getName());
        System.out.println("SKS            : "+mataKuliah.getSks());
        System.out.println("Dosen          : "+mataKuliah.getDosen());
        System.out.println("Nilai UTS      : "+mataKuliah.getNilaiUTS());
        System.out.println("Nilai UAS      : "+mataKuliah.getNilaiUAS());
        System.out.println("Nilai Akhir    : "+mataKuliah.getNilaiAkhir());
        System.out.println("Angka Mutu     : "+mataKuliah.getAngkaMutu());
        System.out.println("============================================================");

    }
}