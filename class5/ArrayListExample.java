import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        // list.add(68);
        // list.add(758);
        // list.add(73);
        // list.add(37);
        // list.add(67);
        // list.add(76);

        // System.out.println(list.contains(34));
        // System.out.println(list);
        // list.set(0, 99);
        // list.remove(2);
        // System.out.println(list);

        // input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        // output
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i) + " "); // pass index here, list[index] syntax will not work here
        }

    }
}
