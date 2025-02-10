package Tasks.Jan;

import java.util.Scanner;

public class task19012025_Functions {
     static int addition(int a,int b){
         return (a+b);
     }
    static int subtraction(int a,int b){
        return (a-b);
    }
    static int multiplication(int a,int b){
        return (a*b);
    }
    static int modulus(int a,int b){
        return (a%b);
    }
    static int division(int a,int b){
        return (a/b);
    }


    public static void main(String[] args) {

        Scanner sn=new Scanner(System.in);
        System.out.println("Enter the value of A\n");
        int A =sn.nextInt();
        System.out.println("Enter the value of B\n");
        int B =sn.nextInt();

        int result=modulus(A,B);
        System.out.println(result);

        int result1=multiplication(A,B);
        System.out.println(result1);


    }
}
