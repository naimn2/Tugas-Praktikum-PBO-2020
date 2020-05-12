import java.util.Collections;
public class KorIOT extends Koordinator {
    KorIOT(){
        nama = koordinators.get(2);
        bidang = " IOT";
        jabatan += bidang;
        angkatan = 2020;
        tugas = "Menkoordinatori Pengembangan IOT";
        if (anggotaBidang.size() == 0) {
            Collections.addAll(anggotaBidang, "Hacker","Dark Hat");
        }
    }
    @Override
    public void action() {
        super.action();
        input();
    }
}