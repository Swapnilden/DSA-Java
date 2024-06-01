import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of units in KWh: ");
        int u = sc.nextInt();
        int bill = 0;
        if (u > 300){
            int amount = u - 300;
            bill += (amount)*25;
            u = u - amount;
        }
        if (u > 200) {
            int amount = u - 200;
            bill += (amount)*20;
            u = u - amount;
        }
        if (u > 100) {
            int amount = u - 100;
            bill += (u-amount)*15;
            u = u - amount;
        } 
        
            bill += u*10;
    
        System.out.println("The electricity bill is of: " + bill + "Rs.");
    }
}
