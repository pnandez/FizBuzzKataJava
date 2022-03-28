package FizzBuzzKata;

public class FizzBuzz {
    private int fizz;
    private int buzz;

    FizzBuzz() {
        fizz = 3;
        buzz = 5;
    }

    public String play(Integer number) {
        String solution = "";

        if (number <= 0)
            return "Error. Número no aceptado";

        if (number % fizz == 0)
            solution += "Fizz";

        if (number % buzz == 0)
            solution += "Buzz";

        if (number % fizz != 0 && number % buzz != 0)
            solution = Integer.toString(number);

        return solution;
    }
}
