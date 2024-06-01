import java.util.Scanner;

public class AddNOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of odd numbers: ");
        int n = sc.nextInt();
        int count = 1;
        int sum = 0;
        int i = 1;
        while (count <= n) {
           if (i%2 != 0){
            sum += i;
            count++;
           }
           i++;
        }
        System.out.println("The sum of n odd positive integer is " + sum);
    }
}
