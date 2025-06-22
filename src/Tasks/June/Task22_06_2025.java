package Tasks.June;

import java.util.HashMap;
import java.util.Map;

public class Task22_06_2025 {
    public static void main(String[] args) {
        String input = "tomorrow";

        HashMap<Character,Integer> hm= new HashMap();

        for (char ch:input.toCharArray()){
            if(hm.containsKey(ch)){
                hm.put(ch, hm.get(ch)+1);
            }
            else{
                hm.put(ch,1);
            }
        }


        for (Map.Entry<Character,Integer> item:hm.entrySet()){
            if (item.getValue()>1){
                for (char ch:input.toCharArray()){
                    if (hm.containsKey(item.getKey())){
                        input=input.replaceAll(item.getKey().toString(),item.getValue().toString());
                    }
                }
            }
        }

        System.out.println(input);

    }
}
