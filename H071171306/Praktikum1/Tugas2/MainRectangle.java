import java.util.Scanner;
class MainRectangle{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Rectangle r1 = new Rectangle();
    r1.height = scan.nextInt();
    r1.width = scan.nextInt();
    System.out.println("Tinggi = " +r1.height);
    System.out.println("Lebar = " +r1.width);
    System.out.println("Luas = " +r1.getArea());
  }
}
