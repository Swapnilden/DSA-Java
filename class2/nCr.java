import java.util.Scanner;

public class nCr {

    public static int factorial(int n){
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact *= i;
        }
        return fact;
    }

    public static int combination(int n, int r){
        if (n < r) {
            return -1;
        }
        if (n == r || r == 0) {
            return 1;
        }
        return factorial(n)/(factorial(r)*factorial(n-r));
    }

    public static int permutation(int n, int r){
        if (n < r) {
            return -1;
        }
        if (n == r || r == 0) {
            return 1;
        }
        return factorial(n)/factorial(n-r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Enter r: ");
        int r = sc.nextInt();
        System.out.println("nPr = " + permutation(n, r));
    }  
}
