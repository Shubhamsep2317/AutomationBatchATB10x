package Tasks.Feb;

import java.util.Scanner;

public class RightAngledTriangle09022025 {
    // Program to print right angle triangle from the left
    public static void main(String[] args) {

        Scanner sn =new Scanner(System.in);
        System.out.println("Enter the number of lines to print for triangle\n");
        int n =sn.nextInt();

        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
