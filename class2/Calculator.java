import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while( true ){
            System.out.println("Enter Operator: ");
            char op = sc.next().trim().charAt(0);
        if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
           System.out.println("Enter two numbers: ");
           int num1 = sc.nextInt();
           int num2 = sc.nextInt();
           if(op == '+'){
            System.out.println(num1 + num2);
            } else if(op == '-'){
                System.out.println(num1 - num2);
                } else if(op == '*'){
                    System.out.println(num1 * num2);
                    } 
                    else if(op == '/'){
                        if(num2 != 0){
                            System.out.println(num1 / num2);
                        }
                    }
                    else if(op == '%'){
                        if(num2 != 0){
                            System.out.println(num1 % num2);
                        }
                    }
            } else if (op == 'x' || op == 'X'){
                break;
            }  else {
                System.out.println("Invalid Operator!!!");
            }
        
        }
    }
}
