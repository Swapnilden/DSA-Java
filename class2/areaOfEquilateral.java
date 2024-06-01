import java.util.Scanner;

public class areaOfEquilateral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of sides of the equilateral triangle: ");
        double side = sc.nextDouble();
        double area = 0.433*side*side;
        System.out.println("The area of Equilateral Triangle: " + area);
    }
}
