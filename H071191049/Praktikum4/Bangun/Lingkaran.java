public class Lingkaran extends Bangun{
    protected final double pI = Math.PI;
    public Lingkaran(double nilaiA) {
        super(nilaiA);
        namaBangun = "Lingkaran";
    }

    @Override
    public double getLuas() {
        luas = nilaiA*nilaiA*pI;
        return luas;
    }
}