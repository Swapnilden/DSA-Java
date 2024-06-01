import java.util.Scanner;

public class FutureValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Investment amount: ");
        double p = sc.nextDouble();
        System.out.println("Enter the rate of interest: ");
        double r = sc.nextDouble();
        System.out.println("Enter the number of years: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            p += p * (1 + r/100);
            System.out.println("The future value of the investment is: " + p);
        }
        
    }
}
