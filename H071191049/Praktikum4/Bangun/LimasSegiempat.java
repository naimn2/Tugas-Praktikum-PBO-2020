public class LimasSegiempat extends PersegiPanjang {
    public LimasSegiempat(double nilaiA, double nilaiB, double nilaiC) {
        super(nilaiA,nilaiB);
        super.nilaiC = nilaiC;
        namaBangun = "Limas Segiempat";
    }

    @Override
    public double getVolume() {
        volume = (getLuas()*nilaiC)/3;
        return volume;
    }
    @Override
    public double getLuasPermukaan() {
        double t1 = Math.sqrt(Math.pow((nilaiA/2),2)+Math.pow(nilaiC, 2));
        double t2 = Math.sqrt(Math.pow((nilaiB/2),2)+Math.pow(nilaiC, 2));
        double l1 = (nilaiA*t1)/2;
        double l2 = (nilaiB*t2)/2;
        double l3 = nilaiA*nilaiB;
        luasPermukaan = l3 + 2*l1 + 2*l2;
        return luasPermukaan;
    }
}