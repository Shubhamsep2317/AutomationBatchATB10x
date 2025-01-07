package Jan.TakingInputs;

import java.util.Scanner;

public class ex_01_06012025_ScannerInput {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the age\n");
        int age= scanner.nextInt();

        while( age>0){
            System.out.println("Enter the name\n");
            String name=scanner.next();
            System.out.println("Enter the salary\n");
            int salary= scanner.nextInt();
            System.out.println("Your name is :"+" "+name+" "+"and your salary is"+" "+salary+" "+"and your age is"+" "+age);
            break;
        }
        scanner.close();
    }
}
