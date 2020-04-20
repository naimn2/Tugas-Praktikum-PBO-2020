import java.util.Scanner;
public class Pegawai {
    protected final int gaji = 2500000;
    protected int bonus;
    protected Scanner san = new Scanner(System.in);
    protected String name;
    
    public void action(){
        System.out.print("Nama Pegawai ::> ");
        name = san.nextLine();
    }
    public String getName(){
        return name;
    }
    public int getGaji(){
        hitungBonus();
        return gaji+bonus;
    }
    protected void hitungBonus(){
    }
}