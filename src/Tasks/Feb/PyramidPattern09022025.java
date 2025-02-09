package Tasks.Feb;

import java.util.Scanner;

public class PyramidPattern09022025 {
    public static void main(String[] args) {
        Scanner sn =new Scanner(System.in);
        System.out.println("Enter the number of lines to print for triangle\n");
        int n =sn.nextInt();

        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i*2-1;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
