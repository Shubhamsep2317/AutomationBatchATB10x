package Feb.Collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Arraylist {
    public static void main(String[] args) {

        List l=new ArrayList();

        l.add("Shubham");
        l.add("Sharma");
        l.add(123);
        l.add("Family");
        l.addFirst(9856956);
        l.remove(3);
        System.out.println(l.get(2));
        System.out.println(l.size());
        System.out.println(l);

        // Iterator method to iterate over collections

        Iterator it= l.iterator();
        while(it.hasNext()){

            System.out.println(it.next());
        }

        System.out.println("------------>>>>>>>>>");

        // Enhance For each loop we can use as well
        for(Object o:l)
        {
            System.out.println(o);
        }

        System.out.println("------------->>>>>>>>");

        // We can use For Loop as well
        for (int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }


    }
}
