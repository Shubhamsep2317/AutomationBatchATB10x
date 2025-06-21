package Tasks.June;
// WAP to get output= S.K. Sharma
public class Task21_06_2025 {

    public static void main(String[] args) {
        String name="Satish Kumar Sharma";

        String[] splitName=name.split(" ");


        StringBuilder sb= new StringBuilder();

        for (int i=0;i<splitName.length-1;i++){
            sb.append(splitName[i].charAt(0)).append(".");
        }

        sb.append(splitName[splitName.length-1]);

        System.out.println(sb.toString());
    }
}
