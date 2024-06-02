import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        // greeting();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.next();
        String personalized = myGreet(name);
        System.out.println(personalized);
    }

    static String myGreet(String name){
        String message = "Hello " + name;
        return message;
    }

    static void greeting() {
        System.out.println("Hello Swapnil!!");
    }
}
