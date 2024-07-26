package LeetCode;

import java.util.Arrays;

public class SecLargest {
    public static void main(String[] args) {

//        int num[] = {9,7,11,22,-1};
//        int n = num.length;

        //1. using sorting
        // this will work if all the elements in an array is unique.
//        Arrays.sort(num);
//        System.out.println("sec largest num is: " +num[n-2] );


        //2. using normal method:

//        int highest = 0;
//        int secondHighest =0;
//
//        //traversing array
//
//        for(int i=0; i<n; i++){
//            if(num[i]>highest){
//                secondHighest = highest;
//                highest=num[i];
//            }
//            if(num[i]<highest && num[i]>secondHighest){
//                secondHighest=num[i];
//            }
//        }
//        System.out.println("sec largest num is: " + secondHighest );



        //1. second largest num:

        int laliga[] = {3,7,9,22,-7,54,45,18,};
        int length = laliga.length;
        int highest=0;
        int secondHighest = 0;

        for(int i=0;i<length;i++){
            if(laliga[i]>highest){
                secondHighest=highest;
                highest=laliga[i];
            }
            if(laliga[i]<highest && laliga[i]>secondHighest){
                secondHighest=laliga[i];
            }
        }
        System.out.println("second largest number is " + secondHighest);



        //2. largest number:

        int num[]={45,36,27,54,72,63};
        int lar =0;
        for(int i=0;i<num.length;i++){
            if(num[i]>lar){
                lar=num[i];
            }

        }
        System.out.println("largest num is: " + lar);


        //3. smallest num:

        int sam[]= {25,-34,16,27,-15,72};
        int min =0;
        for(int i=0; i<sam.length;i++){
            if(sam[i]<min){
                min=sam[i];
            }
        }
        System.out.println("samllest number: " + min);


        //4.second lowest number:

        int value[]={27,34,-16,55,-63,9,72};
        int lowest = 0;
        int secondLowest = 0;

        for(int i=0;i< value.length;i++){
            if(value[i]<lowest){
                secondLowest = lowest;
                lowest=value[i];
            }
            if(value[i]>lowest && value[i]<secondLowest){
                secondLowest = value[i];
            }
        }
        System.out.println("second lowest number is: " + secondLowest);

        //5.palindrome using for loop:

        int a = 454;
        int rev = 0;
        int rem = 0;
        int temp = a;

        for(int i=a; i>0;i=a){
            rem = a%10;
            rev = (rev*10)+rem;
            a=a/10;
        }
        System.out.println("reminder "+rem);
        System.out.println("reverse num: "+ rev);
        if(rev==temp){
            System.out.println("the number is palindrome: " + rev);
        }else {
            System.out.println("not a palindrome");
        }

    }
}
