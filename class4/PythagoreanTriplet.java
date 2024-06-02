import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first, second and third number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(isTriplet(a, b, c));
    }

    static boolean isTriplet(int a, int b, int c){
        if (a*a + b*b == c*c || b*b + c*c == a*a || a*a + c*c == b*b) {
            return true;
        }
        return false;
    }
}
