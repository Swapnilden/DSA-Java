public class ReverseInt {
    public static void main(String[] args) {
        int num = 23597;
        int reverse = 0;

        while (num > 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }
        System.out.println(reverse);
    }
}