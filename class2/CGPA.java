import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks in Physics: ");
        double physics = sc.nextDouble();
        System.out.println("Enter the marks in Chemistry: ");
        double chemistry = sc.nextDouble();
        System.out.println("Enter the marks in Mathematics: ");
        double maths = sc.nextDouble();
        System.out.println("Enter the marks in Hindi: ");
        double hindi = sc.nextDouble();
        System.out.println("Enter the marks in English: ");
        double english = sc.nextDouble();
        double sum = (physics + chemistry + maths + hindi + english)/10.0;
        double cgpa = sum/5.0;
        System.out.println("The CGPA is: " + cgpa);

    }
}
