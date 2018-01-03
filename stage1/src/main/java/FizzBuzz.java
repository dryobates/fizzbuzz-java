public class FizzBuzz {
    String answer;
    AskedNumber askedNumber;

    public String evaluate(Integer number) throws NumberNotInValidRangeException {
        answer = "";
        askedNumber= new AskedNumber(number);
        verifyNumberInRange();
        sayFizzIfMatches();
        sayBuzzIfMatches();
        sayNumberIfNoMatch();
        return answer;
    }

    private void verifyNumberInRange() throws NumberNotInValidRangeException {
        if (askedNumber.isNotInRange(1, 100)) {
            throw new NumberNotInValidRangeException();
        }
    }

    private void sayFizzIfMatches() {
        if (askedNumber.isDivisibleBy(3)) {
            say("fizz");
        }
    }

    private void sayBuzzIfMatches() {
        if (askedNumber.isDivisibleBy(5)) {
            say("buzz");
        }
    }

    private void sayNumberIfNoMatch() {
        if (answer.isEmpty()) {
            answer = askedNumber.toString();
        }
    }

    private void say(String word) {
        answer += word;
    }

    public class NumberNotInValidRangeException extends Exception {
    }
}

class AskedNumber {

    Integer value;

    public AskedNumber(Integer value) {
        this.value = value;
    }

    public boolean isDivisibleBy(int divisor) {
        return (this.value % divisor == 0);
    }

    public boolean isNotInRange(int minValue, int maxValue) {
        return !isInRange(minValue, maxValue);
    }

    public boolean isInRange(int minValue, int maxValue) {
        return ((this.value >= minValue) && (this.value <= maxValue));
    }

    public String toString() {
        return this.value.toString();
    }
}