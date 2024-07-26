package JavaCode;

import java.util.*;

public class FirstUniqueLengthString1 {
    public static void main(String[] args) {

        String[] words = {"saini", "manoj", "ravi", "prashant", "vikram", "kunal"};
        Map<Integer,String > uniqueMap = new LinkedHashMap<>();

        for (int i = 0; i < words.length; i++) {
            int length = words[i].length();
            if (!uniqueMap.containsKey(length)){
                uniqueMap.put(length,words[i]);
            }
        }
        List<String > wordList = new ArrayList<>(uniqueMap.values());
        System.out.println(wordList);
    }
}
