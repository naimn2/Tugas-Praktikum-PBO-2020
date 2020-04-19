import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner san = new Scanner(System.in);
        while(true){
            System.out.println("========================================");
            System.out.println("      PROGRAM GAJI PEGAWAI UNHAS");
            System.out.println("========================================");
            System.out.println("[1] Pegawai");
            System.out.println("[2] Staf");
            System.out.println("[3] Dosen");
            System.out.println("[0] Keluar");
            try{
                System.out.print("> ");
                int key = san.nextInt();
                Pegawai pegawai;
                switch (key) {
                    case 1:
                        pegawai = new Pegawai();
                        pegawai.action();
                        output(pegawai); 
                        break;
                    case 2:
                        pegawai = new Staf();
                        pegawai.action();
                        output(pegawai);
                        break;
                    case 3:
                        pegawai = new Dosen();
                        pegawai.action();
                        output(pegawai);
                        break;
                    case 0:
                        san.close();
                        return;
                    default:
                        break;  
                }
            }catch(Exception e){
                san.nextLine();
                System.out.println("Input Tidak Valid");
                continue;
            }
        }
    }
    public static void output(Pegawai pegawai) {
        System.out.printf("%s mendapatkan gaji Rp.%d\n",pegawai.getName(),pegawai.getGaji());
    }
}