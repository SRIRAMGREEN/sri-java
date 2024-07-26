package LeetCode;

public class NumberOfVowels {
    public static void main(String[] args) {
            String word = "Welcome";
            int count=0;
            for(int i=0;i<word.length();i++){
                char c = word.charAt(i);
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                    count++;
                }
            }
        System.out.println(count);


            //to remove white spaces in a string
            String input = "Hi good Morning";
            String output= "";

            output=input.replaceAll("\\s","");

        System.out.println("input: "+ input);
        System.out.println("output: "+ output);

        //using string builder

        StringBuilder result = new StringBuilder();
        for (int i=0; i<input.length();i++){
            char h = input.charAt(i);
            if(h!=' '){
                result.append(h);
            }
        }
        System.out.println("using stringbuilder: "+result);
    }
}
