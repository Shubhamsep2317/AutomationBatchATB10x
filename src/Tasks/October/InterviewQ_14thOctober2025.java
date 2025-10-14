package Tasks.October;
// WAP to give the count of character a in the given String array
import java.util.HashMap;
import java.util.Map;

public class InterviewQ_14thOctober2025 {
    public static void main(String[] args) {

        String[] fruits={"apple","banana","grapes"};

        Map<Character,Integer> hm=new HashMap();

        for (String fruit:fruits){

            char[] ch=fruit.toCharArray();

            for (char c:ch){

                if(hm.containsKey(c)){
                    hm.put(c,hm.get(c)+1);
                }
                else{
                    hm.put(c,1);
                }
            }
        }

        for (Map.Entry<Character,Integer> item:hm.entrySet()){
            if(item.getKey()=='p'){
                System.out.println("The count of "+item.getKey()+" is "+item.getValue());
            }
        }

    }
}
