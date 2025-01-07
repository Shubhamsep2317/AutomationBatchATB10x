package Jan.SwitchStatements;

import java.util.Scanner;

public class switchCaseMonth {
    public static void main(String[] args) {
        // Program to take input from the user (1-12) and printing months using switch case statements
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers between 1-12 to know the month\n");
        int month=sc.nextInt();
        switch(month){
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("Mar");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("Aug");
                break;
            case 9:
                System.out.println("Sep");
                break;
            case 10:
                System.out.println("Oct");
                break;
            case 11:
                System.out.println("Nov");
                break;
            case 12:
                System.out.println("Dec");
                break;
            default:
                System.out.println("Incorrect value as it can only range between 1-12");
                break;
        }
    }
}
