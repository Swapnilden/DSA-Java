import java.util.Scanner;

public class sumOfNegNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int sum = 0;
        while (n < 0){
            sum += n;
            n++;
        }
        System.out.println("The sum of N negative numbers "+ sum);
    }
}
