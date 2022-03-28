package FizzBuzzKata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzz_must {

    @Test
    void show_numbers_as_String(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(fizzBuzz.play(new FizzBuzzNumber(1)).getClass(), "".getClass());
        assertEquals(fizzBuzz.play(new FizzBuzzNumber(2)).getClass(), "".getClass());
        assertEquals(fizzBuzz.play(new FizzBuzzNumber(4)).getClass(), "".getClass());
        assertEquals(fizzBuzz.play(new FizzBuzzNumber(131)).getClass(), "".getClass());
        assertEquals(fizzBuzz.play(new FizzBuzzNumber(11)).getClass(), "".getClass());
    }

    @Test
    void not_accept_negative_numbers_or_zero() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(fizzBuzz.play(new FizzBuzzNumber(0)), "Error. Número no aceptado");
        assertEquals(fizzBuzz.play(new FizzBuzzNumber(-1)), "Error. Número no aceptado");
        assertEquals(fizzBuzz.play(new FizzBuzzNumber(-100)), "Error. Número no aceptado");
        assertEquals(fizzBuzz.play(new FizzBuzzNumber(-5)), "Error. Número no aceptado");
        assertEquals(fizzBuzz.play(new FizzBuzzNumber(-3)), "Error. Número no aceptado");
        assertEquals(fizzBuzz.play(new FizzBuzzNumber(-20)), "Error. Número no aceptado");

    }

    @Test
    void check_if_multiple_of_three() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(fizzBuzz.play(new FizzBuzzNumber(3)), "Fizz");
        assertEquals(fizzBuzz.play(new FizzBuzzNumber(6)), "Fizz");
        assertEquals(fizzBuzz.play(new FizzBuzzNumber(9)), "Fizz");
        assertEquals(fizzBuzz.play(new FizzBuzzNumber(36)), "Fizz");

    }

    @Test
    void check_if_multiple_of_five(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(fizzBuzz.play(new FizzBuzzNumber(5)), "Buzz");
        assertEquals(fizzBuzz.play(new FizzBuzzNumber(20)), "Buzz");
        assertEquals(fizzBuzz.play(new FizzBuzzNumber(10)), "Buzz");
        assertEquals(fizzBuzz.play(new FizzBuzzNumber(100)), "Buzz");
    }

    @Test
    void check_if_multiple_of_three_and_five() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(fizzBuzz.play(new FizzBuzzNumber(15)), "FizzBuzz");
        assertEquals(fizzBuzz.play(new FizzBuzzNumber(30)), "FizzBuzz");
    }

    @Test
    void check_if_contains_three(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(fizzBuzz.play(new FizzBuzzNumber(31)), "Fizz");
        assertEquals(fizzBuzz.play(new FizzBuzzNumber(23)), "Fizz");
        assertEquals(fizzBuzz.play(new FizzBuzzNumber(13)), "Fizz");
    }

    @Test
    void check_if_contains_five(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(fizzBuzz.play(new FizzBuzzNumber(58)), "Buzz");
        assertEquals(fizzBuzz.play(new FizzBuzzNumber(52)), "Buzz");
        assertEquals(fizzBuzz.play(new FizzBuzzNumber(25)), "Buzz");
    }

    @Test
    void check_if_contains_five_and_three(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(fizzBuzz.play(new FizzBuzzNumber(53)), "FizzBuzz");
        assertEquals(fizzBuzz.play(new FizzBuzzNumber(35)), "FizzBuzz");
    }
}
