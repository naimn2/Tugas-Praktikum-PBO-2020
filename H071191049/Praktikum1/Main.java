import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner san = new Scanner(System.in);

        Person orang1 = new Person();
        boolean outputkan = true;
        try {
            System.out.print("Masukkan Nama\t= ");
            orang1.setName(san.nextLine());
            System.out.print("Masukkan Umur\t= ");
            orang1.setAge(san.nextInt());
            System.out.print("Are You Male(true/false) = ");
            orang1.setGender(san.nextBoolean());
        } catch (Exception e) {
            System.out.println("Ada input yang salah");
            outputkan = false;
        }
        if(outputkan == true){
            System.out.println("\nDATA PERSONAL");
            System.out.println("NAMA\t:"+orang1.getName());
            System.out.println("AGE\t:"+orang1.getAge()+" Tahun");
            System.out.println("GENDER\t:"+orang1.getGender());
        }
    }
}