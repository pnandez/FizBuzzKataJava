package FizzBuzzKata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzz_must {

    @Test
    void show_numbers_as_String(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(fizzBuzz.play(1), "1");
        assertEquals(fizzBuzz.play(2), "2");
        assertEquals(fizzBuzz.play(4), "4");
        assertEquals(fizzBuzz.play(101), "101");
        assertEquals(fizzBuzz.play(131), "131");
    }

    @Test
    void not_accept_negative_numbers_or_zero() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(fizzBuzz.play(0), "Error. Número no aceptado");
        assertEquals(fizzBuzz.play(-1), "Error. Número no aceptado");
        assertEquals(fizzBuzz.play(-100), "Error. Número no aceptado");
        assertEquals(fizzBuzz.play(-5), "Error. Número no aceptado");
        assertEquals(fizzBuzz.play(-3), "Error. Número no aceptado");
        assertEquals(fizzBuzz.play(-20), "Error. Número no aceptado");

    }

    @Test
    void check_if_multiple_of_three() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(fizzBuzz.play(3), "Fizz");
        assertEquals(fizzBuzz.play(6), "Fizz");
        assertEquals(fizzBuzz.play(9), "Fizz");
        assertEquals(fizzBuzz.play(36), "Fizz");

    }

    @Test
    void check_if_multiple_of_five(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(fizzBuzz.play(5), "Buzz");
        assertEquals(fizzBuzz.play(20), "Buzz");
        assertEquals(fizzBuzz.play(10), "Buzz");
        assertEquals(fizzBuzz.play(35), "Buzz");
        assertEquals(fizzBuzz.play(100), "Buzz");
    }

    @Test
    void check_if_multiple_of_three_and_five() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(fizzBuzz.play(15), "FizzBuzz");
        assertEquals(fizzBuzz.play(30), "FizzBuzz");
    }
}
