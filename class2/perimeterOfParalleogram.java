import java.util.Scanner;

public class perimeterOfParalleogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the parallelogram: ");
        double length = sc.nextDouble();
        System.out.println("Enter the breadth of the parallelogram: ");
        double breadth = sc.nextDouble();
        double perimeter = 2 * (length + breadth);
        System.out.println("The perimeter of the parallelogram: " + perimeter);
    }
}
