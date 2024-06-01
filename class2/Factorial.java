import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n = sc.nextInt();
    int factorial = 1;
    while (n != 1){
        factorial = factorial*n;
        n--;
    }
    System.out.println("The factorial of given number is: "+ factorial);
  }  
}
