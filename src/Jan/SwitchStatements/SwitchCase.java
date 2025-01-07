package Jan.SwitchStatements;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        // Program to take input num1 and num2 from the user and also taking input for arithmetic operation type
        // need to perform on two numbers
        Scanner sc= new Scanner(System.in);
        System.out.println("Please select arithmetic operation among +, - , * or %\n");
        String symbol=sc.next();
        System.out.println("Please add Ist number\n");
        int num1=sc.nextInt();
        System.out.println("Please add 2nd number\n");
        int num2=sc.nextInt();
        switch (symbol){
            case "+":
                System.out.println(num1+num2);
                break;
            case "*":
                System.out.println(num1*num2);
                break;
            case "-":
                System.out.println(num1-num2);
                break;
            case "%":
                System.out.println(num1%num2);
                break;
            default:
                System.out.println("Invalid input");
                break;

        }
    }
}
