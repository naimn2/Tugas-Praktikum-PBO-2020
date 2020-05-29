//Main
import java.util.*;
public class Main {

    public static void main(final String[] args) {
        final Scanner pew = new Scanner(System.in);
        // jika koordinator, maka yang jalan adalah if
        // else staff
        System.out.println();
        System.out.println("====== masukkan kode =======");
        final String keyword = pew.next().toLowerCase();
        if (keyword.equals("syahdunya")) {
            System.out.println("name");
            pew.nextLine();
            final String name = pew.nextLine();
            System.out.println("prodi");
            final String prodi = pew.nextLine();
            System.out.println("nim");
            final String nim = pew.next();
            final PengurusInti pengurus = new PengurusInti(name, prodi, nim);

            pengurus.showIdentity();
        } else {
            System.out.println("name");
            pew.nextLine();
            final String name = pew.nextLine();
            System.out.println("prodi");
            final String prodi = pew.nextLine();
            System.out.println("nim");
            final String nim = pew.next();
            final Staff staff = new Staff(name, prodi, nim);
            staff.showIdentity();
        }
    }
}