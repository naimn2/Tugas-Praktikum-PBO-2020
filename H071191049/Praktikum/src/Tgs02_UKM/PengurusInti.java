package Tgs02_UKM;
import java.util.ArrayList;
import java.util.Scanner;

public class PengurusInti extends Anggota {
    public ArrayList <Kegiatan> kegiatan;
    Scanner san = new Scanner(System.in);

    @Override
    public void action() {
        super.action();
        System.out.printf("\n==Pengurus Inti==");
        System.out.printf("\n[1]Ketua\n[2]Wakil Ketua\n[3]Sekertaris\n[4]Bendahara");
        int i = san.nextInt();
        switch (i) {
            case 1:
                Ketua ketua = new Ketua();
                ketua.action();
                break;
            case 2:
                WakilKetua wakilKetua = new WakilKetua();
                wakilKetua.action();
                break;
            case 3:
                Sekertaris sekertaris = new Sekertaris();
                sekertaris.action();
                break;
            case 4:
                Bendahara bendahara = new Bendahara();
                bendahara.action();
                break;
            default:
                break;
        }
    }

    protected void infoKegiatan(int i){
        kegiatan.get(i).getInfo();
    }

    protected void daftarKegiatan(){
        for(int i=0;i<kegiatan.size();i++){
            System.out.printf("[%d] %s", (i+1), kegiatan.get(i).getName());
        }
    }
}