package Jan.Loops;

public class ex10012025 {
    public static void main(String[] args) {
        // Program to print odd and even numbers using continue statements
        int count=0;
        for (int i=0;i<=50;i++){
            if(i%2==0){
                System.out.println("Even number>>>"+" "+i);
                count++;
            }
            else {
                System.out.println(i);
            }
        }
        System.out.println("The count of even numbers is: "+ count);
    }
}
