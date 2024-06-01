import java.util.Scanner;
import java.lang.Math;

public class volumeOfSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the sphere: ");
        double r = sc.nextDouble();
        double volume = (4*Math.PI*r*r*r)/3;
        System.out.println("The volume of the Sphere: "+ volume);
    }
}
