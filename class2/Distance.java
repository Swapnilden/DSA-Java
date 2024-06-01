import java.util.Scanner;
import java.lang.Math;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1, x2, y1, y2;
        System.out.println("Enter the x - coordinates of First point: ");
        x1 = sc.nextDouble();
        System.out.println("Enter the y - coordinates of First point: ");
        y1 = sc.nextDouble();
        System.out.println("Enter the x - coordinates of Second point: ");
        x2 = sc.nextDouble();
        System.out.println("Enter the y - coordinates of Second point: "); 
        y2 = sc.nextDouble();
        double distance = Math.sqrt((x2 - x1)*(x2-x1) + (y2 - y1)*(y2 - y1));
        System.out.println("The distance between the two points is: " + distance);
    }
}
