package Tasks;

import java.util.Locale;
import java.util.Scanner;

public class task13012025_2 {
    public static void main(String[] args) {
        // Program to count vowels and consonants in a string
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter the string to count vowels and consonants\n");
        String inputString=sn.next();
        String lowerCaseInput= inputString.toLowerCase();
        char[] countVowels=lowerCaseInput.toCharArray();
        char[] vowels={'a','e','i','o','u'};
        int countVow=0;
        int countConsonant=0;

        for(int i=0;i<vowels.length;i++){
            for (int j=0;j<countVowels.length;j++){
                if(vowels[i]==countVowels[j]){
                    countVow++;
                    System.out.println(countVowels[j]);
                }
                else{
                    countConsonant=countVowels.length-countVow;
                }
            }
        }
        System.out.println("The number of vowels--->>>" +countVow);
        System.out.println("The number of consonants---->>>"+ countConsonant);
    }
}
