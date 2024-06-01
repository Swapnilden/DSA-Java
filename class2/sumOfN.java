import java.util.Scanner;

public class sumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while( true ){
            System.out.println("Enter the number: ");
            int n = sc.nextInt();
            if( n == 0 ){
                break;
            } else {
                sum += n;
            }
        }
        System.out.println("Sum of the given numbers is: "+ sum);
    }
}
