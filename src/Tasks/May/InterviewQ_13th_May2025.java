package Tasks.May;

public class InterviewQ_13th_May2025 {

    public static void main(String[] args) {

        String name="India";

        System.out.println(reverseString(name));


    }


    public static String reverseString(String input){

        char ch[]=input.toCharArray();

        StringBuilder sb=new StringBuilder();

        for(int i=ch.length-1;i>=0;i--){
            sb.append(ch[i]);
        }

        return sb.toString().trim();
    }
}
