import java.util.Scanner;
import java.lang.Math;

public class areaOfIsosceles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of the triangle: ");
        double b = sc.nextDouble();
        System.out.println("Enter the same side of the triangle: ");
        double a = sc.nextDouble();
        double area = (b*(Math.sqrt((a*a) - ((b/2)*(b/2)))))/2;
        System.out.println("The Area of Isosceles Triangle : " + area);
    }
}
