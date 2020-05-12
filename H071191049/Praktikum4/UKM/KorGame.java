import java.util.Collections;
public class KorGame extends Koordinator {
    KorGame(){
        nama = koordinators.get(1);
        bidang = " Game";
        jabatan += bidang;
        angkatan = 2019;
        tugas = "Menkoordinatori Pengembangan Game";
        if (anggotaBidang.size() == 0) {
            Collections.addAll(anggotaBidang, "Bocil","Green Tea","Joker","Red Eye");
        }
        
    }
    @Override
    public void action() {
        super.action();
        input();
    }
}