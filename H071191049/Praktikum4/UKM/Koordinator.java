import java.util.ArrayList;

public class Koordinator extends Anggota{
    protected ArrayList<String> anggotaBidang = new ArrayList<>();
    protected String bidang;
    Koordinator(){
        jabatan = "Koordinator";
    }
    @Override
    public void action() {
        super.action();
        System.out.println("[3] Anggota Bidang");
        System.out.println("[4] Atur Pelaksana Kegiatan");
        System.out.println("=================================================");
    }
    @Override
    protected void inputAction(int input) {
        super.inputAction(input);  
        if(input==3){
            daftarAnggotaBidang();
        }else if(input==4){
            setPelaksanaKegiatan();
        }
    }

    private void daftarAnggotaBidang(){
        if(anggotaBidang.size()==0){
            System.out.println("Tidak Ada Anggota");
        }else{
            System.out.println("=================================================");
            System.out.println("          ANGGOTA BIDANG"+bidang.toUpperCase());
            System.out.println("=================================================");
            for(int i=0;i<anggotaBidang.size();i++){
                System.out.printf("%d. %s\n",(i+1),anggotaBidang.get(i));
            }
        }
        akhiriPerintah();
    }
    private void setPelaksanaKegiatan(){
        daftarKegiatan();
        if(kegiatan.size()!=0){
            System.out.print("> ");
            try {
                int inp = san.nextInt();
                if(inp==0){
                    return;
                }
                if(anggotaBidang.size()==0){
                    System.out.println("Tidak Ada Anggota");
                }else{
                    System.out.println("=================================================");
                    System.out.println(" PILIH PETUGAS "+kegiatan.get(inp-1).getName().toUpperCase());
                    System.out.println(" Petugas Terpilih : ");
                    int j=1;
                    for (String petugasTerpilih : kegiatan.get(inp-1).getPelaksana()) {
                        System.out.println(j+petugasTerpilih);
                        j++;
                    }
                    System.out.println("=================================================");
                    for(int i=0;i<anggotaBidang.size();i++){
                        System.out.printf("%d. %s\n",(i+1),anggotaBidang.get(i));
                    }
                }
                System.out.print("> ");
                int inp1 = san.nextInt();
                san.nextLine();
                if(inp==0){
                    action();
                }
                for(int j=0;j<kegiatan.get(inp-1).getPelaksana().size();j++){
                    if(kegiatan.get(inp-1).getPelaksana().get(j).equalsIgnoreCase(anggotaBidang.get(inp1-1))){
                        System.out.println("Anggota ini memang bertugas di acara tsb");
                        setPelaksanaKegiatan();
                    }
                }
                kegiatan.get(inp-1).addPelaksana(anggotaBidang.get(inp-1));
            } catch (Exception e) {
                System.out.println("Input tidak valid");
                infoKegiatan();
            }
        }
    }
}