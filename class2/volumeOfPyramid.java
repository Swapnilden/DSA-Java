import java.util.Scanner;

public class volumeOfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the pyramid: ");
        double l = sc.nextDouble();
        System.out.println("Enter the width of the pyramid");
        double w = sc.nextDouble();
        System.out.println("Enter the height of the pyramid: ");
        double h = sc.nextDouble();
        double volume = (l * w * h) / 3;
        System.out.println("The volume of the pyramid is: "+ volume);
    }
}
