package Tasks.August;

public class Task14_08_2025 {

    public static void main(String[] args) {

        String input = "aaabbbcccdddabcd";
        StringBuffer result = new StringBuffer();

        char previousChar = 12;

        for (char currentChar : input.toCharArray()) {
            if (previousChar != currentChar) {
                result.append(currentChar);
                previousChar = currentChar;
            }
        }

        System.out.print(" " + result);

    }
}
