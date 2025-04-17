package Tasks.April;

import java.util.HashMap;
import java.util.Map;

// WAP to count the number of same characters in a string
public class InterviewQ_04 {

    public static void main(String[] args) {

        String name = "shubham sharma";
        String nameChar = name.replace(" ", "");

        Map<Character, Integer> charCountMap = new HashMap<>();


        for (char ch : nameChar.toCharArray()) {
            if (charCountMap.containsKey(ch)) {
                charCountMap.put(ch, charCountMap.get(ch) + 1);
            } else {
                charCountMap.put(ch, 1);
            }
        }

        for(Map.Entry<Character,Integer> item: charCountMap.entrySet()){

            System.out.println("The character  "+item.getKey()+" has occurred "+item.getValue()+"  times");

        }

    }


}
