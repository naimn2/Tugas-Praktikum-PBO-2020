class Anggota{
 
    String biodataAnggota(){
        System.out.println("BIODATA ANGGOTA");
        System.out.println();
        return null;
    }
    String pengurusInti(){
        System.out.println("List Pengurus Inti");
        return null;
    }

    String Koordinator(){
        System.out.println("List Koordinator Bidang dan Staff");
        return null;
    }
}
class Biodata extends Anggota{

    String nama;
    String jenisKelamin;
    int umur;
    String fakultas;
    String jurusan;
    String jabatan;

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenisKelamin() {
        return this.jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public int getUmur() {
        return this.umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    public Biodata(String nama, String jenisKelamin, int umur,String fakultas,String jurusan,String jabatan) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.umur = umur;
        this.fakultas = fakultas;
        this.jabatan = jabatan;
        this.jurusan = jurusan;
    }

    String showInfo(){
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);
        System.out.println("JenisKelamin : " + jenisKelamin);
        System.out.println("Fakultas : " + fakultas);
        System.out.println("Jurusan : "  + jurusan);
        System.out.println("Jabatan : " + jabatan);
        return null;
    }
    @Override
    String pengurusInti(){
    
        System.out.println("Nama : " + nama);
        return nama;
    }

    @Override
    String Koordinator(){
        System.out.println("Nama : " + nama);
        return nama;
    }
}

class UKMP{

    public static void main(String[] args) {

        Anggota agt = new Anggota();

        Biodata bio1 = new Biodata("Ariana", "Perempuan",17,"MIPA","Matematika","Pengurus Inti");
        Biodata bio2 = new Biodata("Billie", "Perempuan",18, "MIPA", "Fisika","Pengurus Inti");
        Biodata bio3 = new Biodata("Jennie", "Perempuan", 19, "MIPA","Kimia", "Pengurus Inti");
        Biodata bio4 = new Biodata("Becky G", "Perempuan",20, "MIPA", "Biologi", "Pengurus Inti");
        Biodata bio5 = new Biodata("Zayn", "Laki-Laki", 19, "MIPA", "Matematika", "Koordinator bidang & Staff");
        Biodata bio6 = new Biodata("Niall", "Laki-Laki", 20, "MIPA", "Geofisika", "Koordinator bidang & Staff");
        Biodata bio7 = new Biodata("Pamungkas","Laki-Laki", 21, "MIPA", "Ilmu Komputer", "Koordinator bidang & Staff");
        Biodata bio8 = new Biodata("Khalid","Laki-Laki", 22, "MIPA","Ilmu Komputer", "Koordinator bidang & Staff");
        Biodata bio9 = new Biodata("Lisa", "Perempuan",18, "MIPA","Ilmu Komputer", "Koordinator bidang & Staff");

        agt.biodataAnggota();
        bio1.showInfo();
        System.out.println();
        bio2.showInfo();
        System.out.println();
        bio3.showInfo();
        System.out.println();
        bio4.showInfo();
        System.out.println();
        bio5.showInfo();
        System.out.println();
        bio6.showInfo();
        System.out.println();
        bio7.showInfo();
        System.out.println();
        bio8.showInfo();
        System.out.println();
        bio9.showInfo();
        System.out.println();

        agt.pengurusInti();
        bio1.pengurusInti();
        bio2.pengurusInti();
        bio3.pengurusInti();
        bio4.pengurusInti();
        System.out.println();

        agt.Koordinator();
        bio5.Koordinator();
        bio6.Koordinator();
        bio7.Koordinator();
        bio8.Koordinator();
        bio9.Koordinator();
    }
}