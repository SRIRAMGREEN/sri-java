package practice;

public class Factorial {
    public static void main(String[] args) {
        int a=5;
        int fact=1;
        int n=1;
        while(n<=a){
            fact=fact*n;
            n++;
        }
        System.out.println(fact);

    }
}
