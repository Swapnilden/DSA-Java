import java.util.Scanner;

public class AddNEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of even numbers: ");
        int n = sc.nextInt();
        int count = 0;
        int sum = 0;
        int i = 0;
        while (count <= n) {
           if (i%2 == 0){
            sum += i;
            count++;
           }
           i++;
        }
        System.out.println("The sum of n even positive integer is " + sum);
    }
}