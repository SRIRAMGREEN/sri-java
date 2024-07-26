package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class HappyNumber {
    public static void main(String[] args) {


        int initial=19;
        int result=initial;
        List<Integer> numList = new ArrayList<>();

        int sum=0;
        int rem =0;
        int quo=0;

        while(!numList.contains(initial)) {
            numList.add(initial);
            while (initial > 0) {

                rem = initial % 10;

                sum = (sum) + (rem * rem);
                quo = initial / 10;
                initial = quo;
            }
            initial=sum;
                sum = 0;
        }

            if(initial==1){
                System.out.println(result+ "  is a happy number!!!");
            }

        if (initial!=1){
            System.out.println(result+" is not a happy number.");
        }
    }
}
