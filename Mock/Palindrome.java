package Mock;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {
    public static void main(String[] args) {

        String word1 = "MADAMMADAM";
        String subWord = "";
        int large = 0;


        List<String> wordList = new ArrayList<>();


        for (int i = 0; i < word1.length(); i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = i; j < word1.length(); j++) {

                System.out.println(j);
                String initial = stringBuilder.append(word1.charAt(j)).toString();

                String reverse = stringBuilder.toString();
                StringBuilder actualReverse = new StringBuilder();
                actualReverse.append(reverse).reverse();
                System.out.println(stringBuilder);
                if (actualReverse.toString().equals(initial) && initial.length() > 1) {
                    wordList.add(stringBuilder.toString());
                }

            }

        }

        System.out.println(wordList);
        String lar = "";
        String[] arr = wordList.toArray(new String[0]);



        for (int k = 0; k < arr.length; k++) {
            if (arr[k].length() > large) {
                large = arr[k].length();
                lar = arr[k];
            }
        }
        System.out.println(lar);
        System.out.println(large);

    }
}
