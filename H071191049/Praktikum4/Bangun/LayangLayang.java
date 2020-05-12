public class LayangLayang extends Bangun{
    public LayangLayang(double nilaiA, double nilaiB) {
        super(nilaiA, nilaiB);
        namaBangun = "Layang-layang";
    }

    @Override
    public double getLuas() {
        luas = (nilaiA*nilaiB)/2;
        return luas;
    }
    @Override
    public double getKeliling() {
        keliling = 2*(nilaiA+nilaiB);
        return keliling;
    }
}