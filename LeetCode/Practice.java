package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice {
    public static void main(String[] args) {

        //1.Greatest num of an array.

        int[] num= {23,45,27,18,72,63};

        int greatest=0;
        for(int i=0; i<num.length;i++){
            if(num[i]>greatest){
                greatest=num[i];
            }
        }
        System.out.println(greatest);

        //2.second greatest;

        int[] number = {18,45,36,54,27,0,54};
        int great = 0;
        int secondGreat = 0;

        for(int i=0;i<number.length;i++){
            if(number[i]>great){
                great=number[i];
                secondGreat=great;
            }
            if(number[i]>great && number[i]<secondGreat){
                secondGreat=number[i];
            }
        }
        System.out.println(secondGreat);

        //3.find large num in string.

//        String value = "BS34MK72";
//        Pattern pattern = Pattern.compile("[0-9]");
//        StringBuffer buffer = new StringBuffer();
////        List<Integer> numList = new ArrayList<>();
//        List<Long> numList = new ArrayList<>();
//
//        for (int i = 0; i < value.length(); i++) {
////            System.out.println(value.charAt(i));
//            String newValue = String.valueOf(value.charAt(i));
//            Matcher matcher = pattern.matcher(newValue);
//            if (matcher.find()) {
//                buffer.append(newValue);
//            } else if(!buffer.toString().equals("")){
//                numList.add(Long.parseLong(buffer.toString()));
//                buffer.setLength(0);
//            }
//        }
//
//        if (!numList.isEmpty()) {
//            numList.add(Long.parseLong(buffer.toString()));
//        }
//
//        long maxVal = 0;
//        for (int j = 0; j < numList.size(); j++) {
//            if (numList.get(j) > maxVal) {
//                maxVal = numList.get(j);
//            }
//        }
//        System.out.println(maxVal);
//        System.out.println(numList);

        String element = "MR45VS134PK23";
        Pattern pattern=Pattern.compile("[0-9]");
        StringBuffer buffer =new StringBuffer();
        List<Long> value = new ArrayList<>();

        for(int i=0; i<element.length();i++){
            String newValue = String.valueOf(element.charAt(i));
            Matcher matcher = pattern.matcher(newValue);
            if(matcher.find()){
                buffer.append(newValue);
            } else if (!buffer.toString().equals("")) {
                value.add(Long.parseLong(buffer.toString()));
                buffer.setLength(0);
            }
            if(!value.isEmpty()){
                value.add(Long.parseLong(buffer.toString()));
            }
        }
        System.out.println("highest value: " + value);




    }
}
