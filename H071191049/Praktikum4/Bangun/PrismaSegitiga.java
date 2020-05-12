public class PrismaSegitiga extends Segitiga {
    public PrismaSegitiga(double nilaiA, double nilaiB, double nilaiC, double nilaiD, double nilaiE) {
        super(nilaiA,nilaiB,nilaiC);
        this.nilaiD = nilaiD;
        this.nilaiE = nilaiE;
        namaBangun = "Prisma Segitiga";
    }
    public PrismaSegitiga(double nilaiA, double nilaiB, double nilaiC) {
        super(nilaiA,nilaiB);
        this.nilaiC = nilaiC;
        namaBangun = "Prisma Segitiga";
    }
    @Override
    public double getVolume() {
        volume = (nilaiA*nilaiB*nilaiC)/2;
        return volume;
    }
    @Override
    public double getLuasPermukaan() {
        luasPermukaan = (getKeliling()*nilaiD)+(2*((nilaiC*nilaiE)/2));
        return luasPermukaan;
    }
}