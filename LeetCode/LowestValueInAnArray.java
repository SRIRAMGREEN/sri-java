package LeetCode;

public class LowestValueInAnArray {
    public static void main(String[] args) {
        int[] krr = {7, 4, 9, 112, 13,89,5};
        int min = krr[0];

        for (int i = 0; i < krr.length; i++) {
//            System.out.println(krr[i]);
            if (krr[i] < min) {
                min = krr[i];
            }
        }

        System.out.println(min);


//        for(int i=0; i<krr.length;i++){
//
//
//            if(min>=krr[i]){
//                min=krr[i];
//            }
//
//
//                System.out.println(min);
//           }


    }
}
