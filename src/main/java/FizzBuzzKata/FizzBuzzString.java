package FizzBuzzKata;

public class FizzBuzzString {
    String string;

    FizzBuzzString(String string_) { this.string = string_; }

    public void add(FizzBuzzString another_string) {
        this.string += another_string.getString();
    }

    public String getString() {
        return string;
    }
}
