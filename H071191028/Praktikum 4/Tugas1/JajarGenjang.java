package Tugas1;

public class JajarGenjang extends BangunDatar{

    double a,b,tinggi;

    @Override
    public double Luas() {
        double luas = a*tinggi;
        return luas;
    }
    @Override
    public double Keliling() {
        double keliling = (a+b)*2;
        return keliling;
    }
    

}