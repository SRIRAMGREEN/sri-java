package LeetCode;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner newValue = new Scanner(System.in);
        int s = newValue.nextInt();
        int n = 5;
        int i = 1;
//        int s = 1;
        var output = fact(n, i, s);
        System.out.println(output);

//        int n = 1;
//        for(int i=1;i<=ss;i++){
//            n=n*i;
//
//
//        }
//        System.out.println(n);
    }

    static int fact(int n, int i, int s) {

        if (i <= n) {
            s = s * i;
            return fact(n, i + 1, s);
        } else {
            return s;
        }

//        System.out.println(s);


    }

}
