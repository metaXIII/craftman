import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.function.Consumer;

public class RpnCalculator {

  public int process(final String rpnInput) {
    final List<String> parameters = Arrays.stream(rpnInput.split(" ")).toList();

    final Stack<Integer> numberStack = new Stack<>();

    for (final String parameter : parameters) {
      if (isNumeric(parameter)) {
        numberStack.push(Integer.parseInt(parameter));
      } else {
        OperationStrategy.of(parameter).calculate(numberStack);
      }
    }
    return numberStack.pop();
  }

  private boolean isNumeric(final String parameter) {
    return parameter.matches("\\d+");
  }

  private enum OperationStrategy {
    ADD("+", numberStack -> numberStack.push(numberStack.pop() + numberStack.pop())),
    SUB(
      "-",
      numberStack -> {
        final int operandRight = numberStack.pop();
        final int operandLeft = numberStack.pop();
        numberStack.push(operandLeft - operandRight);
      }
    ),
    MUL("*", numberStack -> numberStack.push(numberStack.pop() * numberStack.pop())),
    DIV(
      "/",
      numberStack -> {
        final int operandRight = numberStack.pop();
        final int operandLeft = numberStack.pop();
        numberStack.push(operandLeft / operandRight);
      }
    ),
    SQRT("SQRT", numberStack -> numberStack.push((int) Math.sqrt(numberStack.pop()))),
    MAX(
      "MAX",
      numberStack -> {
        int maxValue = numberStack.stream().mapToInt(i -> i).max().orElseThrow();
        numberStack.clear();
        numberStack.push(maxValue);
      }
    );

    private final String operator;
    private final Consumer<Stack<Integer>> operation;

    OperationStrategy(final String operator, final Consumer<Stack<Integer>> operation) {
      this.operator = operator;
      this.operation = operation;
    }

    public static OperationStrategy of(final String operator) {
      return Arrays.stream(values()).filter(strategy -> strategy.operator.equals(operator)).findFirst().orElseThrow();
    }

    public void calculate(final Stack<Integer> numberStack) {
      this.operation.accept(numberStack);
    }
  }
}
