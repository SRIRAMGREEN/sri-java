package MockInterview;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Duplicates {
    public static void main(String[] args) {

        String word ="adam";
        HashMap<Character,Integer> mapVal = new HashMap<>();
//        HashMap<Character,Integer> newMap = new HashMap<>();
        ConcurrentHashMap<Character,Integer> newVal = new ConcurrentHashMap<>();


        for (int i=0;i<word.length();i++){
            if (mapVal.containsKey(word.charAt(i))){
                for (Map.Entry<Character,Integer> value: mapVal.entrySet()) {
                    if (value.getKey().equals(word.charAt(i))){
                        mapVal.put(value.getKey(), value.getValue()+1);
                    }
                    if (value.getValue()>1){
                        newVal.put(value.getKey(), value.getValue());
                    }
                }
            }
            else {
                mapVal.put(word.charAt(i),1);
            }
        }
        System.out.println("Original values: "+mapVal);
        System.out.println("duplicates: "+newVal);





        long l= 454678478950157l;
        String sen = String.valueOf(l);

        ConcurrentHashMap<Integer,Integer> longMap = new ConcurrentHashMap<>();
        LinkedHashMap<Integer,Integer> linkedHashMap = new LinkedHashMap<>();

        for (int k=0;k<sen.length();k++){
            if (longMap.containsKey(sen.charAt(k))){
                for (Map.Entry<Integer,Integer> intVal : longMap.entrySet()){
                    if (intVal.getKey().equals(sen.charAt(k))){
                        longMap.put(intVal.getKey(), intVal.getValue()+1);
                    }
                    if (intVal.getValue()>1){
                     linkedHashMap.put(intVal.getKey(), intVal.getValue());
                    }
                }
            }
            else{
                longMap.put((int) sen.charAt(k),1);
            }
        }
        System.out.println("normal values: "+longMap);
        System.out.println("duplicate values: "+ linkedHashMap);

    }
}
