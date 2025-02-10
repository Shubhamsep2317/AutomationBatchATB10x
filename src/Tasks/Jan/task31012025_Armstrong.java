package Tasks.Jan;

import java.util.Scanner;

// Program to check armstrong number or not
public class task31012025_Armstrong {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter the number to check Armstrong number\n");
        String Number= sn.next();
        int originalNumberInteger=Integer.parseInt(Number);
        int armstrongNumber=0;
            for (char n : Number.toCharArray())
                if (Character.isDigit(n)){
                    //armstrongNumber += (int) Math.pow(Character.getNumericValue(n), Number.length());
                    armstrongNumber = armstrongNumber+ (int) Math.pow(Character.getNumericValue(n), Number.length());
        }
            System.out.println(armstrongNumber);

            if (originalNumberInteger==armstrongNumber){
                System.out.println("The number is armstrong Number");
            }
            else {
                System.out.println("The number is not a armstrong Number");
            }

    }
}
