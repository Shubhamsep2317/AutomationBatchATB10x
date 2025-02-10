package Tasks.Jan;

import java.util.Scanner;

public class task13012025 {
    public static void main(String[] args) {
        // Program to reverse a number by taking user input
        Scanner sn= new Scanner(System.in);
        System.out.println("Enter the number to reverse\n");
        int number=sn.nextInt();
        int reverseNumber=0;
        int remainder=0;
        int initialNumber=number;

        while(number!=0){
            remainder= number%10;
            reverseNumber=reverseNumber*10+remainder;
            number=number/10;
        }
        System.out.println("The reverse number is --->>"+" "+reverseNumber);

       // Check to see if palindrome number or not

       if(initialNumber==reverseNumber){
           System.out.println("The number is a palindrome number");
       }
       else {
           System.out.println("The number is not palindrome number");
       }

    }
}
