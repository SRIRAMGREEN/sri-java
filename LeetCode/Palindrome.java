package LeetCode;

public class Palindrome {

    //454 --original num
    //454 -- reverse num both should be equal

    //reverse the num and compare the reversed num with original num.

    public static void main(String[] args) {

        int rem = 0;
        int rev = 0;
        int num=454;
        int temp = num;

        while(num>0){
           rem = num%10;
           rev = (rev*10)+rem;
           num=num/10;
        }
        if(temp == rev){
            System.out.println("palindrome: "+ rev);
        } else if (temp!=rev) {
            System.out.println("not a palindrome: "+ rev);
        }

    }
}
