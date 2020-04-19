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
}