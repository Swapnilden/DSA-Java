import java.util.Scanner;

public class perimeterOfEquilateral {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of the side of the equilateral triangle: ");
    int a = sc.nextInt();
    int perimeter = 3 * a;
    System.out.println("The perimeter of the equilateral triangle is: " + perimeter);
   } 
}
