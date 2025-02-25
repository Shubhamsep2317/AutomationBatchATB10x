package Feb.Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map_HashMap {
    public static void main(String[] args) {

        // HashMap does not maintain the insertion order
        // Values are updated/replaced based on key if there are same keys with different value
        //
        Map<String,Integer> hashMap= new HashMap();

        hashMap.put("Shubham",231);
        hashMap.put("Binny",123);
        hashMap.put("Sanyam",786);
        hashMap.put("Sharma",213);
        hashMap.put("Binny",188);

        System.out.println(hashMap.containsKey("Binny"));
        System.out.println(hashMap.containsValue(153));
        System.out.println(hashMap.containsValue(786));
        System.out.println(hashMap.remove("Binny",123));
        System.out.println(hashMap.replace("Binny",188,881));


        System.out.println(hashMap);

        System.out.println("----------------->>>>>>>>");

        // Entry Set works with Maps to iterate over each value
        for(Map.Entry<String,Integer> item: hashMap.entrySet())
        {
            System.out.println(item);
        }

        System.out.println("----------------->>>>>>>>");

        //Iterator with entrySet is used to iterate over each value
        Iterator it=hashMap.entrySet().iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}
