package com.vivz.programs;

/**
 * Created by vivekdwivedi on 10/6/2017.
 */
public class FibonacciRecursive {
    public static void main(String[] args) {
        FibonacciRecursive lFibonacciRecursive = new FibonacciRecursive();
        lFibonacciRecursive.fibonacci(0,1);
    }

    private void fibonacci(int number1, int number2){
        int sum = 0;
        if (number1 == 0){
            System.out.println(number1+"\n"+number2);
        }
        sum = number1+number2;
        if(sum<=100){
            System.out.println(sum);
            number1=number2;
            number2=sum;
            fibonacci(number1,number2);
        }
    }
}
