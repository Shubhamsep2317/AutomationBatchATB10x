package Jan.SwitchStatements;

import java.util.Scanner;

public class ConversionsProgram {
    public static void main(String[] args) {
        // Program to convert km into miles and Degree C into Fahrenheit using switch case

        Scanner sc= new Scanner(System.in);
        System.out.println("What do yo want to convert Kilometers or Celsius");
        String conversion=sc.next();
        String lowerCaseConversion=conversion.toLowerCase();

        if(lowerCaseConversion.equalsIgnoreCase("Kilometers") ||lowerCaseConversion.equalsIgnoreCase("Celsius")) {
            switch (lowerCaseConversion) {
                case "kilometers":
                    System.out.println("Enter the Kilometers\n");
                    float numberOfKilometers=sc.nextFloat();
                    System.out.println("Number of equivalent miles:"+" "+numberOfKilometers*0.62);
                    break;
                case "celsius":
                    System.out.println("Enter the Celsius\n");
                    float numberOfCelsius=sc.nextFloat();
                    System.out.println("Number of equivalent Fahrenheit:"+" "+numberOfCelsius*9/5+32);
                    break;
                default:
                    System.out.println("Invalid value is entered for conversion");
                    break;
            }
        }
        else {
            System.out.println("Invalid Entry entered other than Kilometers or Celsius");
        }
    }
}
