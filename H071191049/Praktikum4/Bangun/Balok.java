public class Balok extends PersegiPanjang{
    public Balok(double nilaiA, double nilaiB, double nilaiC) {
        super(nilaiA, nilaiB);
        this.nilaiC = nilaiC;
        namaBangun = "Balok";
    }

    @Override
    public double getVolume() {
        volume = getLuas()*nilaiC;
        return volume;
    }
    @Override
    public double getLuasPermukaan() {
        luasPermukaan = (2*nilaiA*nilaiB)+(2*nilaiA*nilaiC)+(2*nilaiB*nilaiC);
        return luasPermukaan;
    }
}