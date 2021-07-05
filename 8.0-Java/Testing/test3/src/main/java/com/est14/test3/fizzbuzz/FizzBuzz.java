package com.est14.test3.fizzbuzz;

public class FizzBuzz {

    public String result(Integer value){

        if (value % 5 == 0 && value % 3 == 0 )
            return "FizzBuzz";

        if (value % 3 == 0)
            return "Fizz";

        if (value % 5 == 0)
            return "Buzz";

        return value.toString() ;
    }
}
