package Mock;

import java.util.ArrayList;
import java.util.List;

public class Palin {
    public static void main(String[] args) {



        String word = "AAC";
        StringBuffer buffer = new StringBuffer();
        List<String> wordList = new ArrayList<>();

//        for (int n = 0; n < word.length(); n++) {
//            for (int i = n; i < word.length(); i++) {
//                buffer.append(word.charAt(i));
//                String first = buffer.toString();
//                String reversed = buffer.reverse().toString();
//                buffer.reverse(); // Restore original content of buffer
//                if (first.length() > 1 && first.equals(reversed)) {
//                    wordList.add(first);
//                }
//            }
//            buffer.setLength(0);
//        }
//        System.out.println(wordList);






//        String word = "cabac";
//        StringBuffer buffer = new StringBuffer();
//        List<String> wordList = new ArrayList<>();

        int n = 0;
        while (n < word.length()) {
            for (int i = n; i < word.length(); i++) {

                buffer.append(word.charAt(i));
                String first = buffer.toString();
                String re = buffer.reverse().toString();
                buffer.reverse();                              //------------
                if(first.length()>1) {                          //------------
                    if (first.equals(re)) {
                        wordList.add(first);
                    }
                }
            }
            n = n + 1;
            buffer.setLength(0);
        }
        System.out.println(wordList);
    }
}

