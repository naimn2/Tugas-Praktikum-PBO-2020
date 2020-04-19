public class Segitiga extends Bangun{
    public Segitiga(double nilaiA, double nilaiB) {
        super(nilaiA, nilaiB);
        namaBangun = "Segitiga";
    }

    @Override
    public double getLuas() {
        luas = (nilaiA*nilaiB)/2;
        return luas;
    }

}