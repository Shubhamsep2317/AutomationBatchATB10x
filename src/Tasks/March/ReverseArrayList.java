package Tasks.March;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArrayList {

    // Reverse Arraylist program
    public static void main(String[] args) {

        List<Integer> l=new ArrayList<>(Arrays.asList(1,2,3,8,10));

        Collections.reverse(l);
        System.out.println(l);

        List<String> l1=new ArrayList<>(Arrays.asList("Abc","def","xyz"));
        Collections.reverse(l1);
        System.out.println(l1);


    }
}
