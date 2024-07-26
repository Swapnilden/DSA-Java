import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println('a' + 1);

        System.out.println("a" + 1);
        // this is same as after a few steps: "a" + "1"
        // integer will be converted to Integer that will call toString()

        // System.out.println("Swapnil" + new ArrayList<>());
        System.out.println("Swapnil" + new Integer(56));
        String ans = new Integer(56) + "";
        System.out.println(ans);

        System.out.println("a" + 'b');
    }
}
