package LeetCode;

public class Mock {
    public static void main(String[] args) {
        int n=19;

        int rem = n/10;
        int quo = n%10;

        int rem1=0;
        int quo1 =0;

        for(int i=1; i<rem; i++){
            rem1 = rem*rem;

        }
        for(int j=1; j<quo;j++){
            quo1 = quo*quo;
        }
        int value = rem1+quo1;
        if(value==1){
            
        }


    }
}
