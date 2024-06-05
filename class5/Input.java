import java.util.Scanner;
import java.util.Arrays;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // array of primitives
        int[] arr = new int[5];
        arr[0] = 32;
        arr[1] = 24;
        arr[2] = 25;
        arr[3] = 89;
        arr[4] = 90;
        // [32, 24, 25, 89, 90]
        // System.out.println(arr[3]);

        // // input using for loop
        // for(int i = 0; i < arr.length; i++){
        //     arr[i] = in.nextInt();
        // }

        // System.out.println(Arrays.toString(arr));
        // for(int i = 0; i < arr.length; i++){
        //     System.out.print(arr[i] + " ");;
        // }

        // for (int num : arr) { // for every element in array, print the element
        //     System.out.print(num + " "); // here num represents element of the array
        // }

        // System.out.println(arr[5]); index out of bound

        // array of objects
        String[] str = new String[4];
        for (int i = 0; i < 4; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        // modify
        str[1] = "Swapnil";

        System.out.println(Arrays.toString(str));
    }
}
