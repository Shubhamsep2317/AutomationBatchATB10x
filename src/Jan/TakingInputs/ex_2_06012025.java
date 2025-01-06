package Jan.TakingInputs;

public class ex_2_06012025 {
    public static void main(String[] args) {

       int a=Integer.parseInt(args[0]);
       int b=Integer.parseInt(args[1]);

        //int result= (a>b) ? a:b;//// --->>> solution with ternary operator
        int result= Math.max(a, b);
        System.out.println(result);
    }
}
