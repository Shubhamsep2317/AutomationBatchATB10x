package Tasks.June;
// WAP a program to left rotate an array
public class InterviewQuestion28_06_2025 {

    public static void main(String[] args) {

        int input = 2;

        int[] arr = {1, 2, 3};

        boolean swap;

        do {
            swap = false;

            for (int i = 0; i < input; i++) {
                int firstIndex = 0;
                int lastIndex = arr.length - 1;
                int middleIndex = (firstIndex + lastIndex) / 2;
                int temp = 0;
                for (int j = 0; j < arr.length; j++) {
                    if (firstIndex < lastIndex) {
                        temp = arr[firstIndex];
                        arr[firstIndex] = arr[middleIndex];
                        arr[middleIndex] = arr[lastIndex];
                        arr[lastIndex] = temp;
                        firstIndex++;
                        lastIndex--;
                    }
                }
            }

        }

        while (swap);


        for (int i : arr) {
            System.out.print(" " + i);
        }

    }

}
