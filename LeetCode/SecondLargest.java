package LeetCode;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
//        int arr[] = {27,15,67,68,69,12};
//        int length=arr.length;
//
//        int max = 0;
//        int secondMax = 0;
//
//        for(int i=0;i<length;i++){
//            if(arr[i]>max){
//                secondMax=max;
//                max = arr[i];
//            }else if(arr[i]>secondMax){
//                secondMax=arr[i];
//            }
//        }
//        System.out.println(secondMax);


//
//        int num[] ={5,7,3,2,9};
//        int max=0;
//        int secondMax=0;
//
//        for(int i=0; i<num.length;i++){
//            if(num[i]>max){
//                secondMax=max;
//                max=num[i];
//            } else if (num[i]>secondMax) {
//                secondMax=num[i];
//            }
//        }
//        System.out.println(secondMax);
//    }

        int num[] = { 7, 6,7,5,3,7};
        int size = num.length;

        Arrays.sort(num);
        int sec = 0;

        for (int i = size - 2; i >= 0; i--) {
            if (num[i] != num[size - 1]) {

                if ((num[i]>sec)) {
                    sec=num[i];
                }
            }

        }
        System.out.println(sec);
    }
}
