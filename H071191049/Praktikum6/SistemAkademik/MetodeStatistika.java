
public class MetodeStatistika extends MataKuliah{
    MetodeStatistika(){
        name = "Metode Statistika";
        sks = 3;
    }
    @Override
    public void dosenKelas(char i) {
        super.dosenKelas(i);
        switch (i) {
            case 'A':
                dosen = "Bu Siti";
                break;
            case 'B':
                dosen = "Bu Titi";
                break;
            default:
                break;
        }
    }
}