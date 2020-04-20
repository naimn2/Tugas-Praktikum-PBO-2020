
public class LogikaKomputer extends MataKuliah{
    LogikaKomputer(){
        name = "Logika Komputer";
        sks = 3;
    }
    @Override
    public void dosenKelas(char i) {
        super.dosenKelas(i);
        switch (i) {
            case 'A':
                dosen = "Dra. Nur Erawaty, M.Si";
                break;
            case 'B':
                dosen = "Dr. Diaraya M.Ak";
                break;
            default:
                break;
        }
    }
}