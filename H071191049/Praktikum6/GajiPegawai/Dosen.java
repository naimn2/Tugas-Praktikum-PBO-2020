
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
    protected void gajiTambahan() {
        super.gajiTambahan();
        bonus = sks*120000;
    }
}