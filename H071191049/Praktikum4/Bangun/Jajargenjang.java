public class Jajargenjang extends Bangun{
    public Jajargenjang(double nilaiA, double nilaiB) {
        super(nilaiA, nilaiB);
        namaBangun = "Jajargenjang";
    }

    @Override
    public double getLuas() {
        luas = (nilaiA*nilaiB)/2;
        return luas;
    }

}