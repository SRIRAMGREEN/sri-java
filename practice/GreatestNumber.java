package practice;

public class GreatestNumber {
    public static void main(String[] args) {

        secondGreatest();
        secondLowest();

    }

    public static void secondGreatest(){
        int[] num = {23,72,45,36,15};
        int greatest=0;
        int secondLarge = 0;
        for (int i=0;i< num.length;i++){
            if(num[i]>greatest){
                secondLarge=greatest;
                greatest=num[i];

            }
            if(num[i]>secondLarge && num[i]<greatest){
                secondLarge=num[i];
            }
        }
        System.out.println("greatest: "+greatest);
        System.out.println("second greatest: "+secondLarge);
    }



    public static void secondLowest(){
        int[] numbers = {28,36,45,81,25,1};
        int lowest=numbers[0];
        int secLowest = numbers[0];
        for(int i=0; i< numbers.length;i++){
            if(numbers[i]<lowest){
                secLowest=lowest;
                lowest=numbers[i];
            }
            if(numbers[i]<secLowest && numbers[i]>lowest){
                secLowest=numbers[i];
            }
        }
        System.out.println("Lowest: "+lowest);
        System.out.println("second Lowest: "+secLowest);
    }
}
