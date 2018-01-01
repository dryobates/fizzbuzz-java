public class FizzBuzz {
    String result = "";
    Integer number;

    public String evaluate(Integer number) throws NumberNotInValidRangeException {
        this.number = number;
        verifyNumberInRange();
        appendFizzIfMatches();
        appendBuzzIfMatches();
        if (result.isEmpty()) {
            return this.number.toString();
        } else {
            return result;
        }
    }

    private void verifyNumberInRange() throws NumberNotInValidRangeException {
        if ((this.number < 1) || (this.number > 100)) {
            throw new NumberNotInValidRangeException();
        }
    }

    private void appendFizzIfMatches() {
        if (isDivisibleBy(3)) {
            result += "fizz";
        }
    }

    private void appendBuzzIfMatches() {
        if (isDivisibleBy(5)) {
            result += "buzz";
        }
    }

    private boolean isDivisibleBy(int divisor) {
        return this.number % divisor == 0;
    }

    public class NumberNotInValidRangeException extends Exception {
    }
}
