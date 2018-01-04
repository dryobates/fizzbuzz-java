public class FizzBuzz {
    String answer;
    AskedNumber askedNumber;

    public String evaluate(Integer number) throws NumberNotInValidRangeException {
        answer = "";
        askedNumber= new AskedNumber(number);
        verifyNumberInRange();
        sayWordIfMatches();
        sayNumberOtherwise();
        return answer;
    }

    private void verifyNumberInRange() throws NumberNotInValidRangeException {
        if (askedNumber.isNotInRange(1, 100)) {
            throw new NumberNotInValidRangeException();
        }
    }

    private void sayWordIfMatches() {
        sayFizzPartIfMatches();
        sayBuzzPartIfMatches();
    }

    private void sayFizzPartIfMatches() {
        if (askedNumber.isDivisibleBy(3)) {
            say("fizz");
        }
    }

    private void sayBuzzPartIfMatches() {
        if (askedNumber.isDivisibleBy(5)) {
            say("buzz");
        }
    }

    private void say(String word) {
        answer += word;
    }

    private void sayNumberOtherwise() {
        if (answer.isEmpty()) {
            answer = askedNumber.toString();
        }
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
