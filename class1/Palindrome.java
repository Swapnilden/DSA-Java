import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();
        int n = word.length();
        boolean isPalindrome = true;
                    
        for(int i =0; i<n/2; i++){
            if(word.charAt(i) != word.charAt(n-i-1)){
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
