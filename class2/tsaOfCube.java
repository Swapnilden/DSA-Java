import java.util.Scanner;

public class tsaOfCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sides of cube: ");
        double a = sc.nextDouble();
        double tsa = 6*a*a;
        System.out.println("The TSA of the cube is : "+ tsa);
    }
}
