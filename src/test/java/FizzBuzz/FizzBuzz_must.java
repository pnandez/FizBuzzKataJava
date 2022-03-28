package FizzBuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzz_must {

    @Test
    void show_numbers_as_String(){
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertEquals(fizzBuzz.play(1), "1");
        assertEquals(fizzBuzz.play(2), "2");
        assertEquals(fizzBuzz.play(4), "4");
        assertEquals(fizzBuzz.play(98), "98");
    }

    @Test
    void not_accept_negative_numbers_or_zero() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        NumberFormatException expectedException = new NumberFormatException("Número no aceptado");


        assertEquals(fizzBuzz.play(0), expectedException.getMessage());
        assertEquals(fizzBuzz.play(-1), expectedException.getMessage());
        assertEquals(fizzBuzz.play(-100), expectedException.getMessage());
        assertEquals(fizzBuzz.play(-5), expectedException.getMessage());
        assertEquals(fizzBuzz.play(-3), expectedException.getMessage());
        assertEquals(fizzBuzz.play(-20), expectedException.getMessage());
    }
}
