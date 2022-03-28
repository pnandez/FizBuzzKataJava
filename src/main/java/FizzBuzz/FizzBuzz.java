package FizzBuzz;

public class FizzBuzz {

    FizzBuzz() {}

    public String[] play(int[] arrayOfNumbers) {

        if(!checkIfArrayNumbersIsFizzBuzz(arrayOfNumbers))
            return null;

        String[] solutionArray = new String[arrayOfNumbers.length];

        for(int i = 0; i < arrayOfNumbers.length; i++) {
            if(checkIfNumberIsDivisible(arrayOfNumbers[i],3) && checkIfNumberIsDivisible(arrayOfNumbers[i], 5 )) {
                solutionArray[i] = "FizzBuzz";
            }
            else if(checkIfNumberIsDivisible(arrayOfNumbers[i],3)) {
                solutionArray[i] = "Fizz";
            }
            else if(checkIfNumberIsDivisible(arrayOfNumbers[i], 5 )){
                solutionArray[i] = "Buzz";
            }
            else
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

    private boolean checkIfNumberIsDivisible(int numberToDivide, int divisor){
        return numberToDivide % divisor == 0;
    }
}
