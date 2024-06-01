import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first numbers: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second numbers: ");
        int num2 = sc.nextInt();
        int n = 0;
        int max = 0;
        if(num1 < num2){
            n = num1;
        } else {
            n = num2;
        }
        for(int i=1; i<=n; i++) {
            if(num1%i == 0 && num2%i == 0){
                max = i;
            }
        }
        System.out.println("The HCF is: "+ max);
    }
}
