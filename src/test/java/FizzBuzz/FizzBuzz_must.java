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
}
