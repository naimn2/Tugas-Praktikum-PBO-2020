
public class Dosen extends Pegawai{
    private int sks;
    @Override
    public void action() {
        System.out.print("Nama Dosen ::> ");
        name = san.nextLine();
        System.out.print("Jumlah SKS ::> ");
        sks = san.nextInt();
    }

    @Override
    protected void hitungBonus() {
        super.hitungBonus();
        bonus = sks*120000;
    }
}