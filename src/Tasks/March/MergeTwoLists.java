package Tasks.March;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeTwoLists {

    // WAP to merge two sorted lists into single sorted list

    public static void main(String[] args) {

        List<Integer> list1= new ArrayList<>(Arrays.asList(1,3,5,7,9));
        List<Integer> list2=new ArrayList<>(Arrays.asList(2,4,6,8,10));

        List<Integer> mergedList=mergerListFunction(list1,list2);

        System.out.println(mergedList);

    }
    public static List<Integer> mergerListFunction(List<Integer> list1, List<Integer> list2){

        List<Integer> result= new ArrayList<>();

        int i=0, j=0;

        while(i<list1.size() && j<list2.size()){
            if (list1.get(i) < list2.get(j))
            {
                result.add(list1.get(i++));
            }
            else {
                result.add(list2.get(j++));
            }
        }
        while(i<list1.size()){
            result.add(list1.get(i++));
        }
        while(j<list2.size()){
            result.add(list2.get(j++));
        }
        return result;
    }
}
