package Tasks;

import java.util.Scanner;

public class task31012025_18 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter the number of EU to calculate bill\n");
        int units=0;
        double electricityBill=0.0;
        if(sn.hasNextInt()){
            units=sn.nextInt();
        }
        else{
            System.out.println("Please enter the valid number of units in integer");
        }

        if(units>=1 && units<=100){
            electricityBill=0.50*units;
        }
        else if(units>=101 && units<=200){
            electricityBill=0.75*units;
        }
        else if(units>=201 && units<=300){
            electricityBill=1.20*units;
        }
        else if(units>=301){
            electricityBill=1.50*units;
        }
        else{
            if(units==0){
                System.out.println("No bill amount for you");
            }
        }
        System.out.println("Your bill amount is Rs ---->>>>"+electricityBill);
    }
}
