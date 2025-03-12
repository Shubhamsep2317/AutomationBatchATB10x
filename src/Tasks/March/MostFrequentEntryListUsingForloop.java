package Tasks.March;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MostFrequentEntryListUsingForloop {

    // WAP to find Most Frequent Entry in the List Using Forloop

    public static void main(String[] args) {

        List<Integer> list = new ArrayList <>(Arrays.asList(1,1,2,2,2,7,3,3,3,5,5,5,5,5,6,6,7,7,7,7,7));

        int mostFrequentElementItem=mostFrequentElementItem(list);

        System.out.println(mostFrequentElementItem);

    }

    public static int mostFrequentElementItem(List<Integer> list){

        Collections.sort(list);

        if(list.isEmpty()){
            throw new IllegalArgumentException("List is empty");
        }

        int mostFrequentElement= list.get(0);
        int currentCount=0;
        int maxCount=0;

        for(int i=1;i<list.size();i++){
            if(list.get(i).equals(list.get(i-1))){
                currentCount++;
            }
            else{
                currentCount=1;
            }

            if(currentCount>maxCount){
                maxCount=currentCount;
                mostFrequentElement= list.get(i);
            }
        }
        return mostFrequentElement ;
    }

}
