package com.cbfacademy;

public class FizzBuzz {
    public static String get(int number){
    try {
    if (number < 0){
        throw new IllegalArgumentException("Number cannot be negative");
    }
   
    if (number % 3 == 0 && number % 5 == 0){
        return "FizzBuzz"; 
    }else if ( number % 3 == 0){
        return "Fizz";
    }else if (number % 5 == 0){
    return "Buzz";
    }else {
        return Integer.toString(number);
    }

    }catch(IllegalArgumentException e){
        return e.getMessage();
}

}
    // for multiples of 3, it returns`“Fizz”`instead of the number

    // for multiples of 5,it returns`“Buzz”` instead of the number-for

    // multiples of 15, it returns`“FizzBuzz”` instead of the number-
    // the string representation of the number otherwise

}