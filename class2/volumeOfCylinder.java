import java.util.Scanner;
import java.lang.Math;

public class volumeOfCylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius of cylinder: ");
        double r = input.nextDouble();
        System.out.println("Enter height of cylinder: ");
        double h = input.nextDouble();
        double volume = Math.PI*r*r*h;
        System.out.println("The volume of the cylinder is: "+ volume);
    }
}
