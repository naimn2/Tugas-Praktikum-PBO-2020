public class Bangun {
    protected double nilaiA;
    protected double nilaiB;
    protected double nilaiC;
    protected double nilaiD;
    protected double nilaiE;
    protected double luas;
    protected double volume;
    protected double keliling;
    protected double luasPermukaan;
    protected String namaBangun;

    public Bangun() {}
    public Bangun(double nilaiA){
        this.nilaiA = nilaiA;
    }
    public Bangun(double nilaiA, double nilaiB) {
        this.nilaiA = nilaiA;
        this.nilaiB = nilaiB;
    }
    public Bangun(double nilaiA, double nilaiB, double nilaiC) {
        this.nilaiA = nilaiA;
        this.nilaiB = nilaiB;
        this.nilaiC = nilaiC;
    }
    public double getVolume() {
        return volume;
    }
    public double getLuas() {
        return luas;
    }
    public double getKeliling(){
        return keliling;
    }
    public double getLuasPermukaan(){
        return luasPermukaan;
    }
    public String getName() {
        return namaBangun;
    }


}