package Jan;

public class Lab002Operators {
    public static void main(String[] args) {
        int a =30;
        int b=10;
        a +=20;// Compound assignment operators
        b /=10;//Compound assignment operators
        System.out.println(a+b); // Arithmetic operators
        System.out.println(a*b); // Arithmetic operators
        System.out.println(a/b); // Arithmetic operators
        System.out.println(a-b); // Arithmetic operators
        System.out.println(a%b); // Arithmetic operators

        int c=40;
        c *=3;//Compound assignment operators
        float f=43.5000f;
        int d=42;

        if(c>=f){
            System.out.println("c<f");
        }
        else{
            System.out.println("c>f");
        }

        System.out.println(!(c>=d||d<f)); // Logical operators
        System.out.println(c!=d);//Relational operators
        System.out.println(c==f);//Relational operators
        System.out.println(c<=f&&d>c); //Relational operators and Logical operators

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
