package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindIntegers {
    public static void main(String[] args) {
        String word = "A4B956K";
        Pattern pattern = Pattern.compile("[0-9]");

        List<Integer> nu = new ArrayList<>();
        List<String> wordList =new ArrayList<>();

        for (int i=0;i<word.length();i++){
            String value = String.valueOf(word.charAt(i));
            String words = String.valueOf(word.charAt(i));
            Matcher matcher = pattern.matcher(value);
            if(matcher.find()){
                nu.add(Integer.valueOf(value));
                System.out.println(matcher);
            }
            if (!matcher.matches()){
                wordList.add(words);
            }
        }
        System.out.println(nu);
        System.out.println(wordList);
    }
}
