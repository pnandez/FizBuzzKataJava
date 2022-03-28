package FizzBuzz;

public class FizzBuzz {
    public FizzBuzz() {}

    public String play(int number) {
        if(number <= 0 || number > 100)
            return "Número no aceptado";
        return Integer.toString(number);
    }
}
