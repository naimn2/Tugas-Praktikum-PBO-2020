import java.util.*;
class MainRectangle{
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        Rectangle r = new Rectangle();
        r.height = sc.nextDouble();
        r.width = sc.nextDouble();
        
        System.out.println("Luas = " + r.getArea());
    }
}