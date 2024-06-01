import java.util.Scanner;

public class CompoundInterest {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the principal amount: ");
    double p = sc.nextDouble();
    System.out.print("Enter the rate of interest: ");
    double r = sc.nextDouble();
    System.out.print("Enter the number of years: ");
    int n = sc.nextInt();

    for(int i=1; i<=n; i++){
        p *= (1 + r/100);
    }

    System.out.println("The amount after " + n + " years is " + p + " Rs.");
   } 
}
