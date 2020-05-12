
public class MataKuliah {
    String name;
    String dosen;
    char kodeKelas;
    int sks;
    double nilaiUTS;
    double nilaiUAS;
    double nilaiAkhir;
    String angkaMutu;

    public void setKelasku(char kodeKelas){
        this.kodeKelas = kodeKelas;
    }
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
        if(nilaiAkhir>=85){
            angkaMutu = "A";
        }else if(nilaiAkhir>=80){
            angkaMutu = "A-";
        }else if(nilaiAkhir>=75){
            angkaMutu = "B+";
        }else if(nilaiAkhir>=70){
            angkaMutu = "B";
        }else if(nilaiAkhir>=65){
            angkaMutu = "B-";
        }else if(nilaiAkhir>=60){
            angkaMutu = "C+";
        }else if(nilaiAkhir>=55){
            angkaMutu = "C";
        }else if(nilaiAkhir>=50){
            angkaMutu = "C-";
        }else if(nilaiAkhir>=40){
            angkaMutu = "D";
        }else{
            angkaMutu = "E";
        }
        
    }
    public String getName(){
        return name;
    }
	public int getSks() {
		return sks;
	}
	public String getDosen() {
        dosenKelas(kodeKelas);
		return dosen;
	}
	public double getNilaiUTS() {
		return nilaiUTS;
	}
	public double getNilaiUAS() {
		return nilaiUAS;
	}
	public double getNilaiAkhir() {
        calculateNilaiAkhir();
		return nilaiAkhir;
	}
	public String getAngkaMutu() {
        calculateAngkaMutu();
		return angkaMutu;
    }
    public void dosenKelas(char i){

    }
}