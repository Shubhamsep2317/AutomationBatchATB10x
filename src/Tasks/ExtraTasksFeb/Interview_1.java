package Tasks.ExtraTasksFeb;

public class Interview_1 {


// Program to find max and min string words in a given input string
    public static void main(String[] args) {

        String input = "vision without action is day dream";

        String[] splitString = input.split(" ");

        for (int i = 0; i < splitString.length; i++) {
            System.out.println(splitString[i]);
        }
        int minLength = splitString[0].length();
        int maxLength = splitString[0].length();

        for (int i = 0; i < splitString.length; i++) {
            if (minLength > splitString[i].length()) {
                minLength = splitString[i].length();
                System.out.println("The minimum length string in the input is---->>>" + splitString[i]);
            }
        }
        for (int i = 0; i < splitString.length; i++) {
            if (maxLength < splitString[i].length()) {
                maxLength = splitString[i].length();
                System.out.println("The maximum length string in the input is---->>>" + splitString[i]);
            }
        }
    }
}
