package Tasks.September;

// WAP to find the largest unique substring
public class Task_07_10_2025_LargestUniqueSubstring {

    public static String longestSubstring(String s) {

        int maxlength = 0;


        int n = s.length();
        int startAt = 0;

        for (int i = 0; i < n; i++) {

            boolean visited[] = new boolean[256];


            for (int j = i; j < n; j++) {
                int currentLength = j - i + 1;

                char c = s.charAt(j);

                if (visited[c]) {
                    break;
                } else {
                    visited[c] = true;
                }

                if (currentLength > maxlength) {
                    maxlength = currentLength;
                    startAt = i;
                }
            }

        }

        return s.substring(startAt, startAt + maxlength);
    }


    public static void main(String[] args) {


        String input = "abcabcd";

        System.out.print(" " + longestSubstring(input));

    }
}
