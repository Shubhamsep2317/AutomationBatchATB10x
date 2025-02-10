package Tasks.Jan;

import java.util.Scanner;

public class PrimeNumber {
    // Program to print prime numbers from 1 to 100

     boolean isPrime(int n){

        if(n==0 ||n==1){
            return false;
        }
        else {
            for(int i=2;i<n;i++){
                if(n%i==0){
                    return false;// if Non-prime
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("Please enter the range upto 100 you want to print prime numbers:-->>\n");
        int N=sn.nextInt();

//Edge case
        if(N>100 || N<0){
            System.out.println("Please enter a valid range upto 100");
        }

         else {
            PrimeNumber p = new PrimeNumber();
            for (int j=1;j<=N;j++) {
                if (p.isPrime(j)) {
                    System.out.println(j);
                }
            }
        }
    }
}
