import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // String fruit = in.next();
        int day = in.nextInt();
        // switch (fruit) {
        //     case "Mango":
        //         System.out.println("King of fruits");
        //         break;
        //     case "Apple":
        //         System.out.println("A sweet red fruit");
        //         break;
        //     case "Orange":
        //         System.out.println("Round fruit");
        //         break;
        //     case "Grapes":
        //         System.out.println("Small fruit");
        //     default:
        //         System.out.println("Please enter a valid fruit");
        // }
        
        // switch (fruit) {
        //     case "Mango" -> System.out.println("King of fruits");
        //     case "Apple" -> System.out.println("A sweet red fruit");
        //     case "Orange" -> System.out.println("Round fruit");
        //     case "Grapes" -> System.out.println("Small fruit");
        //     default -> System.out.println("Please enter a valid fruit");
        // }

        // switch (day) {
        //     case 1:
        //     case 2:
        //     case 3:
        //     case 4:
        //     case 5:
        //         System.out.println("Weekday");
        //         break;
        //     case 6:
        //     case 7:
        //         System.out.println("Weekend");
        //         break;
        // }

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }


    }
}