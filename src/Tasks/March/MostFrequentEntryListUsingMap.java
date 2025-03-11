package Tasks.March;

import java.util.*;

public class MostFrequentEntryListUsingMap {

    // WAP a program to find most frequent entry in the list

    public static void main(String[] args) {

        List<Integer> list= new ArrayList<>(Arrays.asList(1,1,2,2,2,3,3,4,4,4,5,5,5,5,5));

        int mostFrequentElement=mostFrequentElement(list);

        System.out.println(mostFrequentElement);


    }

    public static int mostFrequentElement(List<Integer> list){

        Map<Integer,Integer> frequencyMap= new HashMap();

        for(int num:list){
            frequencyMap.put(num,frequencyMap.getOrDefault(num,0)+1);
        }

        int mostFrequentKey=list.get(0);
        int mostFrequentKeyOccurrence=0;

        for(Map.Entry<Integer,Integer> item:frequencyMap.entrySet()){

            if(item.getValue()>mostFrequentKeyOccurrence){
                mostFrequentKeyOccurrence= item.getValue();
                mostFrequentKey=item.getKey();
            }

        }


        return mostFrequentKey;
    }



}
