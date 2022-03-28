package FizzBuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzz_must {

    @Test
    public void returns_array_of_numbers_as_array_of_strings_with_numbers_or_empty_array_when_empty_array_is_received() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertArrayEquals(fizzBuzz.play(new int[] {1, 11, 22}), new String[] {"1", "11", "22"});
        assertArrayEquals(fizzBuzz.play(new int[] {}), new String[] {});
    }

    @Test
    public void return_null_when_error() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertArrayEquals(fizzBuzz.play(new int[] {-3}), null);
        assertArrayEquals(fizzBuzz.play(new int[] {4, -9}), null);
        assertArrayEquals(fizzBuzz.play(new int[] {8, 105}), null);

    }

    @Test
    public void check_if_multiple_of_three() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertArrayEquals(fizzBuzz.play(new int[] {1, 3}), new String[] {"1", "Fizz"});
        assertArrayEquals(fizzBuzz.play(new int[] {2, 4, 3}), new String[] {"2", "4", "Fizz"});
    }

    @Test
    public void check_if_multiple_of_five() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertArrayEquals(fizzBuzz.play(new int[] {1, 5}), new String[] {"1", "Buzz"});
        assertArrayEquals(fizzBuzz.play(new int[] {5, 65, 8}), new String[] {"Buzz", "Buzz", "8"});
    }

    @Test
    public void check_if_multiple_of_three_and_five() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertArrayEquals(fizzBuzz.play(new int[] {1, 15, 90}), new String[] {"1", "FizzBuzz", "FizzBuzz"});
        assertArrayEquals(fizzBuzz.play(new int[] {30, 75, 81, 3}), new String[] {"FizzBuzz", "FizzBuzz", "81", "Buzz"});
    }
}