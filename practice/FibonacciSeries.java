package practice;

public class FibonacciSeries {
    public static void main(String[] args) {
        int a=0;
        // find the fibonacci series for the integer 15.

        int b=1;
        int c=0;
        while (a<=15){
            c=a+b;
            if(c>2){
                b=a;
            }
            a=c;

            System.out.println(c);
        }



    }
}
