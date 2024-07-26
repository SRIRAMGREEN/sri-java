package LeetCode;

import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        int[] initial = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(initial));
        int temp = 0;
        for (int i = 0; i < initial.length; i++) {
            for (int j = i + 1; j < initial.length; j++) {
                if (initial[i] > initial[j]) {
                    temp = initial[i];
                    initial[i] = initial[j];
                    initial[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(initial));



    }
}
