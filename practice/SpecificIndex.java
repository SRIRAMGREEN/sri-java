package practice;

public class SpecificIndex {
    public static void main(String[] args) {
        String str = "Eelcome to java";
        int index = 0;
        char c = 'W';
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(index,c);
        System.out.println(sb);
    }
}
