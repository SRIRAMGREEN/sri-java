package LeetCode;

import java.util.Arrays;

public class PositiveElement {
    //first positive missing element
    public static void main(String[] args) {
        int[] a = {3, 1,2, -4, 5, 6};
        int b = 1;
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {

            if (a[i] > 0) {
                if (b == a[i]) {
                    b++;
                } else {
                    break;
                }
            }


        }
        System.out.println(b);
    }
}



