import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the amount in Rupee: ");
        double amount = in.nextDouble();
        double dollar = amount / 74.25;
        System.out.println("The amount in dollar is: " + dollar);
    }
}
