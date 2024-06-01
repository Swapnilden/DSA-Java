import java.util.Scanner;

public class Depriciation_Of_Value {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of the asset: ");
    double value = sc.nextDouble();
    System.out.println("Enter the rate of Depreciation: ");
    double rate = sc.nextDouble();
    System.out.println("Enter the number of years: ");
    int years = sc.nextInt();
    
    for(int i=1; i<=years; i++){
        value *= (1 - (rate/100));
    }

    System.out.println("The value of the asset after given no.of years: "+ value);
   } 
}
