package Tasks.April;



public class InterviewQ_05 {

    public static void main(String[] args) {

        String name="shubham sharma";

        String nameChar=name.replace(" ","");

        char[] arr=nameChar.toCharArray();


       boolean [] booleans=new boolean[arr.length];

        for(int i=0;i<arr.length;i++){
            if(booleans[i]){
                continue;
            }
            int count=1;
            for(int j=i+1;j<arr.length;j++){

                if(arr[i]==arr[j]){
                    count++;
                    booleans[j]=true;
                }

            }
            System.out.println(" The count of   "+arr[i]+" is   "+  count);
        }


    }

}
