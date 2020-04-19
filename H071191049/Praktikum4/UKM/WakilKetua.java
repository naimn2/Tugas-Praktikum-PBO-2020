
public class WakilKetua extends PengurusInti{
    WakilKetua(){
        nama = pengurusIntis.get(1);
        jabatan = "Wakil Ketua";
        angkatan = 2019;
        tugas = "Membantu Ketua Menjalankan Visi Misinya";
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