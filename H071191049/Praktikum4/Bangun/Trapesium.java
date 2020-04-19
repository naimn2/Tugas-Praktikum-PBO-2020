public class Trapesium extends Bangun {
    public Trapesium(double nilaiA, double nilaiB, double nilaiC) {
        super();
        this.nilaiA = nilaiA;
        this.nilaiB = nilaiB;
        this.nilaiC = nilaiC;
        namaBangun = "Trapesium";
    }
    @Override
    public double getLuas() {
        luas = 0.5*(nilaiA+nilaiB)*nilaiC;
        return luas;
    }


}