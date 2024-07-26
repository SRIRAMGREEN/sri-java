package java8.Lambda;

interface  Manipulation{
//    void sum(int input);     // here we have single method with one input.

    int subtract(int a, int b);   //here we have a method withe return type and multiple arguments.
}

public class ManipulationImpl {
    public static void main(String[] args) {

        //we use single return stmt so no need of brackets({}).
        // we also no need to pass the datatype of the parameter.

//        Manipulation manipulation=(input) -> System.out.println("sum: "+ input);

       Manipulation manipulation1= (a,b)-> {
           if (a > b) {
               throw new RuntimeException("b should be greater than a");
           } else {
               return b - a;
           }
       };


        System.out.println(manipulation1.subtract(5,4));


        // caling the method
//        manipulation1.sum(234);
    }






}
