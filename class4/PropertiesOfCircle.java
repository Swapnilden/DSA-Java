import java.util.Scanner;
import java.lang.Math;

public class PropertiesOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double r = sc.nextDouble();
        double Area = area(r);
        double Circumference = circumference(r);
        System.out.println("The area of the circle is: " + Area);
        System.out.println("The circumference of the circle is : " + Circumference);
    }

    static double area(double r){
        return Math.PI * r * r;
    }

    static double circumference(double r){
        return 2 * Math.PI * r;
    }


}
