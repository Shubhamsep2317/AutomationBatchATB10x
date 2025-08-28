package Tasks.August;
// Write a java program to add only print the numbers whose sum is odd after adding
import java.util.*;

public class Task28_08_2025 {
    public static void main(String[] args) {
        String [] arr={"3445","857","0589","0","0698","0119","07"};

        List<String> li=new LinkedList();

        for (int i=0;i<arr.length;i++){

            String input=arr[i];
            int sum=0;
            for (char ch:input.toCharArray()){
                sum+=Character.getNumericValue(ch);
            }

            if(sum%2!=0){
                li.add(input);
            }
        }

        for (String item:li){
            System.out.print(" "+item+" ,");
        }
    }
}
