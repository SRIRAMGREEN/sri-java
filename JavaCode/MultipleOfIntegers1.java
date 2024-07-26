package JavaCode;

public class MultipleOfIntegers1 {
    public static void main(String[] args) {
        int[] num  ={-5,1,-40,20,6,8,7,-15,30};
        int targetSum=15;

        int size = num.length;

        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++ ) {
                int first = num[i];
                int second = num[j];
                int  add = first + second;
                if (add == targetSum) {
                    int mul = first * second;
                    if (mul%targetSum==0) {
                        System.out.println("multiple result: " + first + " " + " " + second + " true");
                    }else{
                        System.out.println("multiple result: " + first + " " + " " + second + " false");
                    }
                }
            }
        }
    }
}


