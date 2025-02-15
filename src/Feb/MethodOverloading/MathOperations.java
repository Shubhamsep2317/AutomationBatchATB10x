package Feb.MethodOverloading;

// it is also called as Compile Time polymorphism
public class MathOperations {
    public static void main(String[] args) {
        Overloading o=new Overloading();

        int sum=o.add(1,7,9);
        System.out.println(sum);

        double sum1=o.add(12.25,58.58,"Shubham");
        System.out.println(sum1);

        int sum3=o.add(78,58);
        System.out.println(sum3);
    }
}
