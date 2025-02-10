package Tasks.Jan;

import java.util.Scanner;
// Program to Find Fibonacci series upto given input numbers
public class task26012025_2 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter the numbers till you want Fibonacii Series");
        int n=0;
        if(sn.hasNextInt()){
            n=sn.nextInt();
        }
        else{
            System.out.println("Please enter a valid value");
            System.exit(0);
        }
        int A=0;
        int B=1;
        int fibonacci=0;
        for (int i=1;i<=n;i++){
          fibonacci=A+B;
          A=B;
          B=fibonacci;
            System.out.println(fibonacci);
        }

    }
}
