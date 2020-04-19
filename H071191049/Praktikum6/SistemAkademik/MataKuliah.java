
public class MataKuliah {
    String name;
    String dosen;
    int sks;
    double nilaiUTS;
    double nilaiUAS;
    double nilaiAkhir;
    char angkaMutu;

    public void setNilaiUTS(double nilaiUTS) {
        this.nilaiUTS = nilaiUTS;
    }
    public void setNilaiUAS(double nilaiUAS) {
        this.nilaiUAS = nilaiUAS;
    }
    public void calculateNilaiAkhir(){
        nilaiAkhir = (nilaiUAS+nilaiUTS)/2;
    }
    public void calculateAngkaMutu(){
        
    }
}