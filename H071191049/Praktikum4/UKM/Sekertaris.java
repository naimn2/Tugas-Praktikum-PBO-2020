
public class Sekertaris extends PengurusInti{
    Sekertaris(){
        nama = pengurusIntis.get(2);
        jabatan = "Sekertaris";
        angkatan = 2019;
        tugas = "Mengatur Berkas";
    }
    @Override
    public void action() {
        super.action();
        System.out.println("[5] Daftar Pengurus");
        System.out.println("=================================================");
        input();
    }
    @Override
    protected void inputAction(int input) {
        super.inputAction(input);
        if(input==5){
            daftarPengurus();
        }
    }
    private void daftarPengurus() {
        System.out.println("=================================================");
        System.out.println("                 PENGURUS UKM");
        System.out.println("=================================================");
        int i=1;
        for (String pengurusInti : pengurusIntis) {
            System.out.printf("%d. %s\n",i,pengurusInti);
            i++;
        }
        for (String koordinator : koordinators) {
            System.out.printf("%d. %s\n",i,koordinator);
            i++;
        }
        akhiriPerintah();
    }
}