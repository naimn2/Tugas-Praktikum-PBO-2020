public class LimasSegitiga extends Segitiga {
    public LimasSegitiga(double nilaiA, double nilaiB, double nilaiC) {
        super(nilaiA,nilaiB);
        super.nilaiC = nilaiC;
        namaBangun = "Limas Segitiga Sama Sisi";
    }

    @Override
    public double getVolume() {
        volume = (getLuas()*nilaiC)/3;
        return volume;
    }
    @Override
    public double getLuasPermukaan() {
        double t1 = Math.sqrt(Math.pow((nilaiA/2),2)+Math.pow(nilaiC, 2));
        double l1 = (nilaiA*t1)/2;
        double l2 = (nilaiA*nilaiB)/2;
        luasPermukaan = l1 + (3*l2);
        return luasPermukaan;
    }
}