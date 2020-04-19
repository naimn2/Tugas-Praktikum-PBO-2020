public class Bola extends Lingkaran {
    public Bola(double nilaiA) {
        super(nilaiA);
        namaBangun = "Bola";
    }

    @Override
    public double getVolume() {
        volume = (4*getLuas()*nilaiA)/3;
        return volume;
    }
}