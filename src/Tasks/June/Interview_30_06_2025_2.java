package Tasks.June;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// WAP to get the anagram Set from a given String array
public class Interview_30_06_2025_2 {
    public static void main(String[] args) {
        String[] input = {"bat", "mat", "rat", "tea", "ate", "tab", "tar", "shu"};


        Map<String, ArrayList<String>> anagramMap = new HashMap();

        for (String word : input) {

            char[] characters = word.toCharArray();

            Arrays.sort(characters);


            String key = new String(characters);

            if (!anagramMap.containsKey(key)) {
                anagramMap.put(key, new ArrayList<String>());
            }

            anagramMap.get(key).add(word);

        }

        for (ArrayList<String> item : anagramMap.values()) {
            System.out.println(" " + item);
        }

        for (String s : anagramMap.keySet()) {
            System.out.println(" " + s);
        }

    }
}

