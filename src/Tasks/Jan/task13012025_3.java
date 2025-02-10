package Tasks.Jan;

import java.util.Scanner;

public class task13012025_3 {
    public static void main(String[] args) {
        // Program to find palindrome string
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter a valid string to check palindrome\n");
        String originalString=sn.next();
        String lowerCaseOriginalString=originalString.toLowerCase();
        String reverseString="";

        for (int i =originalString.length()-1;i>=0;i--){
            reverseString=reverseString+lowerCaseOriginalString.charAt(i);
        }
//        System.out.println(reverseString);

        if(lowerCaseOriginalString.equals(reverseString)){
            System.out.println("The string is palindrome--->>>");
        }
        else{
            System.out.println("The string is not palindrome--->>>");
        }

    }
}
