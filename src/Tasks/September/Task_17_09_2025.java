package Tasks.September;


// Write a program to remove substrings ab,bc,ade,mn from a given String
public class Task_17_09_2025 {

    public static void main(String[] args) {


        String[] str = {"ab", "bc", "ade", "nm"};

        String input = "abefbcdeadenmaf";

        boolean found = true;

        while (found) {
            found = false;

            for (String s : str) {
                if (input.contains(s)) {
                    input = input.replaceAll(s, "");
                    found = true;
                }
            }
        }

        System.out.print(" " + input);


    }
}
