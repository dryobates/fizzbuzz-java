import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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

    @ParameterizedTest
    @ValueSource(ints = {3, 6})
    void returnsFizzWhenDivisibleBy3Given(int number) throws FizzBuzz.NumberNotInValidRangeException {
        String result = fizzBuzz.evaluate(number);
        assertEquals("fizz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10})
    void returnsBuzzWhenDivisibleBy5Given(int number) throws FizzBuzz.NumberNotInValidRangeException {
        String result = fizzBuzz.evaluate(number);
        assertEquals("buzz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 30})
    void returnsFizzBuzzWhenDivisibleBy3And5Given(int number) throws FizzBuzz.NumberNotInValidRangeException {
        String result = fizzBuzz.evaluate(number);
        assertEquals("fizzbuzz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 4})
    void returnsNumberAsStringIfNotDivisibleBy3Or5(int argument) throws FizzBuzz.NumberNotInValidRangeException {
        Integer number = new Integer(argument);
        String result = fizzBuzz.evaluate(number);
        assertEquals(number.toString(), result);
    }

}
