package Mock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Count {
    public static void main(String[] args) {
        String word = "Hi macha How are You";

       var array= word.split(" ");
        System.out.println(Arrays.toString(array));

       for(int i=array.length-1;i>=0;i--){
           System.out.print(array[i] + " ");
       }


////        you are How macha Hi
//        int capsCount = 0;
//        int lowerCount = 0;
//        int spaceCount = 0;
//        String space = " ";
//
//        StringBuffer buffer = new StringBuffer();
//        List<String> wordList= new ArrayList<>();
//        List<String> reList = new ArrayList<>();
//
//        for(int i=0; i<word.length();i++){
//
//            String letter = String.valueOf(word.charAt(i));
//            buffer.append(letter);
//            if(letter.matches(space)){
//                wordList.add(String.valueOf(buffer));
//                buffer.setLength(0);
//            }
//
//        }
//        if(!buffer.toString().isEmpty()){
//            wordList.add(String.valueOf(buffer));
//        }
//        for (int j=wordList.size()-1; j>=0;j--){
//            reList.add(wordList.get(j));
//        }
//        System.out.println(wordList);
//        System.out.println(reList);















//        String caps = "[A-Z]";
//        String small = "[a-z]";
//        String space = " ";



//        for (int i=0; i<word.length();i++){
//            String letter = String.valueOf(word.charAt(i));
//
//
//            if(letter.matches(caps)){
//                capsCount = capsCount+1;
//            } else if (letter.matches(small)) {
//                lowerCount= lowerCount+1;
//            } else if (letter.matches(space)) {
//                spaceCount=spaceCount+1;
//            }
//        }
//        System.out.println("caps count: "+capsCount);
//        System.out.println("lower count: "+lowerCount);
//        System.out.println("space count: "+spaceCount);
    }
}
