package JavaCode;

public class SmallestNumber {
    public static void main(String[] args) {
//        int a=587;
//        int a = 978651;
        int a=90674521;

//           int a=869;

        int lowest = a;
        int s=0;
        int ss=0;

        while (a>0){
            s=a/10;
            ss = a%10;
            if(ss<lowest){
                lowest=ss;
            }
            a=s;
        }
        System.out.println(lowest);
    }
}
