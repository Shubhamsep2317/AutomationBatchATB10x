package Tasks.June;

import java.util.HashMap;
import java.util.Map;

// WAP to get the second highest element frequency in the array
public interface Task_25_06_2025 {
    public static void main(String[] args) {


        int[] arr={10,10,10,30,30,58};

        HashMap<Integer,Integer> hm= new HashMap();

        for (int i:arr){
            if(hm.containsKey(i)){
                hm.put(i,hm.get(i)+1);
            }
            else{
                hm.put(i,1);
            }
        }

        int maxValue=0;
        int secondMaxValue=0;

        for (int i:hm.values()){
            if(i>maxValue){
                secondMaxValue=maxValue;
                maxValue=i;
            }
            else if(i<maxValue && i>secondMaxValue){
                secondMaxValue=i;
            }
        }

        for (Map.Entry<Integer,Integer> item:hm.entrySet()){
            if (item.getValue()==secondMaxValue){
                System.out.println(" "+item.getKey());
            }
        }


    }
}
