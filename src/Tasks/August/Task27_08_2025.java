package Tasks.August;
// Write a Program to reverse only characters in a given String
public class Task27_08_2025 {
    public static void main(String[] args) {
        String s = "34abcd@45test78*love";

        StringBuilder temp= new StringBuilder();

        StringBuilder result= new StringBuilder();

        for (char ch:s.toCharArray()){
            if(Character.isLetter(ch)){
                temp.append(ch);
            }
            else{
                result.append(temp.reverse());
                temp.setLength(0);
                result.append(ch);
            }
        }

        result.append(temp.reverse());

        System.out.println(result);
    }
}
