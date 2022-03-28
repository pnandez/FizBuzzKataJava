package FizzBuzz;

public class FizzBuzz {
    public FizzBuzz() {}

    public String play(int number) {
        if(number <= 0 || number > 100)
            return "Número no aceptado";

        if(number % 3 == 0)
            return "Fizz";

        if(number % 5 == 0)
            return "Buzz";

        return Integer.toString(number);
    }
}
