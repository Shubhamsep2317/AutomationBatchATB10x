package Tasks.April;
// WAP to add the digits in a given string "automation 658engineer" --->> o/p--->
// "automation 19engineer"

public class InterviewQ_01 {

    public static void main(String[] shubham) {

        String designation = "automation 658engineer";
        String num = "";
        String characters = "";


        for (char ch : designation.toCharArray()) {
            if (Character.isDigit(ch)) {
                num += ch;
            } else {
                characters += ch;
            }
        }
        System.out.println(num);
        System.out.println(characters);

        int sum = 0;
        for (char ch : num.toCharArray()) {
            sum += Character.getNumericValue(ch);
        }

        System.out.println(sum);

        characters= characters.replace(" "," "+sum);
        System.out.println(characters);

    }


}
