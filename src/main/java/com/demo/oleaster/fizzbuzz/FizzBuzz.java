package com.demo.oleaster.fizzbuzz;

/**
 * Created by boysbee on 7/15/2015.
 */
public class FizzBuzz {
    public String getResult(int input) {
        if (input % 3 == 0 && input % 5 == 0) {
            return "fizzbuzz";
        }
        if (input % 3 == 0) {
            return "fizz";
        }
        if (input % 5 ==0) {
            return "buzz";
        }
        return Integer.toString(input);
    }
}
