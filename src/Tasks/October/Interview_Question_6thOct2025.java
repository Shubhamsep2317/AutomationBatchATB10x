package Tasks.October;

public class Interview_Question_6thOct2025 {
    public static void main(String[] args) {

        String name = "Hello World";

        String result = "";

        StringBuffer temp = new StringBuffer();

        String[] splitArr = name.split(" ");

        for (String word : splitArr) {


            if (word.length() > 0) {

                char ch[] = word.toCharArray();

                for (int i = ch.length - 1; i >= 0; i--) {
                    result += ch[i];
                }
                temp.append(result).append(" ");

                result = "";

            }
        }

        System.out.print(" " + temp);


    }
}
