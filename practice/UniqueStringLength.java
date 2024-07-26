package practice;

import java.util.*;

public class UniqueStringLength {
    public static void main(String[] args) {
        String[] words = {"ball","batch","bat","cat","bowl","wind","wonder","better"};

        //check the count of the letters of each word.
        //if the length count is not added before in the list add it.
        //words of repeated length should not be same.

        Map<Integer,String> mapValue = new LinkedHashMap<>();
        for (int i=0; i< words.length;i++){// need to iterate each word
            int length = words[i].length(); //gives the count of the letters in each word
            if (!mapValue.containsKey(length)){
                mapValue.put(length,words[i]);
            }
        }
        System.out.println("mapValues: "+ mapValue);
        List<String> wordList = new ArrayList<>(mapValue.values());
        System.out.println("wordList: "+ wordList);
    }
}
