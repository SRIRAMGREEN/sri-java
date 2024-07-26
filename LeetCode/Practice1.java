package LeetCode;

import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {
        //prime number

//        int a = 15;
//        int n=0;
//        for (int i=1;i<=a;i++){
//            if (a%i==0){
//                n++;
//            }
//
//            }
//        if(n>2){
//            System.out.println(a+" not prime");
//        }else{
//            System.out.println(a+" prime");
//        }
//
//        //factorial
//
//        int m=5;
//        int fact = 1;
//        for (int i=1;i<=m;i++){
//            fact=fact*i;
//        }
//        System.out.println("factorial is "+fact);
//
//        //fibonacci
//
//        int n1=0;
//        int n2=1;
//        int n3=0;
//        int len=10;
//        for (int i=2;i<len;i++){
//            n3=n2+n1;
//            System.out.println(" "+n3);
//            n1=n2;
//            n2=n3;
//
//        }
//
//        //sorting array
//
//        int[] initial = {3,2,5,9,1};
//        System.out.println("before sorted: "+Arrays.toString(initial));
//        int tem = 0;
//        for (int i=0;i< initial.length;i++){
//            for (int j=0;j< initial.length;j++){
////                if(initial[i]>initial[j]){
////                    tem =initial[i];               //reverse
////                    initial[i]=initial[j];
////                    initial[j]=tem;
////                }
//
//                //ascending
//
//                if(initial[i]<initial[j]){
//                    tem =initial[i];
//                    initial[i]=initial[j];
//                    initial[j]=tem;
//                }
//            }
//        }
//        System.out.println("after sorted: "+Arrays.toString(initial));
//
//
//        //reverse the string
//
//        String let = "emoclew";
//        StringBuffer wore = new StringBuffer();
//        for (int i=let.length()-1;i>=0;i--){
//            char ch = let.charAt(i);
//            wore = wore.append(ch);
//        }
//        System.out.println(wore);
//
//        // second largest
//
//        int number1[] = {3,5,7,6,8,7,8};
//        int size = number1.length;
//
//        int highest=0;
//        int secondHighest = 0;
//         for (int i=0;i<size;i++){
//             if(number1[i]>highest){
//                 secondHighest=highest;
//                 highest=number1[i];
//             }
//             if(number1[i]<highest&&number1[i]>secondHighest){
//                 secondHighest=number1[i];
//             }
//
//         }
//        System.out.println("second highest: "+secondHighest);


         //greatest number
        int[] number = {27,36,21,72,45,-39,0,54};
        int big=0;
        for(int i=0;i< number.length;i++){
            if(number[i]>big){
                big=number[i];
            }
        }
        System.out.println("biggest number: "+big);


        //second largest
        int secondBiggest=0;
        for (int i=0; i< number.length;i++){
            if(number[i]>big){
                big=number[i];
                secondBiggest=big;
            }
            if(number[i]<big && number[i]>secondBiggest){
                secondBiggest=number[i];
            }
        }
        System.out.println("second biggest number: "+secondBiggest);

        //lowest
        int lowest =0;
        for (int i=0;i< number.length;i++){
            if(number[i]<lowest){
                lowest=number[i];
            }
        }
        System.out.println("lowest number: "+lowest);

        //secondlowest

        int secondLowest = 0;
        for(int i=0;i< number.length;i++){
            if(number[i]<lowest){
                lowest=number[i];
                secondLowest=lowest;
            }
            if(number[i]>lowest && number[i]<secondLowest){
                secondLowest=number[i];
            }
        }
        System.out.println("second lowest: "+secondLowest);

        //Palindrome
         int originalNum = 454;

         int rev=0;
         int rem=0;
         int temp = originalNum;

         while(originalNum>0){
             rem=originalNum%10;
             rev=(rev*10)+rem;
             originalNum=originalNum/10;
         }
         if(rev==temp){
             System.out.println("the number is palindrome.");
         }else {
             System.out.println("not a palindrome");
         }


         //reverse the string.

        String word = "emoclew";
         StringBuffer buffer =new StringBuffer();
         int length = word.length();
         for(int i=length-1;i>=0;i--){
             char c = word.charAt(i);
             buffer.append(c);
         }
        System.out.println(buffer);


    }
}
