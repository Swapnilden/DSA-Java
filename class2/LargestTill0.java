import java.util.Scanner;

public class LargestTill0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        while ( true ){
            System.out.println("Enter the number: ");
            int n = sc.nextInt();
            if (n == 0){
                break;
            }else{
                if (n > max){
                    max = n;
                }
            }
        }
        System.out.println("Largest number is: "+ max);
    }
}
