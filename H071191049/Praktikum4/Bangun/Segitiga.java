public class Segitiga extends Bangun{
    public Segitiga(double nilaiA, double nilaiB) {
        super(nilaiA, nilaiB);
        namaBangun = "Segitiga";
    }

    public Segitiga(double nilaiA, double nilaiB, double nilaiC){
        super(nilaiA, nilaiB, nilaiC);
        namaBangun = "Segitiga";
    }

    @Override
    public double getLuas() {
        luas = (nilaiA*nilaiB)/2;
        return luas;
    }
    @Override
    public double getKeliling() {
        keliling = nilaiA+nilaiB+nilaiC;
        return keliling;
    }
}