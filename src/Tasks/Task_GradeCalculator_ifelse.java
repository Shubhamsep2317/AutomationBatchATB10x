package Tasks;

import java.util.Scanner;

public class Task_GradeCalculator_ifelse {
    public static void main(String[] args) {
        // Grade Calculator
        //score 90-100--->>> A
        //score 80-89--->>> B
        //score 70-79--->>> C
        //score 60-69--->>> D
        //score 0-59--->>> F

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your score\n");
        int score=sc.nextInt();
        if(score<0 || score>100){
            System.out.println("You are GOD");
        }
        else if (score>=90 && score<=100){
            System.out.println("Your grade is "+" "+'A');
        }
        else if(score>=80 && score<=89){
            System.out.println("Your grade is "+" "+'B');
        }
        else if(score>=70 && score<=79){
            System.out.println("Your grade is "+" "+'C');
        }
        else if(score>=60 && score<=69){
            System.out.println("Your grade is "+" "+'D');
        }
        else{
            System.out.println("Your grade is "+" "+'F');
        }
        sc.close();

    }
}
