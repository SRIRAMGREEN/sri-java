package MockInterview;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ReverseCount {
    public static void main(String[] args) {
        String word = "World is beautiful";
        StringBuilder builder = new StringBuilder();
        StringBuffer buffer = new StringBuffer();
        List<String> revList = new ArrayList<>();
        List<String> wordList = new ArrayList<>();
        List<Integer> wordLength = new ArrayList<>();
        List<Integer> revLength = new ArrayList<>();
        int count=0;

        for (int i=0;i<word.length();i++) {
            if (word.charAt(i) != ' ') {
                builder.append(word.charAt(i));
            } else {
                wordList.add(String.valueOf(builder));
                builder.setLength(0);
            }
        }
            if (!builder.equals("")){
                wordList.add(String.valueOf(builder));
            }
        System.out.println(wordList);
        System.out.println(wordList.size());

        for (int i=0;i< wordList.size();i++){
            int length = wordList.get(i).length();
            for (int j=word.length()-1;j>=0;j--){
                if (buffer.length()!=length){
                    buffer.append(word.charAt(j));
                }
                else {
                    revList.add(buffer.toString());
                    buffer.setLength(0);
                    break;
                }

            }
            wordLength.add(length);
        }
        System.out.println(wordLength);


        System.out.println(revList);

        }
}


