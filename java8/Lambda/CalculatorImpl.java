package java8.Lambda;

import java.sql.SQLOutput;

interface Calculator{
    void switchOn(); // need to write the lambda expression for this abstract method.
        }

        //this is the traditional method
//public class CalculatorImpl implements Calculator {
//
//    @Override
//    public void switchOn() {
//        System.out.println("Switch On");
//    }
//
//    public static void main(String[] args) {
//
//    }
//}


//this is by using lambda expression

public class CalculatorImpl {

    public static void main(String[] args) {

        //to create annonymous method we not need method name and prefix
//        public void switchOn() {
//            System.out.println("Switch On");
//        }


        //this is the way of calling method using lambda expression
        // as here we have only one method no need to provide method name or no need to call the interface.
        //also for only one statement to return then we no need to use brackets

        // () -> {body};    --- lambda syntax ---> (parameter) ->(expression)  ->{body}
        Calculator calculator = () -> System.out.println("Switch On");

        //now we can call the method
        calculator.switchOn();

    }
}
