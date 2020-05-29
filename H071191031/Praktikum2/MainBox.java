import java.util.Scanner;

class MainBox {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double width = input.nextDouble();
        double heigth = input.nextDouble();
        double depth = input.nextDouble();
        double mass = input.nextDouble();

        Box box1 = new Box(width, heigth, depth, mass);
        box1.setMass(mass);
        System.out.println("Massa jenis = "+ box1.getDensity());
        box1.setMass(mass*2);
        System.out.println("Massa jenis = "+ box1.getDensity());
    }
}