package MockInterview;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Unique {
    public static void main(String[] args) {

        int[] num = {5, 18, 27, 69, 0, 109, 127, 157, 199, 1000};


        // by java 8:

      var output=  Arrays.stream(num).mapToObj(f->String.valueOf(f).startsWith("1")).collect(Collectors.toList());
        System.out.println(output);

        //by java:

//        for (int i = 0; i < num.length; i++) {
//
//            String value = String.valueOf(num[i]);
//            if (value.startsWith("1")) {
//                System.out.println(value);
//            }
//        }


        //By normal java:


//        List<Integer> numList = new ArrayList<>();
//
//
//        int n = 0;
//        int initial = 0;
//
//
//        for (int i = 0; i < num.length; i++) {
//            n = num[i];
//            initial = n;
//            while (n > 0) {
//                n = n / 10;
//                if (n == 1) {
//                    numList.add(initial);
//                }
//            }
//        }
//        System.out.println(numList);

    }
}
