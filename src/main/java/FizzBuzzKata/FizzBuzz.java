package FizzBuzzKata;

public class FizzBuzz {
    private int fizz;
    private int buzz;

    FizzBuzz() {
        fizz = 3;
        buzz = 5;
    }

    public String play(int n) {
        String sol = "";

        if (n <= 0)
            return "Error. Número no aceptado";
        if(n % fizz == 0)
            sol += "Fizz";

        if(n % buzz == 0)
            sol += "Buzz";

        return sol;
    }
}
