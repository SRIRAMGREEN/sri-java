package Mock;

import java.util.ArrayList;
import java.util.List;

public class Same {

    public static <Char> void main(String[] args) {
        String name="abb";
        String name1="cnn";

        String ss="act";
        String ss1="cre";



        List<String> value = new ArrayList<>();

        List<String> wordList = new ArrayList<>();
        wordList.add(name);
        wordList.add(name1);
        wordList.add(ss);
        wordList.add(ss1);

        for (int i=0; i<wordList.size();i++){
            String word = wordList.get(i);

               String c1 = String.valueOf(word.charAt(1));
               String c = String.valueOf(word.charAt(2));

               if(c.equals(c1)){
                   value.add(word);
           }
        }
        System.out.println(value);
    }
}
