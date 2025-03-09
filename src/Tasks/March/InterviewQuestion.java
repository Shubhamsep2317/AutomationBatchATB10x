package Tasks.March;

import java.util.*;

public class InterviewQuestion {
    public static void main(String[] args) {

        People p1=new People("Shubham",30);
        People p2=new People("Binny",29);
        People p3= new People("Sanyam",27);

       List<People> l=new ArrayList<>();
       l.add(p1);
       l.add(p2);
       l.add(p3);

       Map<String,List<People>> hm=new HashMap<>();
       hm.put("Group1",l);

       for(Map.Entry<String,List<People>> item:hm.entrySet()){
           System.out.println("Key--->>>"+item.getKey());
           System.out.println("Values are as follow--->>>");
           for(People p: item.getValue()){
               System.out.println(p);
           }
       }
    }

}
class People{

    String name;
    int age;
    People(String name, int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "name= "+name+"   "+"age= "+age;
    }
}

