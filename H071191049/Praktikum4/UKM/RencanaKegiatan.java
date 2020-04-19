import java.util.ArrayList;
public class RencanaKegiatan {
    private String name;
    private String jadwal;
    private String tempat;
    private int biaya;
    private ArrayList<String> pelaksana = new ArrayList<>();

    RencanaKegiatan(String name, String jadwal, String tempat){
        this.name = name;
        this.jadwal = jadwal;
        this.tempat = tempat;
    }
    public void getInfo(){
        System.out.println("=================================================");
        System.out.println("               INFO KEGIATAN");
        System.out.println("=================================================");
        System.out.println("Nama       : "+name);
        System.out.println("Waktu      : "+jadwal);
        System.out.println("Tempat     : "+tempat);
        System.out.print("Biaya      : ");
        System.out.println(biaya==0?"Biaya Belum diatur Bendahara":biaya);
        System.out.print("Pelaksana  : ");
        showPelaksana();
    }
    public void showPelaksana(){
        if(pelaksana.size()==0){
            System.out.println("Belum Ada");
        }else{
            boolean awal = true;
            for(String pelaksana : pelaksana){
                System.out.print(awal?"":", ");
                System.out.print(pelaksana);
                awal = false;
            }
        }
    }
    public ArrayList<String> getPelaksana(){
        return pelaksana;
    }
    public void setBiaya(int biaya){
        this.biaya = biaya;
    }
    public String getName(){
        return name;
    }
    public String getWaktu(){
        return jadwal;
    }
    public String getTempat(){
        return tempat;
    }
    public int getBiaya(){
        return biaya;
    }
    public void addPelaksana(String anggota){
        pelaksana.add(anggota);
    }
    public void setPelaksana(ArrayList<String> anggota) {
        pelaksana = anggota;
    }
}