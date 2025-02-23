package Feb.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

public class Set_HashSet {
    public static void main (String[]args){

        Set s=new HashSet<>();

       // Duplicates are not allowed
       // Insertion order is not maintained

        s.add("Shubham");
        s.add("Sharma");
        s.add("Mango");
        s.add("Chipkoo");
        s.add("Mango");
        s.add(null);
        s.add(123);
        s.add(null);
        s.add("Shubham");
        System.out.println(s);// [Sharma, Mango, Chipkoo, 123, Shubham]

        System.out.println("--------------------------->>>>>>>>>>>>>>>>>>>>");

        // Iterator Interface to loop through each element in Set s
        Iterator it= s.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        // Output
        //Sharma
        //Mango
        //Chipkoo
        //123
        //Shubham

        System.out.println("--------------------------->>>>>>>>>>>>>>>>>>>>");

        // For each loop
        for(Object o:s)
        {
            System.out.println(o);
        }










    }
}
