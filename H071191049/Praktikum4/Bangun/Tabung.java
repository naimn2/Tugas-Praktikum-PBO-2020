public class Tabung extends Lingkaran {
    public Tabung(double nilaiA, double nilaiB) {
        super(nilaiA);
        namaBangun = "Tabung";
    }
    public Tabung(double nilaiA) {
        super(nilaiA);
        namaBangun = "Tabung";
    }

    @Override
    public double getVolume() {
        volume = getLuas()*nilaiB;
        return volume;
    }
    @Override
    public double getLuasPermukaan() {
        luasPermukaan = (2*getLuas())+getKeliling();
        return luasPermukaan;
    }
}