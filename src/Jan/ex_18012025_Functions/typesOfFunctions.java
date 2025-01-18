package Jan.ex_18012025_Functions;


public class typesOfFunctions {
    // With parameter and with return type
    static String greetFirstLastName(String firstName, String lastName){
        System.out.println("Hi, How are you?");
        return firstName+" "+lastName;
    }

    //With parameter and without return type
    static void ageOfPerson(int age){
        System.out.println("Your age is--->>>"+ age);
        if (age>=18){
            System.out.println("You are allowed to vote");
        }else{
            System.out.println("You are not allowed to vote");
        }
    }

    //Without parameter and with return type
    static boolean isMarried(){
        return false;
    }

    //Without parameter/arguments and without return type
    static void greetJavaLearner(){
        System.out.println("Welcome to Testing Academy classes");
    }


    public static void main(String[] args) {
        // Types of functions and methods
        //1. Without parameter/arguments and without return type
        //2. Without parameter and with return type
        //3. With parameter and with return type
        //4. With parameter and without return type
        String result=greetFirstLastName("Shubham", "Sharma");
        System.out.println(result);
        ageOfPerson(17);
        if(isMarried()){
            System.out.println("Happy Married Life");
        }else{
            System.out.println("Better luck Next time");
        }
        greetJavaLearner();
    }
}
