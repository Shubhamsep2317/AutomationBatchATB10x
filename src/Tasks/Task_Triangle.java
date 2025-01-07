package Tasks;

import java.util.Scanner;

public class Task_Triangle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int s = 0;
        if (scan.hasNextInt()) {
            s = scan.nextInt();
        }

        int[] triangleSides = new int[s];

        System.out.println("Enter the elements of the array: ");

        for (int i = 0; i < s; i++) {
            triangleSides[i] = scan.nextInt();
        }
        while (triangleSides.length <= 3) {
            if (triangleSides[0] == triangleSides[1] && triangleSides[1] == triangleSides[2]) {
                System.out.println("Triangle is equilateral triangle");
                break;
            } else if (triangleSides[0] != triangleSides[2] && triangleSides[1] != triangleSides[0]) {
                System.out.println("Triangle is scalene triangle");
                break;
            } else {
                System.out.println("Triangle is isosceles triangle");
            }
                break;

        }
    }


}
