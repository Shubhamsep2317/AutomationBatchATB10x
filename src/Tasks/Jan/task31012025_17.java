package Tasks.Jan;

import java.util.Scanner;

public class task31012025_17 {
    public static void main(String[] args) {
        int age=0;
        double salary=0.0;
        int creditScore=0;
        Scanner sn=new Scanner(System.in);

        System.out.println("Please enter your age\n");
        age = sn.nextInt();
        if((age>0 && age >=18) || age<=80) {
            System.out.println("The age of the person is ----->>>>"+age);
        }
        else{
            System.out.println("Please enter a valid positive age or age must be 18 years");
        }

        System.out.println("Please enter your salary\n");
        salary=sn.nextDouble();
        if(salary>0 && salary >=30000) {
            System.out.println("The Salary of the person is ----->>>>"+salary);
        }
        else{
            System.out.println("Salary should be positive or Salary must be greater than or equal to 30000");
        }

        System.out.println("Please enter your credit score\n");
        creditScore=sn.nextInt();
        if((creditScore>0 && creditScore >=650)||creditScore<=850) {
            System.out.println("Credit score should be positive or must be greater than 650 but less than or equal to 850 ");
        }
        else{
            System.out.println("The credit score of the person is ----->>>>"+creditScore);
        }




    }
}
