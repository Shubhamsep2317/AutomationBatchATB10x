package Tasks.June;
// WAP to reverse the last word and get out put as : I Love Java gnimmargorP
public class Task2_21_06_2025 {

    public static void main(String[] args) {
        String name="I Love Java Programming";


        StringBuilder sb=new StringBuilder();
        StringBuilder newString=new StringBuilder();

        String [] input=name.split(" ");

        for (int i=3;i<input.length;i++){
            sb.append(input[i]).reverse();
        }

        for (int i=0;i<input.length-1;i++){
            newString.append(input[i]).append(" ");
        }

        System.out.println(newString.append(sb).toString());
    }
}
