public class Lingkaran extends Bangun{
    public Lingkaran(double nilaiA) {
        super(nilaiA);
        namaBangun = "Lingkaran";
    }

    @Override
    public double getLuas() {
        luas = nilaiA*nilaiA*Math.PI;
        return luas;
    }
}