import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    FizzBuzz fizzbuzz;

    @BeforeEach
    public void init() {
        fizzbuzz = new FizzBuzz();
    }

    @Test
    public void givenOneWhenFizzBuzzThenReturnOne() {
        // Given
        int value = 1;
        String expected = "1";

        // When
        String result = fizzbuzz.process(value);

        // Then
        assertEquals(expected, result);
    }

    @Test
    public void givenThreeWhenFizzBuzzThenReturnFizz() {
        // Given
        int value = 3;
        String expected = "fizz";

        // When
        String result = fizzbuzz.process(value);

        // Then
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10})
    @DisplayName("given multiple of five exclusive ...")
    public void givenMultipleOf5ExclusiveWhenFizzBuzzThenReturnBuzz(final int value) {
        // Given
        String expected = "buzz";

        // When
        String result = fizzbuzz.process(value);

        // Then
        assertEquals(expected, result);
    }


    @Test
    public void givenSixWhenFizzBuzzThenReturnFizz() {
        // Given
        int value = 6;
        String expected = "fizz";

        // When
        String result = fizzbuzz.process(value);

        // Then
        assertEquals(expected, result);
    }

    @Test
    public void given15WhenFizzBuzzThenReturnFizzbuzz() {
        // Given
        int value = 15;
        String expected = "fizzbuzz";

        // When
        String result = fizzbuzz.process(value);

        // Then
        assertEquals(expected, result);
    }

    @Test
    public void given99WhenFizzBuzzThenReturnFizz() {
        // Given
        int value = 99;
        String expected = "fizz";

        // When
        String result = fizzbuzz.process(value);

        // Then
        assertEquals(expected, result);
    }

}
