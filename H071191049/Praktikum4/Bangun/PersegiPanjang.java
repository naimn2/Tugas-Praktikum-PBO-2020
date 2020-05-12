public class PersegiPanjang extends Bangun{
    public PersegiPanjang(double nilaiA, double nilaiB) {
        super(nilaiA, nilaiB);
        namaBangun = "Persegi Panjang";
    }

    @Override
    public double getLuas() {
        luas = nilaiA*nilaiB;
        return luas;
    }
    @Override
    public double getKeliling() {
        keliling = 2*(nilaiA+nilaiB);
        return keliling;
    }
}