package Tasks.May;
// WAP to count the duplicate number of words in a String
import java.util.*;

public class InterviewQ_18May2025 {
    public static void main(String[] args) {

        String name = "My name is Shubham and Shubham is a SDET";

        String[] splitName = name.split(" ");

        HashMap<String, Integer> hm = new HashMap();

        for (int i = 0; i < splitName.length; i++) {
            if (hm.containsKey(splitName[i])) {
                hm.put(splitName[i], hm.get(splitName[i]) + 1);
            } else {
                hm.put(splitName[i], 1);
            }
        }

        for (Map.Entry<String, Integer> item : hm.entrySet()) {
            System.out.println("The String " + item.getKey() + " has occured " + item.getValue() + " times");
        }

    }
}
