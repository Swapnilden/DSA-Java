import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(isPalindrome(num));
    }

    static boolean isPalindrome(int num){
       String str = Integer.toString(num);
       int n = str.length();
       for(int i=0; i<n/2; i++){
        if(str.charAt(i) != str.charAt(n-i-1)){
            return false;
        }
       }
       return true;
    }
}
