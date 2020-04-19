public class PrismaSegitiga extends Segitiga {
    public PrismaSegitiga(double nilaiA, double nilaiB, double nilaiC) {
        super(nilaiA,nilaiB);
        super.nilaiC = nilaiC;
        namaBangun = "Prisma Segitiga";
    }
    @Override
    public double getVolume() {
        volume = getLuas() * nilaiC;
        return volume;
    }
}