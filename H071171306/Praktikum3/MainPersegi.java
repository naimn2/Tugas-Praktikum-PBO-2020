import java.util.Scanner;
public class MainPersegi{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int panjang = input.nextInt();
    int lebar = input.nextInt();
    int getLuas = panjang*lebar;

    System.out.println("Panjang = " +panjang);
    System.out.println("Lebar = " +lebar);
    System.out.println("Luas = " +getLuas);

  }
}
