package Tasks.April;
// WAP to Remove special characters, numbers and characters from a string

public class InterviewQ_03_7April2025 {

    public static void main(String[] args) {

        String givenString = "ABC!@#$4581def";
        String lowercaseString = givenString.toLowerCase();
        System.out.println(lowercaseString);

        StringBuffer characters = new StringBuffer();
        StringBuffer specialChars = new StringBuffer();
        StringBuffer numbers = new StringBuffer();

        for (char ch : lowercaseString.toCharArray()) {

            if (Character.isDigit(ch)) {
                numbers.append(ch);
            } else if (Character.isAlphabetic(ch)) {
                characters.append(ch);
            } else {
                specialChars.append(ch);
            }
        }
        System.out.println("The numbers in the given String are--->>>" + numbers);
        System.out.println("The characters in the given String are--->>>" + characters);
        System.out.println("The Special Characters in the given String are--->>>" + specialChars);
    }

}
