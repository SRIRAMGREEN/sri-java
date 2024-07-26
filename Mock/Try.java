package Mock;

import java.util.HashMap;
import java.util.Map;

public class Try {
    public static void main(String[] args) {

        String word = "adam";
        HashMap<Character,Integer> mapVal = new HashMap<>();

        for(int i=0;i<word.length();i++){
            if (mapVal.containsKey(word.charAt(i))){
                for (Map.Entry<Character,Integer> value :mapVal.entrySet()){
                    if (value.getKey().equals(word.charAt(i))){
                        mapVal.put(value.getKey(), value.getValue()+1);
                    }
                }
            }
            else{
                mapVal.put(word.charAt(i),1);
            }
        }
        System.out.println(mapVal);
    }


}
