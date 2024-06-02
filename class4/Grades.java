import java.util.Scanner;

public class Grades {
   public static void main(String[] args) {
    int totalSum = 0;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of subjects: ");
    int num = input.nextInt();
    for(int i = 0; i < num; i++){
        totalSum += input.nextInt();
    }
    System.out.println("The grade is: " + grades(totalSum, num));
   } 

   static String grades(int total, int num){
    double percentage = ((double)total/(num*100))*100;
    switch((int) percentage/10) {
        case 9:
        return "A+";
        case 8:
        case 7:
        return "A";
        case 6:
        return "B";
        case 5:
        return "C";
    }
    return "D";
   }
}
