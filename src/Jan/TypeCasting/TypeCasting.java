package Jan.TypeCasting;

public class TypeCasting {
    public static void main(String[] args) {
     int a= 200;
     byte b=(byte)a;
        System.out.println(b);// Explicit type casting>>> Narrowing --->>> Data loss

     long phoneNumber=9852657485L;
     int sTDCode=(int)phoneNumber;
        System.out.println(sTDCode);// Explicit type casting>>> Narrowing --->>> Data loss

        short c=127;
        int d=c;
        System.out.println(d);// Implicit type casting--->> JVM does it (Widening type casting)

        char A1='A';
        char A2='B';
        System.out.println(A1+A2);// Concatenation of characters-->> addition of ASCII values in output
        System.out.println(A1);


        String s =new String("Shubham");
        System.out.println(s);// new operator used to create object in heap memory



    }
}
