import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        int ans = multiply(num1, num2);
        System.out.println(ans);
    }
    
    static int multiply(int a, int b){
        return a*b;
    }
}
