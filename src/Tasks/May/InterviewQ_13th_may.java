package Tasks.May;

import java.util.Arrays;

public class InterviewQ_13th_may {

    public static void main(String[] args) {

        int[] given = {1, 2, 3, 4, 5, 6, 9, 78};

        Arrays.toString(given);

        reverseArray(given);

        System.out.print(Arrays.toString(given));


    }

    public static int[] reverseArray(int[] input) {

        int startIndex = 0;
        int endIndex = input.length - 1;


        while (startIndex < endIndex) {

            int temp = input[startIndex];
            input[startIndex] = input[endIndex];
            input[endIndex] = temp;

            startIndex++;
            endIndex--;
        }

        return input;


    }
}
