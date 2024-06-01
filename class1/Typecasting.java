public class Typecasting {
   public static void main(String[] args) {
    // type casting
    // int a = (int)(67.56f);
    // System.out.println(a);

    // // automatic type promotion in expressions
    // int b = 257;
    // byte c = (byte)(b); // 257 % 256 = 1
    // System.out.println(c);

    // int number = 'A';
    // System.out.println(number);
    // //unicode - can write any language in print statement eg. hindi, chinese
    // System.out.println(3 * 5.67);

    // byte b = 42;
    // char c = 'a';
    // short s = 1024;
    // int i = 50000;
    // float f = 5.67f;
    // double d = 0.1234;
    // double result  = (f * b) + (i / c) - (d * s);
    // // float + int + double = double
    // System.out.println((f * b) + " " + (i / c) + " " + (d * s));
    // System.out.println(result);

    byte a  = 40;
    byte b = 50;
    byte c = 100;
    int i = (a * b)/c;
    System.out.println(i);


   } 
}
