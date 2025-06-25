package Tasks.June;

// WAP to shift the zeros in the int arr to left
import java.util.*;
public class Task2_25_06_2025
{
    public static void main(String[] args) {

        int [] arr={1,5,0,8,0,0,9,6,3,0,8,0,6,0};

        boolean swapped;

        do {
            swapped=false;
            for(int i=1;i<arr.length;i++){
                if(arr[i]==0 && arr[i-1]!=0){
                    int temp=arr[i];
                    arr[i]=arr[i-1];
                    arr[i-1]=temp;
                    swapped=true;
                }
            }

        }
        while(swapped);

        for (int i:arr){
            System.out.print(" "+i);
        }

    }
}
