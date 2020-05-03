public class Persegi extends Bangun{
    public Persegi(double nilaiA) {
        super(nilaiA);
        namaBangun = "Persegi";
    }
    @Override
    public double getLuas() {
        luas = nilaiA*nilaiA;
        return luas;
    }
    @Override
    public double getKeliling() {
        keliling = 4*nilaiA;
        return keliling;
    }
}