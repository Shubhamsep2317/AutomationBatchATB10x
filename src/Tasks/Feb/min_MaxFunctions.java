package Tasks.Feb;

import java.util.Scanner;

public class min_MaxFunctions {

     int getMaxValue(int[] a){
        int max=a[0];
        for (int i=0;i<a.length;i++){
          if(a[i]>max){
              max=a[i];
          }
      }
    return max;}

     int getMinValue(int[] a){
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        return min;}

    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("Please enter the length of array\n");
        int size= sn.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++){
            System.out.println("Please enter the elements in the array");
            arr[i]=sn.nextInt();
        }

        System.out.println("------------------->>>>>>>>>");

        min_MaxFunctions mm=new min_MaxFunctions();

        int maxValue=mm.getMaxValue(arr);
        int minValue=mm.getMinValue(arr);

        System.out.println(maxValue);
        System.out.println(minValue);

    // 2nd Largest value in the array
        for(int a=0;a<arr.length;a++){
            System.out.println("The second largest value in array is ------>>>>"+ arr[arr.length-2]);
            break;
        }


    }
}
