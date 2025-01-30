package Jan.Strings;

public class Strings_30012025 {
    public static void main(String[] args) {
        String str="Shubham";
        String str1=str.concat("Sharma");
        System.out.println(str);
        System.out.println(str1);

        StringBuffer sb=new StringBuffer("Shubham");
        sb.append("Sharma");
        System.out.println(sb);

        StringBuilder stb=new StringBuilder("Shubham");
        stb.append("  Sharma");
        System.out.println(stb);

        // String methods important

        String sub=str.substring(0,3);// substring method
        System.out.println(sub);

        String fruits="Banana-Apple-Cherry-Pineapple-Guava";
        String[] split_fruits=fruits.split("-");//split method
        for(int i=0;i<split_fruits.length;i++) {
            System.out.println(split_fruits[i]);
        }

        String spaces="    Hello World     ";// trim method to remove leading and trailing spaces
        System.out.println(spaces);
        String withoutSpaces=spaces.trim();
        System.out.println(withoutSpaces);

        String indexNumber="Shubham"; // index method to get the index number of character
        int i=indexNumber.indexOf('b');
        System.out.println(i);

        System.out.println(indexNumber.contains("ua"));// contains method returns the true/false if it finds the matching char sequence
        System.out.println(indexNumber.contains("bh"));

        System.out.println(indexNumber.lastIndexOf("h"));// lastIndexOf method returns the index of the character if there are multiple repetitions or single character
        System.out.println(indexNumber.lastIndexOf("u"));

        System.out.println(indexNumber.startsWith("s"));// startsWith returns boolean result if string starts with the matching sequence
        System.out.println(indexNumber.endsWith("am"));// endsWith returns boolean result if string ends with the matching sequence

        String newResult=str.replace('h','s');// replaces the old character in a string with new character
        System.out.println(newResult);


        String helloWorld="Hello123 World695"; //replaceAll contains regix to handle complex strings
        String Result=helloWorld.replaceAll("\\d+"," S");
        System.out.println(Result);

//        String helloWorld2="123c 321f";
//        String Result3=helloWorld2.replaceAll("\\c+","R");
//        System.out.println(Result3);

        String Result1=newResult.replaceAll("h","s");// replaceAll contains regix to handle complex strings
        System.out.println(Result1);


    }
}
