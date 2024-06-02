import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        
        if(evenOrOdd(num)){
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }

    static boolean evenOrOdd(int n){
        if (n % 2 == 0){
            return true;
        }
        return false;
    }
}
