import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        for (int i=1; i<=31; i++) {
            if (i%2==0) {
                count++;
            }
        }
        System.out.println("Kunal can go out with his friend for "+ count + " days");
    }
}
