import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base value: ");
        double base = sc.nextDouble();
        System.out.println("Enter the power value: ");
        double power = sc.nextDouble();
        double ans = 1;
        for (int i=1; i<=power; i++){
            ans = ans * base;
        }
        System.out.println("The result is: "+ans);
    }
}
