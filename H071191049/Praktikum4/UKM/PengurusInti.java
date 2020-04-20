
public class PengurusInti extends Anggota{
    protected final String visiMisi = "Menyalurkan bakat dan minat pemrograman";
    @Override
    public void action() {
        super.action();
        System.out.println("[3] Tambah Rencana Kegiatan");
        System.out.println("[4] Hapus Rencana Kegiatan");
    }
    @Override
    protected void inputAction(int input) {
        super.inputAction(input);
        if(input==3){
            tambahKegiatan();
        }
        else if(input==4){
            hapusKegiatan();
        }
    }
    protected void tambahKegiatan(){
        System.out.println("=================================================");
        System.out.println("            TAMBAH RENCANA KEGIATAN");
        System.out.println("=================================================");
        System.out.print("Nama Kegiatan : ");
        String namaKegiatan = san.nextLine();
        System.out.println("Jadwal Kegiatan");
        System.out.printf("1. Tanggal\t: ");
        String tanggal = san.next();
        System.out.printf("2. Bulan\t: ");
        String bulan = san.next();
        System.out.printf("3. Tahun\t: ");
        String tahun = san.next();
        String jadwal = tanggal+"-"+bulan+"-"+tahun;
        san.nextLine();
        System.out.print("Tempat Kegiatan : ");
        String tempat = san.nextLine();
        kegiatan.add(new RencanaKegiatan(namaKegiatan, jadwal, tempat));
        
    }
    protected void hapusKegiatan(){
        
        daftarKegiatan();
        System.out.println("Pilih Kegiatan untuk dihapus");
        System.out.print("> ");
        System.out.println("=================================================");
        try {
            int inp = san.nextInt();
            kegiatan.remove(inp-1);
        } catch (Exception e) {
            System.out.println("Input tidak valid");
            daftarKegiatan();
        }
    }
    protected void showVisiMisi() {
        System.out.println("=================================================");
        System.out.println("                 VISI MISI");
        System.out.println("=================================================");
        System.out.println(visiMisi);
        akhiriPerintah();
    }
}