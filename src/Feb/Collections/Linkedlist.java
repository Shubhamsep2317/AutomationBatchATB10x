package Feb.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {

        List<String> ll=new LinkedList();
        ll.add("Shubham");
        ll.add("Sharma");
        ll.addLast("Orange");
        ll.addFirst("Mango");
        System.out.println(ll);

        System.out.println("--------------------->>>>>>>>>>>>>>");

        // Iterator we can use as a loop
        Iterator it= ll.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("--------------------->>>>>>>>>>>>>>");

        //For each loop
        for(String s:ll){
            System.out.println(s);
        }

        System.out.println("--------------------->>>>>>>>>>>>>>");

        //For loop
        for (int i=0;i<ll.size();i++){
            System.out.println(ll.get(i));
        }



    }
}
