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
    @Override
    public double getLuasPermukaan() {
        double s = Math.sqrt(Math.pow((nilaiB/2),2)+Math.pow(nilaiA, 2));
        luasPermukaan = getLuas()+(pI*nilaiA*s);
        return luasPermukaan;
    }
}