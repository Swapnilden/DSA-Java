import java.util.Scanner;

public class SumOfNNaturalNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        System.out.println("The sum of n natural number is: " + sum(n));
    }

    static int sum(int n){
        int sum = 0;
        while(n > 0){
            sum += n;
            n--;
        }
        return sum;
    }
}
