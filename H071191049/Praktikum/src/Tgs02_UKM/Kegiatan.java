package Tgs02_UKM;

public class Kegiatan {
    String name;
    String waktu;
    String tujuan;
    String tempat;
    int biaya;

    public String getName(){
        return name;
    }
    public void getInfo(){
        System.out.println("NAMA KEGIATAN : "+name);
        System.out.println("TUJUAN KEGIATAN : "+tujuan);
        System.out.println("WAKTU KEGIATAN : "+waktu);
        System.out.println("TEMPAT KEGIATAN : "+tempat);
        System.out.println("BIAYA KEGIATAN : "+biaya);
    }
    public void setPetugas(){

    }
    public void newKegiatan(String name, String tujuan, String waktu, String tempat){
        this.name = name;
        this.tujuan = tujuan;
        this.waktu = waktu;
        this.tempat = tempat;
    }

    public void setBiaya(int biaya){
        this.biaya = biaya;
    }

}