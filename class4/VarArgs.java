import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        // fun(2, 5, 53, 56, 3);
        // multiple(2, 3, "Swapnil", "Raj", "gjkgwlf");
        demo(2, 3, 4);
    }    

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...v){

    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
