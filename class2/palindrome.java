import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        String str = Integer.toString(num);
        int n = str.length();
        int count = 0;
        for(int i=0; i<n/2; i++){
            if(str.charAt(i) == str.charAt(n-i-1)){
                continue;
            } else {
                System.out.println("Not a palindrome");
                count++;
            }
        }
        if(count == 0){
            System.out.println("Palindrome");
        }
    }
}
