package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("AA");
        list.add("ZZ");
        list.add("CC");

        System.out.println("unsorted arraylist: "+ list);

        Collections.sort(list,Collections.reverseOrder());
        System.out.println("sortedArrayList: in descending order " +list );
    }
}
