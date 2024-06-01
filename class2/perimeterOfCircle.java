import java.util.Scanner;

public class perimeterOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        int r = sc.nextInt();
        double perimeter = 2 * 3.14 * r;
        System.out.println("The perimeter of the circle is: " + perimeter);
    }
}
