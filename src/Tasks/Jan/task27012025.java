package Tasks.Jan;

import java.util.Scanner;

// Program to find the year is leap year or not
public class task27012025 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter the year to check leap year or not\n");
        int year=0;
        if(sn.hasNextInt()){
            year=sn.nextInt();
        }
        else {
            System.out.println("Please enter year value only in integer");
            System.exit(0);
        }
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("The given year-->>"+" "+year+" "+"is a leap year");
        }
        else{
            System.out.println("The given year is not a leap year");
        }
    }
}
