package LeetCode;



 class OddClass extends Thread{
    public void odd(){


        for(int i=1; i<=100; i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }


    }
}
