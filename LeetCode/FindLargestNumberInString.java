package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindLargestNumberInString {


    public static void main(String[] args) {
//        String word = "A12B34SHG987";
//        System.out.println(word);
//        Pattern pattern = Pattern.compile("[0-9]");
//        StringBuilder stringBuilder = new StringBuilder();
//        List<Long> stringList = new ArrayList<>();
//
//        for (int i = 0; i <= word.length() - 1; i++) {
//            String newWord = String.valueOf(word.charAt(i));
//            Matcher matcher = pattern.matcher(newWord);
//            if (matcher.find()) {
//                stringBuilder.append(newWord);
//            } else {
//                if (!stringBuilder.toString().equals("")) {
//                    stringList.add(Long.parseLong(stringBuilder.toString()));
//                    stringBuilder.setLength(0);
//                }
//            }
//
//        }
//        if (!stringList.isEmpty()) {
//            stringList.add(Long.parseLong(stringBuilder.toString()));
//        }
//        long maxVal = 0;
//        for (int j = 0; j < stringList.size(); j++) {
////            System.out.println(stringList.get(j));
//            if (maxVal < stringList.get(j)) {
//                maxVal = stringList.get(j);
//            }
//        }
//        System.out.println(maxVal);
//
//        System.out.println(stringList);
//    }
//}


        String value = "BS34MK72";
        Pattern pattern = Pattern.compile("[0-9]");

        StringBuffer buffer = new StringBuffer();
//        List<Integer> numList = new ArrayList<>();
        List<Long> numList = new ArrayList<>();

        for (int i = 0; i < value.length(); i++) {
//            System.out.println(value.charAt(i));
            String newValue = String.valueOf(value.charAt(i));
            Matcher matcher = pattern.matcher(newValue);
            if (matcher.find()) {
                buffer.append(newValue);
            } else if(!buffer.toString().equals("")){
                numList.add(Long.parseLong(buffer.toString()));
                    buffer.setLength(0);
                }
            }

            if (!numList.isEmpty()) {
                numList.add(Long.parseLong(buffer.toString()));
            }

            long maxVal = 0;
            for (int j = 0; j < numList.size(); j++) {
                if (numList.get(j) > maxVal) {
                    maxVal = numList.get(j);
                }
            }
            System.out.println(maxVal);
            System.out.println(numList);

        }
    }

