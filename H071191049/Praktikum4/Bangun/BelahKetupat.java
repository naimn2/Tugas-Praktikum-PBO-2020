public class BelahKetupat extends Bangun{
    public BelahKetupat(double nilaiA) {
        super(nilaiA);
        namaBangun = "Belah Ketupat";
    }

    @Override
    public double getLuas() {
        luas = nilaiA*nilaiA/2;
        return luas;
    }
}