package Feb.GenricClass;

public class GenericClass {

    public static void main (String[]args){

        System.out.println(max(1.42,5.62,2.35));
        System.out.println(max("Shubham","Binny","Baby"));
        System.out.println(max(25,58,89));

        System.out.println("----------------------->>>>>>>>>>>");

        temp(10);
        temp("Shubham");
        temp(5.68);


    }


    // Generic class is used for reusability of Code
    // Instead of writing different methods for different data types we have generic functions
    //  We can use them by passing different Data types in generic functions
    public static <T extends Comparable<T>> T max(T a, T b,T c){

        T max=a;

        if(b.compareTo(max)>0){
            max=b;
        }

        if(c.compareTo(max)>0)
        {
           max=c;
        }

        return max;

    }

    public static <T> void temp(T a){
        System.out.println(a);
    }


}
