package Tugas2;

public class Koordinator extends PengurusInti {

    public Koordinator(String name, String prodi, String nim) {
        super(name, prodi, nim);
        // TODO Auto-generated constructor stub
    }
    @Override
    public void showIdentity() {System.out.println();
        System.out.println("+===========================+");
        System.out.println("nama    : " + name);
        System.out.println("nim     : " + nim);
        System.out.println("prodi   : " + prodi);
        System.out.println("Bagian  : Koordinator");
        System.out.println("+===========================+");
    }

}