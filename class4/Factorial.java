import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int ans = factorial(num);
        System.out.println("Factorial of " + num + " is " + ans);
    }

    static int factorial(int n){
        if (n == 0) return 1;
        int ans = 1;
        while(n > 0){
            ans *= n;
            n--;
        }
        return ans;
    }
}
