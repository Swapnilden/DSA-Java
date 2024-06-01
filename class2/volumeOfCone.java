import java.util.Scanner;
import java.lang.Math;

public class volumeOfCone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the Cone: ");
        double r = sc.nextDouble();
        System.out.println("Enter the height of the Cone: ");
        double h = sc.nextDouble();
        double volume = (Math.PI*r*r*h)/3;
        System.out.println("The volume of the cone: " + volume);
    }
}
