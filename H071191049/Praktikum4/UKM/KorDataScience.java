import java.util.Collections;
public class KorDataScience extends Koordinator {
    KorDataScience(){
        nama = koordinators.get(0);
        bidang = " Data Science";
        jabatan += bidang;
        angkatan = 2019;
        tugas = "Menkoordinatori Pengembangan Data Science";
        if (anggotaBidang.size() == 0) {
            Collections.addAll(anggotaBidang, "Kuroko", "Akainu", "Lemon","Rachel","Noster");
        }
    }
    @Override
    public void action() {
        super.action();
        input();
    }
}