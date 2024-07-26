package JavaCode;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FirstUniqueLengthString2 {
    public static void main(String[] args) {
        String[] words = {"book","bat","ball","glass","food","phone","can","remote","cap","bag","basket"};
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
