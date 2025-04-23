package Feb.Collections;


import java.util.*;


public class Treemap {
    public static void main(String[] args) {

        Map<String,Integer> map= new TreeMap();

        map.put("Shubham",123);
        map.put("Binny",454);
        map.put("Sanyam",786);
        map.put("Shubham",321);

        for (Map.Entry<String,Integer> item:map.entrySet()){
            System.out.println("The name is  "+item.getKey()+" and roll number is  "+item.getValue());
        }

    }
}
