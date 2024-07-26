package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Triplet {
    public static void main(String[] args) {
        //given an array of Integer
        // we have given out put as 6.
        // need to check what are all the possibilities to achieve 6 when we add 3 numbers.
        //output:{0,1,5},{0,2,4},{1,2,3}.

        int[] numbers = {2,7,4,0,9,5,1,3};
        int target = 6;
        List<Set<Integer>> triplets =new ArrayList<>();

        for (int i=0;i<numbers.length-1;i++){
            for(int j=i+1;j< numbers.length-1;j++){
                for (int k=j+1;k< numbers.length-1;k++) {

                    int first = numbers[i];
                    int second = numbers[j];
                    int third = numbers[k];
                    int add = first + second + third;
                    if (add == target) {
                        Set<Integer> numList=new HashSet<>();
                        numList.add(first);
                        numList.add(second);
                        numList.add(third);
                        triplets.add(numList);
                        System.out.println(numList);
                    }
                }

            }
        }
        for (Set<Integer> num: triplets ){
            System.out.println(num);
        }

    }
}
