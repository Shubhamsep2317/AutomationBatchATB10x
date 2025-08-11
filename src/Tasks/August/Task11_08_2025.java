package Tasks.August;

// WAP to add the digits in a given input string =a12b12c1
// Output sum=25
public class Task11_08_2025 {
    public static void main(String[] args) {
        String input = "a112b112c1";
        String temp = "";
        int sum = 0;


        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                temp += ch;
            } else {
                if (!temp.isEmpty()) {
                    sum += Integer.parseInt(temp);
                    temp = "";
                }
            }
        }

        if (!temp.isEmpty()) {
            sum += Integer.parseInt(temp);
        }

        System.out.println(sum);

    }
}
