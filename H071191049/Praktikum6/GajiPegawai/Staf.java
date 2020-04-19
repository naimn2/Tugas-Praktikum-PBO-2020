public class Staf extends Pegawai{
    private int kehadiran;
    Staf(){
        super();
    }
    @Override
    public void action() {
        System.out.print("Nama Staf ::> ");
        name = san.nextLine();
        System.out.print("Jumlah Kehadiran ::> ");
        kehadiran = san.nextInt();
    }
    @Override
    protected void gajiTambahan() {
        super.gajiTambahan();
        bonus = kehadiran*50000;
    }
}