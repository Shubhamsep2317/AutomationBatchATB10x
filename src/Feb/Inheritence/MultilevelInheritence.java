package Feb.Inheritence;

public class MultilevelInheritence {
    public static void main(String[] args) {
        Son s=new Son();
        s.property();
        s.farmHouse();

       Father f=new Son();

       // incorrect reference
       //Son s1=new Father();
       f.property();
    }
}
