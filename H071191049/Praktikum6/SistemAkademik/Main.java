import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner san = new Scanner(System.in);
        System.out.print("Nama                 ::> ");
        String name = san.nextLine();
        System.out.print("NIM                  ::> ");
        String nim = san.nextLine();
        boolean salah = true;
        String kelas = null;
        while(salah){
            System.out.print("Kelas (ex: Ilkomp-A) ::> ");
            kelas = san.nextLine();
            char kode = kelas.charAt(kelas.length()-1);
            char pemisah = kelas.charAt(kelas.length()-2);
            if((kode=='A'||kode=='B'||kode=='a'||kode=='b')&&pemisah=='-'){
                salah = false;
            }else{
                System.out.println("Kelas Tidak Ada");
            }
        }
        Mahasiswa mahasiswa = new Mahasiswa(name, nim, kelas);
        mahasiswa.updateData();
        mahasiswa.output();
    }
}