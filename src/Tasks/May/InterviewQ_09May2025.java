package Tasks.May;

public class InterviewQ_09May2025 {

    public static void main(String[] args) {
        String name = "Hello World";

        String split[] = name.split(" ");

        for (int i = split.length - 1; i >= 0; i--) {
            System.out.print(" " + split[i]);
        }


        StringBuffer sb = new StringBuffer();

        sb.append(name);
        sb.replace(6, 11, " ");

        System.out.println(sb.reverse());


    }
}
