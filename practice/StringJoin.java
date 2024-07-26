package practice;

import java.util.StringJoiner;

public class StringJoin {
    public static void main(String[] args) {
        StringJoiner s1 = new StringJoiner(",");
        s1.add("A").add("B").add("C");
        System.out.println(s1);

        StringJoiner s2 = new StringJoiner(":");
        s2.add("P").add("Q");
        System.out.println(s2);

        StringJoiner merge = s1.merge(s2);
        System.out.println(merge);

    }
}
