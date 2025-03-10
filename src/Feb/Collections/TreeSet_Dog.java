package Feb.Collections;

import java.util.TreeSet;

public class TreeSet_Dog {
// Interview Question Nagarro
// It will give an error Run Time-->> Class Cast Exception

    public static void main(String[] args) {
        TreeSet<Object> d=new TreeSet<>();
        d.add(new Dog(1));
        d.add(new Dog(2));
        d.add(new Dog(3));

        for(Object item:d)
        {
            System.out.println(item);
        }

    }


}


class Dog{

    Dog(int i){}
}
