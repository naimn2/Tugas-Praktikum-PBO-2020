import java.util.Scanner;

class BangunRuang{

    double volume() {
        System.out.println("Menghitung Volume");
        return 0;
    }
    double luasPermukaan(){
        System.out.println("Menghitung Luas Permukaan");
        return 0;
    }
}

class BangunDatar{

    double luas(){
        System.out.println("menghitung luas");
        return 0;
    }
    double keliling(){
        System.out.println("menghitung keliling");
        return 0;
    }
}

class Kubus extends BangunRuang{
    double sisi;
    
    @Override
    public double volume(){
        double volume = Math.pow(sisi,3);
        System.out.printf("volume : %.2f",volume);
        return volume;
    }
    @Override
    public double luasPermukaan(){
        double luasPermukaan =  6*Math.pow(sisi,2);
        System.out.printf("\nluas permukaan : %.2f",luasPermukaan);
        System.out.println();
        return luasPermukaan;
    }
}

class Balok extends BangunRuang{
    double panjang;
    double lebar;
    double tinggi;

    @Override
    public double volume(){
        double volume = panjang*lebar*tinggi; 
        System.out.printf("volume : %.2f ",volume);
        return volume;
    }
    @Override
    public double luasPermukaan(){
        double luasPermukaan = 2*(panjang*lebar) + 2*(panjang*tinggi) + 2*(lebar*tinggi);
        System.out.printf("\nluas permukaan : %.2f",luasPermukaan);
        System.out.println();
        return luasPermukaan;
    }
}
class PrismaSegitiga extends BangunRuang{

    double panjang;
    double lebar;
    double tinggi;

    @Override
    public double volume(){
        double volume = (Math.pow(panjang, 2)*tinggi)/2;
        System.out.printf("volume : %.2f",volume);
        return volume;
    }
    @Override
    public double luasPermukaan(){
        double luasPermukaan = 2 * ((panjang*lebar)/2)+3*(panjang*tinggi);
        System.out.printf("\nluas permukaan : %.2f ",luasPermukaan);
        System.out.println();
        return luasPermukaan;
    }
}
class Bola extends BangunRuang{
    double jariJari;

    @Override
    public double volume(){
        double volume = 4*((Math.PI)*Math.pow(jariJari,3))/3; 
        System.out.printf("volume : %.2f",volume);
        return volume;
    }
    @Override
    public double luasPermukaan(){
        double luasPermukaan = 4 * Math.PI * Math.pow(jariJari,2);
        System.out.printf("\nluas permukaan : %.2f",luasPermukaan);
        System.out.println();
        return luasPermukaan;
    }
}
class Tabung extends BangunRuang{
    double jariJari;
    double tinggi;

    @Override
    public double volume(){
        double volume = Math.PI*jariJari*tinggi; 
        System.out.printf("volume : %.2f ",volume);
        return volume;
    }
    @Override
    public double luasPermukaan(){
        double luasPermukaan = (Math.PI*jariJari) * (jariJari+2*tinggi);
        System.out.printf("\nluas permukaan : %.2f",luasPermukaan);
        System.out.println();
        return luasPermukaan;
    }
}
class LimasSegiEmpat extends BangunRuang{
    double sisi;
    double tinggi;

    @Override
    public double volume(){
        double volume = (sisi*sisi*tinggi)/3; 
        System.out.printf("volume : %.2f", volume);
        return volume;
    }
    @Override
    public double luasPermukaan(){
        double luasPermukaan = (sisi*sisi) + (4*0.5*(sisi*tinggi));
        System.out.printf("\nluas permukaan : %.2f", luasPermukaan);
        System.out.println();
        return luasPermukaan;
    }
}
class LimasSegiTiga extends BangunRuang{
    double sisiA;
    double sisiB;
    double tinggi;

    @Override
    public double volume(){
        double volume = (0.5*(sisiA*sisiB))/3*tinggi; 
        System.out.printf("volume : %.2f",volume);
        return volume;
    }
    @Override
    public double luasPermukaan(){
        double luasPermukaan = 0.5*(sisiA*tinggi)+(3*sisiA*sisiB);
        System.out.printf("\nluas permukaan : %.2f",luasPermukaan);
        System.out.println();
        return luasPermukaan;
    }
}
class Kerucut extends BangunRuang{
    double jariJari;
    double garisPelukis;

    @Override
    public double volume(){
        double volume = (3.14*Math.pow(jariJari,2)*garisPelukis)/3; 
        System.out.printf("volume : %.2f",volume);
        return volume;
    }
    @Override
    public double luasPermukaan(){
        double luasPermukaan = Math.PI*jariJari*(jariJari+garisPelukis);
        System.out.printf("\nluas permukaan : %.2f",luasPermukaan);
        System.out.println();
        return luasPermukaan;
    }
}

class Persegi extends BangunDatar{
    int sisi;

    double luas(){
        double luas = Math.pow(sisi,2);
        System.out.printf("luas : %.2f",luas);
        return luas;
    }
    double keliling(){
        double keliling = 4*sisi;
        System.out.printf("\nkeliling : %.2f",keliling);
        System.out.println();
        return keliling;
    }
}

class PersegiPanjang extends BangunDatar{
    double panjang;
    double lebar;

    double luas(){
        double luas = panjang*lebar;
        System.out.printf("luas : %.2f",luas);
        return luas;
    }
    double keliling(){
        double keliling = 2*(panjang+lebar);
        System.out.printf("\nkeliling : %.2f",keliling);
        System.out.println();
        return keliling;
    }
}

class Lingkaran extends BangunDatar{
    double jariJari;

    double luas(){
        double luas = Math.PI*Math.pow(jariJari,2);
        System.out.printf("luas : %.2f",luas);
        return luas;
    }
    double keliling(){
        double keliling = 2*Math.PI*jariJari;
        System.out.printf("\nkeliling : %.2f", keliling);
        System.out.println();
        return keliling;
    }
}


class Segitiga extends BangunDatar{
    double sisi;
    double alas;
    double tinggi;

    double luas(){
        double luas = 0.5*(alas*tinggi);
        System.out.printf("luas : %.2f",luas);
        return luas;
    }
    double keliling(){
        double keliling = sisi+sisi+sisi;
        System.out.printf("\nkeliling : %.2f",keliling);
        System.out.println();
        return keliling;
    }
}

class Trapesium extends BangunDatar{
    double sisiA;
    double sisiB;
    double tinggi;

    double luas(){
        double luas = 0.5*(sisiA*sisiA)*tinggi;
        System.out.printf("luas : %.2f",luas);
        return luas;
    }
    double keliling(){
        double keliling = 2*(sisiA)+2*(sisiB);
        System.out.printf("\nkeliling : %.2f",keliling);
        System.out.println();
        return keliling;
    }
}

class JajarGenjang extends BangunDatar{
    double alas;
    double tinggi;

    double luas(){
        double luas = alas*tinggi;
        System.out.printf("luas : %.2f",luas);
        return luas;
    }
    double keliling(){
        double keliling = 4*alas;
        System.out.printf("\nkeliling : %.2f",keliling);
        System.out.println();
        return keliling;
    }
}


class BelahKetupat extends BangunDatar{
    double diagonal1;
    double diagonal2;

    double luas(){
        double luas = 0.5*(diagonal1*diagonal2);
        System.out.printf("luas : %.2f",luas);
        return luas;
    }
    double keliling(){
        double keliling = 4*diagonal1;
        System.out.printf("\nkeliling : %.2f",keliling);
        System.out.println();
        return keliling;
    }
}

class LayangLayang extends BangunDatar{
    double diagonal1;
    double diagonal2;

    double luas(){
        double luas = 0.5*(diagonal1*diagonal2);
        System.out.printf("luas : %.2f",luas);
        return luas;
    }
    double keliling(){
        double keliling = 2*(diagonal1+diagonal2);
        System.out.printf("\nkeliling : %.2f",keliling);
        System.out.println();
        return keliling;
    }
}

class Main{
public static void main(String[] args) {
    System.out.println("===== MENU =====");
    System.out.println("1. BANGUN RUANG");
    System.out.println("2. BANGUN DATAR");
    Scanner sep = new Scanner (System.in);
    System.out.println();
    String menu = sep.nextLine();

    switch(menu){
        case "1":
        System.out.println("===== BANGUN RUANG ===== ");
        System.out.println("1. kubus");
            System.out.println("2. Balok");
            System.out.println("3. Prisma segitiga");
            System.out.println("4. Bola");
            System.out.println("5. Tabung");
            System.out.println("6. Limas segiempat");
            System.out.println("7. Limas segitiga");
            System.out.println("8. Kerucut"); 

            BangunRuang objBr = new BangunRuang();  
            objBr.volume();
            objBr.luasPermukaan();    
            System.out.print("input : "); 

            String br = sep.nextLine();

            switch (br){
                case "1":
                System.out.println("=KUBUS=");
                Kubus objKubus = new Kubus();
                System.out.print("sisi : ");
                objKubus.sisi = sep.nextDouble();
                objKubus.volume();
                objKubus.luasPermukaan();
                break;

                case "2":
                System.out.println("=BALOK=");
                Balok objBalok = new Balok();
                System.out.print("panjang : ");
                objBalok.panjang = sep.nextDouble();
                System.out.print("lebar : ");
                objBalok.lebar = sep.nextDouble();
                System.out.print("tinggi : ");
                objBalok.tinggi = sep.nextInt();
                objBalok.volume();
                objBalok.luasPermukaan();
                break;

                case "3":
                System.out.println("=PRISMA SEGITIGA=");
                PrismaSegitiga objPrismaSgtg = new PrismaSegitiga();
                System.out.print("panjang : ");
                objPrismaSgtg.panjang = sep.nextDouble();
                System.out.print("lebar : ");
                objPrismaSgtg.lebar = sep.nextDouble();
                System.out.print("tinggi : ");
                objPrismaSgtg.tinggi = sep.nextDouble();
                objPrismaSgtg.volume();
                objPrismaSgtg.luasPermukaan();
                break;

                case "4":
                System.out.println("=BOLA=");
                Bola objBola = new Bola();
                System.out.print("jari-jari :");
                objBola.jariJari = sep.nextDouble();
                objBola.volume();
                objBola.luasPermukaan();
                break;

                case "5":
                System.out.println("=TABUNG=");
                Tabung objTabung = new Tabung();
                System.out.print("jari-jari : ");
                objTabung.jariJari = sep.nextDouble();
                System.out.print("tinggi : ");
                objTabung.tinggi = sep.nextDouble();
                objTabung.volume();
                objTabung.luasPermukaan();
                break;

                case "6":
                System.out.println("=LIMAS SEGIEMPAT=");
                LimasSegiEmpat objLimasSgempt = new LimasSegiEmpat();
                System.out.print("sisi : ");
                objLimasSgempt.sisi = sep.nextDouble();
                System.out.print("tinggi : ");
                objLimasSgempt.tinggi = sep.nextDouble();
                objLimasSgempt.volume();
                objLimasSgempt.luasPermukaan();
                break;

                case "7":
                System.out.println("=LIMAS SEGITIGA=");
                LimasSegiTiga objLimasSgtg = new LimasSegiTiga();
                System.out.print("sisi a : " );
                objLimasSgtg.sisiA = sep.nextDouble();
                System.out.print("sisi b : ");
                objLimasSgtg.sisiB = sep.nextDouble();
                System.out.print("tinggi : ");
                objLimasSgtg.tinggi = sep.nextDouble();
                objLimasSgtg.volume();
                objLimasSgtg.luasPermukaan();
                break;

                case "8":
                System.out.println("=KERUCUT=");
                Kerucut objKerucut = new Kerucut();
                System.out.print("jari-jari : ");
                objKerucut.jariJari = sep.nextInt();
                System.out.print("garis pelukis : ");
                objKerucut.garisPelukis = sep.nextDouble();
                objKerucut.volume();
                objKerucut.luasPermukaan();
                break;
            }
            break;

            
        case "2" :
        System.out.println("===== BANGUN DATAR =====");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");
        System.out.println("4. Segitiga");
        System.out.println("5. Trapesium");
        System.out.println("6. Jajar Genjang");
        System.out.println("7. Belah Ketupat");
        System.out.println("8. Layang-Layang");

        BangunDatar objBd = new BangunDatar();
        objBd.luas();
        objBd.keliling();
        System.out.print("Input :");
        String bd = sep.nextLine();

        switch(bd){
            case "1":
            System.out.println("PERSEGI");
            Persegi objPersegi = new Persegi();
            System.out.print("sisi : ");
            objPersegi.sisi = sep.nextInt();
            objPersegi.luas();
            objPersegi.keliling();
            break;

            case"2":
            System.out.println("PERSEGI PANJANG");
            PersegiPanjang objPp = new PersegiPanjang();
            System.out.print("panjang : ");
            objPp.panjang = sep.nextInt();
            System.out.print("lebar : ");
            objPp.lebar = sep.nextInt();
            objPp.luas();
            objPp.keliling();
            break;

            case "3":
            System.out.println("LINGKARAN");
            Lingkaran objLingkaran = new Lingkaran();
            System.out.print("jari-jari : ");
            objLingkaran.jariJari = sep.nextInt();
            objLingkaran.luas();
            objLingkaran.keliling();
            break;

            case "4":
            System.out.println("SEGITIGA");
            Segitiga objSegitiga = new Segitiga();
            System.out.print("sisi : ");
            objSegitiga.sisi = sep.nextInt();
            System.out.print("alas : ");
            objSegitiga.alas = sep.nextInt();
            System.out.print("tinggi : ");
            objSegitiga.tinggi = sep.nextInt();
            objSegitiga.luas();
            objSegitiga.keliling();
            break;

            case "5":
            System.out.println("TRAPESIUM");
            Trapesium objTrapesium = new Trapesium();
            System.out.print("sisi A : ");
            objTrapesium.sisiA = sep.nextInt();
            System.out.print("sisi B : ");
            objTrapesium.sisiB = sep.nextInt();
            objTrapesium.luas();
            objTrapesium.keliling();
            break;

            case"6":
            System.out.println("JAJAR GENJANG");
            JajarGenjang objJg = new JajarGenjang();
            System.out.print("alas : ");
            objJg.alas = sep.nextInt();
            System.out.print("tinggi : ");
            objJg.tinggi = sep.nextInt();
            objJg.luas();
            objJg.keliling();
            break;

            case "7":
            System.out.println("BELAH KETUPAT");
            BelahKetupat objBk = new BelahKetupat();
            System.out.print("diagonal 1 : ");
            objBk.diagonal1 = sep.nextInt();
            System.out.print("diagonal 2 : ");
            objBk.diagonal2 = sep.nextInt();
            objBk.luas();
            objBk.keliling();
            break;

            case "8":
            System.out.println("LAYANG-LAYANG");
            LayangLayang objLl = new LayangLayang();
            System.out.print("diagonal 1 : ");
            objLl.diagonal1 = sep.nextInt();
            System.out.print("diagonal 2 : ");
            objLl.diagonal2 = sep.nextInt();
            objLl.luas();
            objLl.keliling();
            break;

        }break;
    }
    sep.close();
    }

}
