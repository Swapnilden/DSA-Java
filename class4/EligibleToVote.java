import java.util.Scanner;

public class EligibleToVote {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your age: ");
    int age = input.nextInt();
    if (eligibleToVote(age)) {
        System.out.println("You are eligible to vote.");
    } else {
        System.out.println("You are not yet eligible to vote.");
    }
  }  

  static boolean eligibleToVote(int age){
    if (age >= 18){
        return true;
    }
    return false;
  }
}
