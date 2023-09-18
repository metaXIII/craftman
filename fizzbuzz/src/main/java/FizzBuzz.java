public class FizzBuzz {

  public String process(final int value) {
    final String result;
    if (isDividableBy(value, 15)) {
      result = "fizzbuzz";
    } else if (isDividableBy(value, 5)) {
      result = "buzz";
    } else if (isDividableBy(value, 3)) {
      result = "fizz";
    } else {
      result = String.valueOf(value);
    }
    return result;
  }

  private static boolean isDividableBy(final int value, final int modulo) {
    return value % modulo == 0;
  }
}
