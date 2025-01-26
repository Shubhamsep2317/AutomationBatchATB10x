package Tasks;


import java.util.Scanner;
// Program to calculate factorial of an input number
public class task26012025 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter the number to calculate Factorial\n");
        int fact=1;
        int n=0;
        if(sn.hasNextInt()) {
            n = sn.nextInt();
            if(n==0){
                fact=1;
            }
        }
        else{
            System.out.println("Please enter a valid integer");
            System.exit(0);
        }

        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);

    }
}
