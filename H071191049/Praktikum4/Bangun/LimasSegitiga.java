public class LimasSegitiga extends Segitiga {
    public LimasSegitiga(double nilaiA, double nilaiB, double nilaiC) {
        super(nilaiA,nilaiB);
        super.nilaiC = nilaiC;
        namaBangun = "Limas Segitiga";
    }

    @Override
    public double getVolume() {
        volume = (getLuas()*nilaiC)/3;
        return volume;
    }
}