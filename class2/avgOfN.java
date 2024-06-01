import java.util.Scanner;

public class avgOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        double avg = (n + 1)/2.0;
        System.out.println("Average of N numbers is: "+ avg);
    }
}
