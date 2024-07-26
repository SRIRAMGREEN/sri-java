package practice;

public class HideNumbers {
    public static void main(String[] args) {
        // display  the last 2 numbers in a mobile number and replace other with #
        String phoneNumber = "8248903558";
        String regex=phoneNumber.replaceAll(".(?=.(3))","&");
        System.out.println(regex);


    }
}
