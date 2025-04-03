package Tasks.April;

import java.util.LinkedHashSet;

// WAP to remove duplicate characters in a string and print a same string with no duplicates
public class InterviewQ_02 {

    public static void main(String[] args) {
        String name="Automation";


        LinkedHashSet<Character> uniqueChar= new LinkedHashSet();

        for (char ch:name.toLowerCase().toCharArray()){
            uniqueChar.add(ch);
        }

        for (char ch:uniqueChar){
            System.out.print(""+ch);
        }


    }
}
