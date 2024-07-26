package MockInterview;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {

      Test test = new Test();
      test.getMap("sriramkaruppiah");

    }

    public  Map<Character,Integer> getMap(String word){
        HashMap<Character,Integer> mapVal = new HashMap<>();
        HashMap<Character,Integer> newMap = new HashMap<>();

        for (int i=0;i<word.length();i++){
            if (mapVal.containsKey(word.charAt(i))){
                for (Map.Entry<Character,Integer> value:mapVal.entrySet()){
                    if (value.getKey().equals(word.charAt(i))){
                        mapVal.put(value.getKey(), value.getValue()+1);
                    }
                    if (value.getValue()>1){
                        newMap.put(value.getKey(),value.getValue());
                    }
                }
            }
            else {
                mapVal.put(word.charAt(i),1);
            }
        }
//        System.out.println(mapVal);
        System.out.println("duplicates "+newMap);
        return newMap;
    }

}
