import java.util.Scanner;

public class Main {
    static Scanner san = new Scanner (System.in);
    static Boolean jalankan = true;
    public static void main(String[] args) {
        Anggota anggota;
        while(jalankan){
            System.out.println("=================================================");
            System.out.println("        SELAMAT DATANG DI UKM PROGRAMMER");
            System.out.println("[0] Keluar");
            System.out.println("[1] Pengurus Inti");
            System.out.println("[2] Koordinator Staf Dan Bidang");
            System.out.println("=================================================");
            System.out.print("> ");
            int inp = -1;
            try{
                inp = san.nextInt();
            }catch(Exception e){
                san.nextLine();
                System.out.println("Input Tidak Valid");
                continue;
            }
            switch (inp) {
                case 1:
                    anggota = pengurusInti();
                    if(anggota==null){
                        continue;
                    }
                    anggota.action();
                    break;
                case 2:
                    anggota = koordinator();
                    if(anggota==null){
                        continue;
                    }
                    anggota.action();
                    break;
                case 0:
                    jalankan = akhiriProgram();
                    break;
                default:
                    break;
            }
        }
    }
    public static Boolean akhiriProgram(){
        System.out.println("Akhiri Program (Y/N)?");
        System.out.print("> ");
        String end = san.next();
        if(end.equalsIgnoreCase("y")){
            return false;
        }
        else if(end.equalsIgnoreCase("n")){
            return true;
        }
        else{
            akhiriProgram();
        }
        return false;
    }
    public static Anggota pengurusInti(){
        System.out.println("=================================================");
        System.out.println("                 PENGURUS INTI");
        System.out.println("=================================================");
        System.out.println("[0] Kembali");
        System.out.println("[1] Ketua");
        System.out.println("[2] Wakil Ketua");
        System.out.println("[3] Sekertaris");
        System.out.println("[4] Bendahara");
        System.out.println("=================================================");
        System.out.print("> ");
        int inp = -1;
        try{
            inp = san.nextInt();
        }catch(Exception e){
            san.nextLine();
            System.out.println("Input Tidak Valid");
            pengurusInti();
        }
        switch (inp) {
            case 1:
                return new Ketua();
            case 2:
                return new WakilKetua();
            case 3:
                return new Sekertaris();
            case 4:
                return new Bendahara(); 
            case 0:
                return null;           
            default:
                pengurusInti();
                break;
        }
        return null;
    } 
    public static Anggota koordinator(){
        System.out.println("=================================================");
        System.out.println("             KOORDINATOR DAN STAF ");
        System.out.println("=================================================");
        System.out.println("[0] Kembali");
        System.out.println("[1] Bidang IOT");
        System.out.println("[2] Bidang Data Science");
        System.out.println("[3] Bidang Game");
        System.out.println("=================================================");
        System.out.print("> ");
        int inp = -1;
        try{
            inp = san.nextInt();
        }catch(Exception e){
            san.nextLine();
            System.out.println("Input Tidak Valid");
            koordinator();
        }
        switch (inp) {
            case 1:
                return new KorIOT();
            case 2:
                return new KorDataScience();
            case 3:
                return new KorGame();     
            case 0:
                return null;  
            default:
                koordinator();
                break;
        }
        return null;
    }    
}