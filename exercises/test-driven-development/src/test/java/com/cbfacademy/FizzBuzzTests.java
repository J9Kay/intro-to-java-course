package com.cbfacademy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.intThat;

@DisplayName(value = "The programme should")
public class FizzBuzzTests {


    @Test
    @DisplayName("checkFizz")
    public void testFizz() {
        assertEquals("Fizz", FizzBuzz.get(3));
    
    }

    @Test
    @DisplayName("checkBuzz")
    public void testBuzzz() {
        assertEquals("Buzz", FizzBuzz.get(5));
    
    }

    @Test
    @DisplayName("checkFizzBuzz")
    public void testFizzBuzzz() {
        assertEquals("FizzBuzz", FizzBuzz.get(15));
    }

    @Test
    @DisplayName("check not Fizz , Buzz or FizzBuzz")
    public void testnotFizzBuzzz() {
        assertEquals("1", FizzBuzz.get(1));
    }



}