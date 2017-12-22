import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
// import org.junit.jupiter.params.ParameterizedTest;
// import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void throwsNumberNotInValidRangeExceptionIfNumberIs0() {
        int number = 0;
        assertThrowsNumberNotInValidRangeExceptionFor(number);
    }

    @Test
    void throwsNumberNotInValidRangeExceptionIfNumberIsNegative() {
        int number = -1;
        assertThrowsNumberNotInValidRangeExceptionFor(number);
    }

    @Test
    void throwsNumberNotInValidRangeExceptionIfNumberIs101() {
        int number = 101;
        assertThrowsNumberNotInValidRangeExceptionFor(number);
    }

    private void assertThrowsNumberNotInValidRangeExceptionFor(int number) {
        assertThrows(
            FizzBuzz.NumberNotInValidRangeException.class,
            () -> {
                fizzBuzz.evaluate(number);
            }
        );
    }

    @Test
    void returns1When1Given() throws FizzBuzz.NumberNotInValidRangeException {
        String result = fizzBuzz.evaluate(1);
        assertEquals("1", result);
    }

    @Test
    void returns2When2Given() throws FizzBuzz.NumberNotInValidRangeException {
        String result = fizzBuzz.evaluate(2);
        assertEquals("2", result);
    }

    @Test
    void returnsFizzWhen3Given() throws FizzBuzz.NumberNotInValidRangeException {
        String result = fizzBuzz.evaluate(3);
        assertEquals("fizz", result);
    }

    @Test
    void returns4When4Given() throws FizzBuzz.NumberNotInValidRangeException {
        String result = fizzBuzz.evaluate(4);
        assertEquals("4", result);
    }

    // FIXME: "No ParameterResolver registered"
//    @Test
//    @ParameterizedTest
//    @ValueSource(ints = {1, 2, 4})
//    void returnsNumberAsStringIfNotDivisibleBy3(int argument) throws FizzBuzz.NumberNotInValidRangeException {
//        Integer number = new Integer(argument);
//        String result = fizzBuzz.evaluate(number);
//        assertEquals(number.toString(), result);
//    }
}
