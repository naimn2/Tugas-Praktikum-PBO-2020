public class Staf extends Pegawai{
    private int kehadiran;
    @Override
    public void action() {
        System.out.print("Nama Staf ::> ");
        name = san.nextLine();
        System.out.print("Jumlah Kehadiran ::> ");
        kehadiran = san.nextInt();
    }
    @Override
    protected void hitungBonus() {
        super.hitungBonus();
        bonus = kehadiran*50000;
    }
}