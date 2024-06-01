import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();
        int count = 2;
        while(count < n){
            if(n % count == 0){
                System.out.println("Not Prime");
                return;
            }
            count = count + 1;
        }

        if(count == n){
            System.out.println("Prime");
        }
    }
}
