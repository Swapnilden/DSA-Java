import java.util.Scanner;

public class reverseString {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter word: ");
    String str = sc.nextLine();
    String newStr = "";
    for (int i = str.length() - 1; i >= 0; i--) {
        newStr += str.charAt(i);
    }
    System.out.println("Reversed word is: "+ newStr);
   } 
}
