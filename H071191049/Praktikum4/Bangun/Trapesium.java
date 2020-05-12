public class Trapesium extends Bangun {
    public Trapesium(double nilaiA, double nilaiB, double nilaiC) {
        super(nilaiA, nilaiB, nilaiC);
        namaBangun = "Trapesium";
    }
    public Trapesium(double nilaiA, double nilaiB, double nilaiC, double nilaiD) {
        super(nilaiA, nilaiB, nilaiC);
        this.nilaiD = nilaiD;
        namaBangun = "Trapesium";
    }
    @Override
    public double getLuas() {
        luas = 0.5*(nilaiA+nilaiB)*nilaiC;
        return luas;
    }
    @Override
    public double getKeliling() {
        keliling = nilaiA+nilaiB+nilaiC+nilaiD;
        return keliling;
    }
}