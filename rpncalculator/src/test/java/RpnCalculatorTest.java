import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.EmptyStackException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RpnCalculatorTest {

  RpnCalculator rpnCalculator;

  @BeforeEach
  void init() {
    rpnCalculator = new RpnCalculator();
  }

  @Test
  void rpnCalcOf12PlusReturns3() {
    // Given
    final String rpnInput = "1 2 +";
    final int expected = 3;
    // When
    final int result = rpnCalculator.process(rpnInput);
    // Then
    assertEquals(expected, result);
  }

  @Test
  void rpnCalcOf1Returns1() {
    // Given
    final String rpnInput = "1";
    final int expected = 1;
    // When
    final int result = rpnCalculator.process(rpnInput);
    // Then
    assertEquals(expected, result);
  }

  @Test
  void rpnCalcOf1_2_3_max_Add_ThrowsException() {
    // Given
    final String rpnInput = "1 2 3 MAX +";
    // When Then
    assertThrows(EmptyStackException.class, () -> rpnCalculator.process(rpnInput));
  }

  @Test
  void rpnCalcOf1_2_3_max_Returns3() {
    // Given
    final String rpnInput = "1 2 3 MAX";
    final int expected = 3;

    // When
    final int result = rpnCalculator.process(rpnInput);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void rpnCalcOf20_5DivideReturns4() {
    // Given
    final String rpnInput = "20 5 /";
    final int expected = 4;

    // When
    final int result = rpnCalculator.process(rpnInput);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void rpnCalcOf2_5MultiplyReturns10() {
    // Given
    final String rpnInput = "2 5 *";
    final int expected = 10;

    // When
    final int result = rpnCalculator.process(rpnInput);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void rpnCalcOf3_5_8Multiply_7_Plus_Multiply_Returns141() {
    // Given
    final String rpnInput = "3 5 8 * 7 + *";
    final int expected = 141;

    // When
    final int result = rpnCalculator.process(rpnInput);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void rpnCalcOf4_2Plus3MinusReturns3() {
    // Given
    final String rpnInput = "4 2 + 3 -";
    final int expected = 3;

    // When
    final int result = rpnCalculator.process(rpnInput);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void rpnCalcOf8_9_SQRT_ADD_Returns3() {
    // Given
    final String rpnInput = "8 9 SQRT +";
    final int expected = 11;

    // When
    final int result = rpnCalculator.process(rpnInput);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void rpnCalcOf9_SQRT_Returns3() {
    // Given
    final String rpnInput = "9 SQRT";
    final int expected = 3;

    // When
    final int result = rpnCalculator.process(rpnInput);

    // Then
    assertEquals(expected, result);
  }
}
