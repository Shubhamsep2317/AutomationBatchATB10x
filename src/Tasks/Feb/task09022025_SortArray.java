package Tasks.Feb;


public class task09022025_SortArray {
    // Program to Sort int Array without using Methods like Arrays.Sort
    public static void main(String[] args) {
        int[] arr={12,34,10,1,100,3,4,32};
        int temp=0;
        for (int i=0;i<arr.length;i++) {
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }

        for (int n:arr){
           System.out.print(n+" ,");
        }
        }

    }

