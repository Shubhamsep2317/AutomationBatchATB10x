package Feb.Collections;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection_Example {

    public static void main(String[] args) {
        Student s=new Student("Shubham",123,"Btech");
        Student s1= new Student("Binny",321,"MBA");
        Student s2= new Student("Sanyam", 786,"BCA");

        // Updating using getter setter methods in Student class
        s.setDisciple("Automation Engineer");
        s.setRollNumber(231);


        List<Object> student=new ArrayList<>();

        student.add(s);
        student.add(s1);
        student.add(s2);
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);

        // Output
        // Student{name='Shubham', rollNumber=123, disciple='Btech'}
        //Student{name='Binny', rollNumber=321, disciple='MBA'}
        //Student{name='Sanyam', rollNumber=786, disciple='BCA'}

        System.out.println("----------------------->>>>>>>>>");

        // Iterator Interface to get each value in ArrayList
        Iterator it= student.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        System.out.println("----------------------->>>>>>>>>");

        // For each loop
        for(Object o:student){
            System.out.println(o);
        }


    }


}
