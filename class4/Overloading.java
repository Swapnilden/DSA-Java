public class Overloading {
    public static void main(String[] args) {
        fun(67);
        // fun("Swapnil Srivastava");
        int ans = sum(3, 4, 78);
        System.out.println(ans);
    }

    static int sum(int a, int b){
        return a + b;
    }

    static int sum(int a, int b, int c){
        return a + b + c;
    }

    static void fun(int a){
        System.out.println("First One");
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println("Second One");
        System.out.println(name);
    }
}

