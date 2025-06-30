package Tasks.June;

import java.util.HashMap;
import java.util.LinkedHashMap;


// WAP to make sure that input string has unique characters
public class Interview30_06_2025 {
    public static void main(String[] args) {
        String input="jfmdhcvcv";
        boolean uniqueChar=false;

        HashMap<Character,Integer> hm= new LinkedHashMap();

        for (char ch:input.toCharArray()){
            if (hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)+1);
            }
            else{
                hm.put(ch,1);
            }
        }

        int count=0;

        for (int i:hm.values()){
            if(i==1){
                uniqueChar =true;
                count++;

            }
            else if(i>1){
                uniqueChar =false;
            }
        }

        if (input.length()==count){
            System.out.println("The string has all unique characters  ="+uniqueChar);
        }

        else{
            System.out.println("The string do not have unique characters");
        }


    }
    }

