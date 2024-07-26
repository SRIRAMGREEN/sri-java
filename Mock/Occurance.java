package Mock;

import java.util.HashMap;
import java.util.Map;

public class Occurance {
    public static void main(String[] args) {
        String word = "adam";
        HashMap<Character, Integer> mapVal = new HashMap<>();
        StringBuffer buffer = new StringBuffer();
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (mapVal.containsKey(word.charAt(i))) {
                for (Map.Entry<Character, Integer> entry : mapVal.entrySet()) {
                    if (entry.getKey().equals(word.charAt(i))) {
                        mapVal.put(entry.getKey(), entry.getValue() + 1);
                    }
                }
            } else {
                mapVal.put(word.charAt(i), 1);
            }

        }
        System.out.println(mapVal);


    }
}
