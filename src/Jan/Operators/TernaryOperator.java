package Jan.Operators;

public class TernaryOperator {
    public static void main(String[] args) {
        //Ternary operator Syntax
        // result= condition ? exp1:exp2;


        // Nested Ternary operator
        // result= condition1 ? exp1: condition2 ? exp2 : condition3 ? exp3:...... exp4;

        int age=24;
        String result= (age>25) ? "You can go to Goa":"You cannot go to goa";
        System.out.println(result);

        // Grade system
        // if score 90 to 100 ---> Grade A
        // if score 80 to 89  ---> Grade B
        // if score 70 to 79  ---> Grade C
        // if score 60 to 69  ---> Grade D
        // if less than 60    ---> Grade F

        int score=72;
        String finalResult=(score>=90) ? "Grade A": (score>=80) ? "Grade B": (score>=70) ? "Grade C": (score>=60) ? "Grade D": "You are failed:F";
        System.out.println(finalResult);

        int a =100;
        int b=101;
        float c=24.9999999999f;

        String comparisonResult= (a>b && a>c) ? "A is greater": (b>=c)? "B is greater": "C is greater";
        System.out.println(comparisonResult);

    }
}
