package Tasks.August;
// WAP to extract the matching character at the start and end from a given string say input=abcXYabc
// output=abc
public class Task11_08_2025_2 {
    public static void main(String[] args) {

            String input = "abcXYabc";
            String result = "";

            boolean foundMatch= false;

            for (int i = input.length() / 2; i >= 1; i--) {
                String prefix = input.substring(0, i);
                String suffix = input.substring(input.length() - i);
                if (prefix.equals(suffix)) {
                    result = prefix;
                    foundMatch=true;
                    break;
                }
            }

            if (!foundMatch){
                System.out.println("No matching prefix/ suffix found");
            }
            else {
                System.out.println(result);
            }

        }
    }
