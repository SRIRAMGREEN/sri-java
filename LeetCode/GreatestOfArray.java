package LeetCode;

public class GreatestOfArray {
    public static void main(String[] args) {
        int[] arr = {45,189,97,40,190};
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
