package LeetCode;

public class SwapWithoutThirdVariable {
    public static void main(String[] args) {
        int a=100;
        int b=200;
        a = a+b;
        System.out.println(a);
        b=a-b;
        System.out.println(b);
        a=a-b;
        System.out.println(a);
        System.out.println("value of a: "+ a + " "+ "value of b " + b);
    }
}
