import java.util.Scanner;

public class PrimeNoBtwTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        for(int i = num1; i <= num2; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }

    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }

        int c = 2;
        while(c*c <= n){
            if (n % c == 0){
                return false;
            }
            c++;
        }
        return c*c > n;
    }
}
