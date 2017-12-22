public class FizzBuzz {
    String evaluate(Integer number) throws NumberNotInValidRangeException {
        if ((number < 1) || (number > 100)) {
            throw new NumberNotInValidRangeException();
        }
        if (number % 3 == 0) {
            return "fizz";
        }
        return number.toString();
    }

    public class NumberNotInValidRangeException extends Exception {
    }
}
