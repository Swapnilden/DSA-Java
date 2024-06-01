import java.util.Scanner;

public class perimeterOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the side of the square: ");
        int a = sc.nextInt();
        int perimeter = 4*a;
        System.out.println("The perimeter of the square is: "+perimeter);
    }
}