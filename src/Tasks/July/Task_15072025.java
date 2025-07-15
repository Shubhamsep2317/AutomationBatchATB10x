package Tasks.July;
// WAP to add unique pairs from a string input
import java.util.LinkedHashSet;
import java.util.Set;

public class Task_15072025 {
    public static void main(String[] args) {
        String input = "I love java programs";

        String inputRep = input.replaceAll(" ", "");

        char[] inputArr = inputRep.toCharArray();

        Set<String> list = new LinkedHashSet();

        for (int i = 0; i < inputArr.length; i++) {
            for (int j = i + 1; j < inputArr.length; j++) {
                if (inputArr[i] != inputArr[j]) {
                    list.add(" " + inputArr[i] + inputArr[j]);
                }
            }
        }

        for (String s : list) {
            System.out.print(" ," + s);
        }

    }
}
