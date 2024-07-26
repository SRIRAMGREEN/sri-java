package MockInterview;

import java.util.*;

public class MergeArray {
    public static void main(String[] args) {
        merge();
        majority();
    }

    private static void majority() {
        int[] num = {3,2,3,2,3};
        int count=0;
        int a=num[0];
        int b=0;
        for (int i=0; i< num.length;i++){
            if(a==num[i]){
                a=num[i];
                count=count+1;
            }
        }
        System.out.println(count);


    }




    public static void merge(){
        int[] num1 = {1,2,3,0,0,0,7,9};
        int[] num2 = {2,10,4,5};

        //output: {1,2,2,3,4,5};

        Set<Integer> numSet = new TreeSet<>();

        for(int i=0; i<num1.length; i++){
            if(num1[i]!=0) {
                numSet.add(num1[i]);
            }
        }
        for (int j=0; j< num2.length; j++){
            if (num2[j]!=0){
                numSet.add(num2[j]);
            }
        }
        System.out.println(numSet);



    }
}
