public class Kubus extends Persegi{
    public Kubus(double nilaiA) {
        super(nilaiA);
        namaBangun = "Kubus";
    }

    @Override
    public double getVolume() {
        volume = getLuas()*nilaiA;
        return volume;
    }
}