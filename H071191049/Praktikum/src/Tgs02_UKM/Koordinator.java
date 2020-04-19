package Tgs02_UKM;
import java.util.Scanner;
public class Koordinator extends Anggota {
    Scanner san = new Scanner(System.in);
    String bidang;
    int jumlahAnggota;
    @Override
    public void action() {
        super.action();
        System.out.printf("\n==Koordinator==");
        System.out.printf("\n[1]Bidang DataScience\n[2]Bidang IOT\n[3]Bidang Game");
        int i = san.nextInt();
        switch (i) {
            case 1:
                KoordinatorDataScience dataScience = new KoordinatorDataScience();
                dataScience.action();
                break;
            case 2:
                KoordinatorGame game = new KoordinatorGame();
                game.action();
                break;
            case 3:
                KoordinatorIOT iot = new KoordinatorIOT();
                iot.action();
                break;
            default:
                break;
        }
    }


}