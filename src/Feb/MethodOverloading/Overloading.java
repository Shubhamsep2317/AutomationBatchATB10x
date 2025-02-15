package Feb.MethodOverloading;

public class Overloading {
    int add(int a, int b){
        return a+b;
    }

    int add (int a, int b,int c){
        return a+b+c;
    }

    double add(double a,double b,String name){
        System.out.println("Hello my name is-->>> "+" "+name);
        return (a+b);
    }
}
