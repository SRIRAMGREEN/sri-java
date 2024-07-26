package practice;

public class StringConcatination {
    public static void main(String[] args) {
        String word1="BESTOFALL";
        String word2="1234567";
        StringBuilder builder = new StringBuilder();
        int length = word1.length()+word2.length();



        //output: B1E2S3T4O5F6A7LL;

            int i=0;
            while (i<=length-1) {
                if (i <= word1.length() - 1) {
                    builder.append(word1.charAt(i));
                }
                if (i <= word2.length() - 1) {
                    builder.append(word2.charAt(i));
                }
                i++;
            }
        System.out.println(builder);
    }
}
