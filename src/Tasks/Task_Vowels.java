package Tasks;
// Program to find vowels in a String
import java.util.Arrays;

public class Task_Vowels {
    public static void main(String[] args) {
        int count=0;

        String name="Shubham";
        String STR1= name.toLowerCase();

        char[] vowels={'a','e','i','o','u'};
        char[] CHAR2=STR1.toCharArray();
        Arrays.sort(CHAR2);

        //System.out.println(CHAR2);

        for(int i=0;i<=4;i++){
            for (int j=0;j<=name.length()-1;j++){

                if(vowels[i]==CHAR2[j]){
                    count++;
                    System.out.println("The vowels are:"+" "+  vowels[i]);
                }
            }

        }
        System.out.println(count);
    }
    }