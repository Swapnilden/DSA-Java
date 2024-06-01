import java.util.Scanner;

public class DiscountPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Marked Price: ");
        double markedPrice = sc.nextDouble();
        System.out.println("Enter the Selling Price: ");
        double sellingPrice = sc.nextDouble();
        double discount = (markedPrice - sellingPrice) / markedPrice * 100;
        System.out.printf("Discount Percentage: %.2f%%", discount);
    }
}
