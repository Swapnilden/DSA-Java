import java.util.Scanner;
import java.lang.Math;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        int temp = n;
        
        // Calculate the number of digits
        int numDigits = String.valueOf(n).length();

        while (temp > 0) {
            int rem = temp % 10;
            sum += Math.pow(rem, numDigits);
            temp /= 10;
        }

        if (sum == n) {
            System.out.println("The number is an Armstrong number.");
        } else {
            System.out.println("The number is not an Armstrong number.");
        }
    }
}
