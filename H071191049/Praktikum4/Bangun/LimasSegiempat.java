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
}