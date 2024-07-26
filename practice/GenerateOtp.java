package practice;

public class GenerateOtp {
    public static void main(String[] args) {
        //generate OTP
        // 9000- max range, 1000 - min range

//        double randomNum = Math.random();
        int randomNum = (int) ((Math.random()*9000)+1000);

        String otp = String.valueOf(randomNum);
        System.out.println(otp);
    }
}
