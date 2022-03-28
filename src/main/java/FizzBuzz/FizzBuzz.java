package FizzBuzz;

public class FizzBuzz {
    private int fizz;
    private int buzz;

    FizzBuzz() {
        fizz = 3;
        buzz = 5;
    }

    public String[] play(int[] arrayOfNumbers) {

        if(!checkIfArrayNumbersIsFizzBuzz(arrayOfNumbers))
            return null;

        String[] solutionArray = new String[arrayOfNumbers.length];

        for(int i = 0; i < arrayOfNumbers.length; i++) {
            if(arrayOfNumbers[i] % 3 == 0) {
                solutionArray[i] = "Fizz";
            } else
            solutionArray[i] =  Integer.toString(arrayOfNumbers[i]);
        }
        return solutionArray;
    }

    private boolean checkIfArrayNumbersIsFizzBuzz(int[] arrayOfNumbers) {
        for (int number: arrayOfNumbers) {
            if(number <= 0 || number > 100) {
                return false;
            }

        }
        return true;
    }
}
