package Tasks.May;
// WAP to eliminate given values from an array
public class InterviewQ_10_May2025 {
    public static void main(String[] args) {
        int arr[]= {1, 5, 2, 8, 1, 9, 1};

        int eliminateValue=1;
        int count=0;

        for(int value:arr){
            if(value==eliminateValue){
                count++;
            }
        }

        int newArr[]= new int[arr.length-count];

        int index=0;

        for (int value:arr){
            if(value!=eliminateValue){
                newArr[index++]=value;
            }
        }

        for (int value:newArr){
            System.out.print(value+ "," );
        }
    }
}
