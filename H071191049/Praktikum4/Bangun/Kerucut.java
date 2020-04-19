public class Kerucut extends Lingkaran {
    public Kerucut(double nilaiA, double nilaiB) {
        super(nilaiA);
        this.nilaiB = nilaiB;
        namaBangun = "Kerucut";
    }
    @Override
    public double getVolume() {
        volume = getLuas()*nilaiB;
        return volume;
    }
}