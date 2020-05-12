
public class Bendahara extends PengurusInti{
    private final int cash = 5000000;
    Bendahara(){
        nama = "Shiro";
        jabatan = pengurusIntis.get(3);
        angkatan = 2020;
        tugas = "Mengatur Keuangan";
    }
    @Override
    public void action() {
        super.action();
        System.out.println("[5] Cash");
        System.out.println("[6] Atur Biaya Acara");
        System.out.println("=================================================");
        input();
    }
    @Override
    protected void inputAction(int input) {
        super.inputAction(input);
        if(input==5){
            System.out.println("Cash : "+cash);
        }else if(input==6){
            aturBiayaAcara();
        }
    }
    private void aturBiayaAcara(){
        daftarKegiatan();
        int dana = 0;
        for (RencanaKegiatan rencanaKegiatan : kegiatan) {
            dana += rencanaKegiatan.getBiaya();
        }
        int sisaCash = cash-dana;
        if(kegiatan.size()!=0){
            System.out.println("=================================================");
            System.out.print("> ");
            try {
                int inp = san.nextInt();
                if(inp==0){
                    return;
                }
                System.out.print("Biaya Acara : ");
                int inp1= san.nextInt();
                if(inp1>sisaCash-kegiatan.get(inp-1).getBiaya()){
                    System.out.println("Cash Milik UKM Tidak Cukup");
                    return;
                }
                kegiatan.get(inp-1).setBiaya(inp1);
            } catch (Exception e) {
                System.out.println("Input tidak valid");
                aturBiayaAcara();
            }
        }
    }
}