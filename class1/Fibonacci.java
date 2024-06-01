import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of terms: ");
    int n = input.nextInt();
    int count = 0;
    int n1 = 0;
    int n2 = 1;
    int n3;
    System.out.print(n1 + " " + n2 + " ");
    while (count < n){
       System.out.print(n1 + n2 + " ");
       n3 = n1 + n2;
       n1 = n2;
       n2 = n3;
       count++;
    }
  }  
}
