import java.util.Scanner;

public class LargestOrSmallestOfThreeNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Please enter first number :");
        int first = scanner.nextInt();
 
        System.out.println("Please enter second number :");
        int second = scanner.nextInt();
 
        System.out.println("Please enter third number :");
        int third = scanner.nextInt();
 
        int largest = largest(first, second, third);
        int smallest = smallest(first, second, third);
 
        System.out.printf("largest of three numbers %d, %d, and %d is : %d %n",
                                   first, second, third, largest);
        System.out.printf("smallest of three numbers %d, %d, and %d is : %d %n", 
                               first, second, third, smallest);
    }

    static int largest(int a, int b, int c){
        int largest = a;
        if (b > largest){
            largest = b;
        }
        if (c > largest){
            largest = c;
        }
        return largest;
    }

    static int smallest(int a, int b, int c){
        int smallest = a;
        if (b < smallest){
            smallest = b;
        }
        if (c < smallest){
            smallest = c;
        }
        return smallest;
    }
}
