package Feb.ExceptionHandling;

public class Finally {
    public static void main(String[]args){

        int a=10;
        int b = Integer.parseInt(args[0]);
        try {
            int c=a/b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("I am finally block");
        }
    }
}
