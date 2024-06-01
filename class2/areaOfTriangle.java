import java.util.Scanner;

public class areaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of the triangle: ");
        int a = sc.nextInt();
        System.out.println("Enter the height of the triangle: ");
        int b = sc.nextInt();
        int area = (a*b)/2;
        System.out.println(area);
        
    }
}
