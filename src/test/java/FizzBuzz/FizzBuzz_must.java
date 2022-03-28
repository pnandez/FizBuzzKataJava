package FizzBuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzz_must {
    @Test
    public void returns_array_of_numbers_as_array_of_strings_with_numbers_or_empty_array_when_empty_array_is_received() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertArrayEquals(fizzBuzz.play(new int[] {1, 10, 20}), new String[] {"1", "10", "20"});
        assertArrayEquals(fizzBuzz.play(new int[] {}), new String[] {});
    }


    @Test
    public void return_null_when_error() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertArrayEquals(fizzBuzz.play(new int[] {-3}), null);
        assertArrayEquals(fizzBuzz.play(new int[] {4, -9}), null);
    }

}