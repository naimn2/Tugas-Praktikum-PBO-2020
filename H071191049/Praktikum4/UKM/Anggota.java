import java.util.*;
public class Anggota {
    protected String nama;
    protected String jabatan;
    protected int angkatan;
    protected String tugas;
    protected Scanner san = new Scanner(System.in);
    private boolean jalankan = true;
    protected DataSource dataSource = new DataSource();
    protected ArrayList<RencanaKegiatan> kegiatan = dataSource.getRencanaKegiatan();
    protected ArrayList<String> pengurusIntis = new ArrayList<>();
    protected ArrayList<String> koordinators = new ArrayList<>();
    Anggota(){
        if (pengurusIntis.size()==0){
            Collections.addAll(pengurusIntis, "Ikhsan","Kuro","Shiro","Gin");
        }
        if (koordinators.size()==0){
            Collections.addAll(koordinators, "Jack the Ripper","Hydra","Diablo");
        } 
    }
    public void action() {
        System.out.println("=================================================");
        System.out.println("                    ACTION");
        System.out.println("=================================================");
        System.out.println("[0] Kembali");
        System.out.println("[1] Status");
        System.out.println("[2] Daftar Kegiatan");
    }

    protected void showStatus(){
        System.out.println("=================================================");
        System.out.println("                   STATUS");
        System.out.println("=================================================");
        System.out.println("Nama     : "+nama);
        System.out.println("Jabatan  : "+jabatan);
        System.out.println("Angkatan : "+angkatan);
        System.out.println("Tugas    : "+tugas);
    } 
    protected void daftarKegiatan(){
        if(kegiatan.size()==0){
            System.out.println("Tidak Ada Rencana Kegiatan");
        }else{
            System.out.println("=================================================");
            System.out.println("              RENCANA KEGIATAN");
            System.out.println("=================================================");
            for(int i=0;i<kegiatan.size();i++){
                System.out.printf("[%d] %s \n",(i+1),kegiatan.get(i).getName());
            }
            System.out.println("[0] Kembali");
        }
    }
    protected void infoKegiatan() {
        daftarKegiatan();
        System.out.println("=================================================");
        if(kegiatan.size()!=0){
            System.out.print("> ");
            try {
                int inp = san.nextInt();
                if(inp==0){
                    return;
                }
                san.nextLine();
                kegiatan.get(inp-1).showInfo();
            } catch (Exception e) {
                san.nextLine();
                System.out.println("Input tidak valid");
                infoKegiatan();
            }
        }
        System.out.println();
        akhiriPerintah();
    }
    protected void inputAction(int input) {
        if(input==0){
            dataSource.saveData(kegiatan);
            jalankan=false;
        }
        else if(input==1){
            showStatus();
        }
        else if(input==2){
            infoKegiatan();
        }
    }
    
    protected void input() {
        System.out.print("> ");
        try {
            int inp = san.nextInt();
            san.nextLine();
            inputAction(inp);
        } catch (Exception e) {
            System.out.println("Input tidak valid");
            action();
        }
        if(jalankan==true){
            action();
        }
    }
    protected void akhiriPerintah(){
        System.out.println("<!> Tekan 0 Untuk Kembali");
        System.out.println("=================================================");
        while(true){
            try {
                System.out.print("> ");
                int inp = san.nextInt();
                san.nextLine();
                if(inp==0){
                    return;
                }else{
                    System.out.println("Input tidak valid");
                }
            } catch (Exception e) {
                System.out.println("Input tidak valid");
                san.nextLine();
            }
        }
    }
}