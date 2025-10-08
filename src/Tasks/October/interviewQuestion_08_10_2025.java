package Tasks.October;
// WAP to capitalize first word of each string word in the input
public class interviewQuestion_08_10_2025 {

    public static void main(String[] args) {

        String name = "shubham sharma";

        String[] split = name.split(" ");

        StringBuffer sb = new StringBuffer();

        for (String word : split) {
            if (word.length() > 0) {
                sb.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase()).append(" ");
            }


        }
        System.out.print(" " + sb.toString().trim());
    }
}
