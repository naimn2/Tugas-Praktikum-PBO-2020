public class Tabung extends Lingkaran {
    public Tabung(double nilaiA, double nilaiB) {
        super(nilaiA);
        super.nilaiB = nilaiB;
        namaBangun = "Tabung";
    }

    @Override
    public double getVolume() {
        volume = getLuas()*nilaiB;
        return volume;
    }
}