package Tasks.April;

public class Interview_Q_06LargestSubstring {

    public static void main(String[] args) {

        String str = "Shubham is a Automation Engineer";


        String[] newString = str.split(" ");

        String largest = newString[0];
        String smallest = newString[1];

        for (String n : newString) {

            if (largest.toCharArray().length < n.toCharArray().length) {
                largest = n;
            } else if (smallest.toCharArray().length > n.toCharArray().length) {
                smallest = n;
            }

        }
        System.out.println("The largest substring is  "+largest);
        System.out.println("The smallest substring is  "+smallest);

    }
}
