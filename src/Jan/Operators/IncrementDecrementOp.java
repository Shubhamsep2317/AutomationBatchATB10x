package Jan.Operators;

public class IncrementDecrementOp {
    public static void main(String[] args) {
        int a=10;
        System.out.println(++a + a++ + a++); /// Increment
        System.out.println(a);


        int c=20;
        System.out.println(--c + c++ + c--);// 19 +19+20 /// Decrement
        System.out.println(c);//-->> 19
    }
}
