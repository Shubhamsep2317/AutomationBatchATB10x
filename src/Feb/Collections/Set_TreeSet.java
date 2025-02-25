package Feb.Collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Set_TreeSet {
    public static void main(String[] args) {

        // Duplicates are not allowed
        // Null values not and can cause NullPointerException
        // Sorting is done automatically
        // Different mixtures of elements are not allowed as sorting will not be applicable
        Set tSet= new TreeSet<>();
        tSet.add("Shubham");
        tSet.add("ArmStrong");
        tSet.add("Binny");
        tSet.add("123");
        tSet.add("Shubham");
        tSet.add("Sharma");

        System.out.println(tSet);


        System.out.println("------------------>>>>>>>>>>>");

        //Iterator interface to print the elements
        Iterator it= tSet.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("------------------>>>>>>>>>>>");

        //For each loop to print each element
        for(Object o:tSet){
            System.out.println(o);
        }

    }
}
