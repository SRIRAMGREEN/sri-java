package Mock;

import java.util.ArrayList;
import java.util.List;

public class MidOfThree {

    public static void main(String[] args) {

        int[] numbers = {7, 16,34,5,7867,89,9};
        List<Integer> middle = new ArrayList<>();

        int count = numbers.length;


        int n = count % 2;
        if (count >= 3) {
            if (n != 0) {
                int reminder = count / 2;

                for (int i = reminder - 1; i < reminder + 2; i++) {
                    middle.add(numbers[i]);
                }
                System.out.println(middle);

            }else {
                System.out.println("count is in even numbers, can't find middle 3");
            }

        }else{
            System.out.println("count is less than 3, can't find middle 3");
        }
    }
}
