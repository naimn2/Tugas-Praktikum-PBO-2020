public class Ketua extends PengurusInti{
    Ketua(){
        nama = pengurusIntis.get(0);
        jabatan = "Ketua";
        angkatan = 2019;
        tugas = "Memimpin Jalannya UKM";
    }

    @Override
    public void action() {
        super.action();
        System.out.println("[5] Visi Misi");
        System.out.println("=================================================");
        input();
    }
    @Override
    protected void inputAction(int input) {
        super.inputAction(input);
        if(input==5){
            visiMisi();
        }
    }
    public void visiMisi() {
        System.out.println("=================================================");
        System.out.println("                 VISI MISI");
        System.out.println("=================================================");
        System.out.println(visiMisi);
        akhiriPerintah();
    }

}