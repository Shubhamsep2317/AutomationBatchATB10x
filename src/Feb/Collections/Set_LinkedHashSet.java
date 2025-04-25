package Feb.Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Set_LinkedHashSet {
    public static void main(String[] args) {

        // Duplicates are not allowed
        // Order is maintained in LinkedHashSet
        Set<String> hs=new LinkedHashSet();
        hs.add("123");
        hs.add(null);
        hs.add("Shubham");
        hs.add("Chipkoo");
        hs.add("Sharma");
        hs.add(null);
        System.out.println(hs);

        System.out.println("--------------------->>>>>");

        // Iterator Interface to call each element
        Iterator it= hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        // Output:
        //null
        //123
        //Sharma
        //Chipkoo
        //Shubham

        System.out.println("--------------------->>>>>");

        //For each enhance loop
        for(String s:hs)
        {
            System.out.println(s);
        }



    }
}
