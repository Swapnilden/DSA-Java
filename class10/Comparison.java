public class Comparison {
    public static void main(String[] args) {
        String a = "Swapnil";
        String b = "Swapnil";
        String c = a;
        // System.out.println(a == c);
        // ==
        // System.out.println(a == b); // true

        String name1 = new String("Swapnil");
        String name2 = new String("Swapnil");
        // System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));
        System.out.println(name1.charAt(0));
    }
}
