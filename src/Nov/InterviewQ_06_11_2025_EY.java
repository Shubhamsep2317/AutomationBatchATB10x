package Nov;

// WAP to reverse each word in a String keeping the space intact
public class InterviewQ_06_11_2025_EY {
    public static void main(String[] args) {

        String input = "This is    a      String   value";

        StringBuilder temp = new StringBuilder();
        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()) {

            if (ch == ' ') {
                result.append(temp.reverse());
                temp.setLength(0);
                result.append(ch);
            } else {
                temp.append(ch);
            }

        }

        result.append(temp.reverse());
        System.out.print(result);

    }
}
