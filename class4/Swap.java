public class Swap {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;

        swap(a, b);

        System.out.println(a +" "+ b);
        String name = "Swapnil Srivastava";
        changeName(name);
        System.out.println(name);
    }

    static void changeName(String name){
        name = "Raj";
    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        // this change will only be valid in this function scope only
    }
}
