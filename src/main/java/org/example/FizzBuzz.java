package org.example;

public class FizzBuzz {

    public static String run(Integer i){
        String result = i.toString();
        if (i % 15 == 0){
            result = "FizzBuzz";
        } else
            if (i % 3 == 0){
            result = "Fizz";
        } else
            if (i % 5==0){
                result = "Buzz";
            }

        return result;
    }
}
