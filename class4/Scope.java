public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Swapnil";
        {
            // int a = 78; already initialised outside the block in the same function hence, cannot reinitialise it again.
            a = 100; // reassign the original reference variable to some other value
            System.out.println(a);
            int c = 99;
            name = "Raj";
            System.out.println(name);
            // values initialised in this block, will remain in block
        }
        int c = 900;
        System.out.println(a);
        System.out.println(name);
        // System.out.println(c) cannot use outside the block

        // scoping in for loop
        for (int i = 0; i < 4; i++) {
            // System.out.println(i);
            int num = 90;
            a = 10000;
        }
        System.out.println(a);
    }
}
