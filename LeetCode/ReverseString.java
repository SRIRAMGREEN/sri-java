package LeetCode;

public class ReverseString {
    public static  void main(String[] args) {
        String word = "Arme";
        StringBuffer output = new StringBuffer();
        for (int i = word.length() - 1; i >= 0; i--) {
            char value = word.charAt(i);
            output.append(value);
        }
        System.out.println(output);

    }
}
