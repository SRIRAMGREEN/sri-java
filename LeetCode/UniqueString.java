package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueString {
    public static void main(String[] args) {

        String[] words = {"saini", "manoj", "ravi", "prashant", "vikram", "kunal"};
        Map<Integer,String > uniqueMap = new HashMap<>();



//        for (String word : words) {
//            int length = word.length();
//            // Only add the word if the length is not already present
//            if (!uniqueMap.containsKey(length)) {
//                uniqueMap.put(length, word);
//            }
//        }


        for (int i = 0; i < words.length; i++) {
            int length = words[i].length();
            if (!uniqueMap.containsKey(length)){
                uniqueMap.put(length,words[i]);
            }
        }
        System.out.println(uniqueMap);
        List<String > wordList = new ArrayList<>(uniqueMap.values());
        System.out.println(wordList);
    }
}
