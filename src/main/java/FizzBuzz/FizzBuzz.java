package FizzBuzz;

public class FizzBuzz {
    public FizzBuzz() {}

    public String play(int number) {
        if(number <= 0 || number > 100)
            return "Número no aceptado";

        if((number % 3 == 0 || checkIfContainsNumber(number, 3)) && number % 5 == 0)
            return "FizzBuzz";

        if(number % 3 == 0 || checkIfContainsNumber(number, 3))
            return "Fizz";

        if(number % 5 == 0 || checkIfContainsNumber(number, 5))
            return "Buzz";

        return Integer.toString(number);
    }

    private boolean checkIfContainsNumber(int numberToCheck, int numberToContain) {
        return Integer.toString(numberToCheck).contains(Integer.toString(numberToContain));
    }
}
