package FizzBuzz;

public class FizzBuzz {
    private int fizz;
    private int buzz;

    FizzBuzz() {
        fizz = 3;
        buzz = 5;
    }

    public String[] play(int[] arrayOfNumbers) {

        String[] solutionArray = new String[arrayOfNumbers.length];

        for(int i = 0; i < arrayOfNumbers.length; i++) {
            solutionArray[i] =  Integer.toString(arrayOfNumbers[i]);
        }
        return solutionArray;
    }

}
