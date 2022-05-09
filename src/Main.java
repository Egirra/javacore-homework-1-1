// Ошибка возникает из-за того, что при указанных данных переменная int b равна 0.
// Возможное решение:
// BinaryOperator<Integer> divide = (x, y) -> y == 0 ? 0 : x / y;

public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.divide.apply(a, b);

        calc.println.accept(c);
    }
}
