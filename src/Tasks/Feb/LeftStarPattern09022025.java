package Tasks.Feb;

import java.util.Scanner;
// Program to print left star pattern
public class LeftStarPattern09022025 {
    public static void main(String[] args) {
        Scanner sn =new Scanner(System.in);
        System.out.println("Enter the number of lines to print for triangle\n");
        int n =sn.nextInt();

        for (int i=0;i<=n;i++){
            for (int j=0;j<=n-i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

}
