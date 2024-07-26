package LeetCode;

public class StringConcatination {
    public static void main(String[] args) {
        String word1 = "RAVI";
        String word2 = "123456789";
        StringBuilder combineWords = new StringBuilder();
        int length = word1.length() + word2.length();

        for (int i = 0; i < length - 1; i++) {
            if (i == length - 1) {
                break;
            }
            if (i <= word1.length() - 1) {
                combineWords.append(word1.charAt(i));
            }
            if (i <= word2.length() - 1) {
                combineWords.append(word2.charAt(i));
            }
        }


        System.out.println(combineWords);

    }


//        for (int i = 0; i <= word1.length() - 1; i++) {
//            String newWord1 = String.valueOf(word1.charAt(i));
//            System.out.print(newWord1);
//            for (int j = 0; j <= word2.length() - 1; j++) {
//                if (j == word2.charAt(j)) {
//                    combineWords.append(j);
//                    j++;
//                    System.out.print(combineWords);
//                    break;
//                }
//            }
//        }
}
//}
