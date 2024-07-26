package LeetCode;

public class Sample {
    public static void main(String[] args) {

        //1.swap without 3rd variable
//        int a=10;
//        int b=20;
//        System.out.println("before swaping: " + a +" "+ b);
//        a=a+b;
//        b=a-b;
//        a=a-b;
//        System.out.println("after swaping: " + a +" "+ b);


        //2.prime num or not

//        int n=7;
//        int a=0;
//
//        for(int i=2;i<n;i++){
//            if(n%i==0){
//                a++;
//            }
//        }if(a>=1){
//            System.out.println("not a prime");
//        }else{
//            System.out.println(" prime");
//        }

        //3.factorial

        //5*4*3*2*1=?  >>> factorial

//        int n=6;
//        int fact = 1;
//
//        for(int i=1; i<=n; i++){
//            fact=fact*i;
//        }
//        System.out.println(fact);


        //4. fibbonaci series
        //0 1 1 2 3 5...
        //we need two num as input for this process

//        int n =5;
//        int n1=0,n2=1;
//        int count = 0;
//        int n3=0;
//        while(count<n){
//             n3=n2+n1;
//            n1=n2;
//            n2=n3;
//
//            count=count+1;
//
//        }
//        System.out.println(n1 + "");


        //1.check palindrome number:
//
//        int a =454;
//        int temp=a;
//        int reminder=0;
//        int reverse = 0;
//        while(a>0){
//            reminder=(a%10);
//            reverse = (reverse*10)+reminder;
//            a=a/10;
//        }
//        if(temp==reverse){
//            System.out.println( temp + " it is a palindrome");
//        }else {
//            System.out.println(temp + " not a palindrome");
//        }

        //2. prime number

        int a=7;
        int b=0;
        for(int i=2;i<a;i++) {
            if (a % i == 0) {
                b++;
            }
        }
            if(b>0){
                System.out.println("not prime");
            }else {
                System.out.println("prime");
            }

    }
}
