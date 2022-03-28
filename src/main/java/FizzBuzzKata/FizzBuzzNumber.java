package FizzBuzzKata;

public class FizzBuzzNumber {
    Integer number;
    final Integer fizz = 3;
    final Integer buzz = 5;

    FizzBuzzNumber(Integer number_){
        this.number = number_;
    }

    public boolean isFizzNumber(){
        return (number % fizz == 0 || checkIfThisContainsDigit(3));

    }

    private boolean checkIfThisContainsDigit(Integer numberToContain) {
        Integer temporalNumber = this.number;
        while(temporalNumber > 0) {
            if(temporalNumber % 10 == numberToContain)
                return true;
            temporalNumber /= 10;
        }
        return false;
    }


    public boolean isBuzzNumber(){
        return (number % buzz == 0 || checkIfThisContainsDigit(5));
    }

    public boolean isNotFizzBuzzNumber(){
        return number <= 0;
    }

    @Override
    public java.lang.String toString() {
        return number.toString();
    }
}