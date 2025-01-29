package Tasks;
import java.util.Scanner;
// Program to check input character is vowel or not
public class task_29012025 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        char ch='a';
        System.out.println(" Enter a character to check vowel or consonant");
        if(sn.hasNextInt()){
            System.out.println("Please enter a valid character");
            System.exit(0);
        }
        else {
            ch = sn.next().charAt(0);
        }

        char[] vowels={'a','e','i','o','u'};

        for (int i=0;i<vowels.length;i++){
            if(vowels[i]==ch){
                System.out.println("The character---->>>"+ch+" "+"is a vowel");
                System.exit(0);
            }
            else{
                System.out.println("The character--->>>"+ch+" "+"is a consonant");
                System.exit(0);
            }
        }

    }
}
