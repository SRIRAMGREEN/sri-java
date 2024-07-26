package LeetCode;

import javax.swing.*;

public class Manipulation {
    public static void main(String[] args) {
        int[] num  ={-5,1,-40,20,6,8,7,-15,30};
        int targetSum=15;
        boolean result;


        int size = num.length;

        for(int i=0;i<size-1;i++){
            for(int j=1;j<size;j++ ) {
                int first = num[i];
                int second = num[j];
              int  add = first + second;
                if (add == targetSum) {
                    result = true;
                    System.out.println("add result " + first + " " + " " + second + ""+ result);

                    int mul = first * second;

                    if (mul%targetSum==0) {

                        System.out.println("mul result " + first + " " + " " + second + " true");
                    }else{
                        System.out.println("mul result " + first + " " + " " + second + " false");
                    }
                }else {
                    System.out.println("add result " + first + " " + " " + second + " false");
                }
              }
            }
        }
    }


    //o/p: (7,8):false
    //(-5,20): true
    //(-15,30):true




    //7*8=56 is not multiple of 15. so(7,8): false
    //(-5*20)=-100 is not multiple of 15. (-5,20) : false
    //(-15*30)=-450 is multiple of 15. (-15,30) : true

