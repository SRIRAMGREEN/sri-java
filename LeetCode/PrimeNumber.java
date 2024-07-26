package LeetCode;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        System.out.println(a);

        int n = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                 n++;
            }
        }
        if(n>2){
            System.out.println(a + "not prime");
        }else{
            System.out.println(a + "is prime");
        }

    }
}



