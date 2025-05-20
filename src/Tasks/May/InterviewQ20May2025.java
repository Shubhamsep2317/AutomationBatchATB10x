package Tasks.May;

import java.util.HashMap;
import java.util.Map;

public class InterviewQ20May2025 {
// Find the number occurring odd number of times in an array
//{20, 40, 50, 40, 50, 20, 30, 30, 50, 20, 40, 40, 20};

    public static void main(String[] args) {


        int[] input = {20, 40, 50, 40, 50, 20, 30, 30, 50, 20, 40, 40, 20};

        returnOddNumber(input);


    }

    public static void returnOddNumber(int[] input) {

        HashMap<Integer, Integer> hm = new HashMap();


        for (int a : input) {
            if (hm.containsKey(a)) {
                hm.put(a, hm.get(a) + 1);
            } else {
                hm.put(a, 1);
            }

        }

        for (Map.Entry<Integer, Integer> item : hm.entrySet()) {

            if (item.getValue() % 2 != 0) {
                System.out.println(item.getKey());
            }

        }


    }
}
