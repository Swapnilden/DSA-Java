import java.util.Scanner;

public class Batting_Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of runs scored by player 1 : ");
        int run = sc.nextInt();
        System.out.println("Enter number of matches played by player 1 : ");
        int match = sc.nextInt();
        System.out.println("Enter the number of player 1 was dismissed: ");
        int notOut = sc.nextInt();
        double out = match - notOut;
        double avg = (double)run/out;
        if(out == 0){
            System.out.println("NA");
        } else {
            System.out.println("Batting average of player 1 is : "+avg);
        }
       
        

    }
}
