import java.util.Scanner;

public class csaOfCylinder {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the radius of the cylinder: ");
    double r = sc.nextDouble();
    System.out.println("Enter the height of the cylinder: ");
    double h = sc.nextDouble();
    double csa = 2 * Math.PI * r * h;
    System.out.println("The CSA of the cylinder is: " + csa);
   } 
}
