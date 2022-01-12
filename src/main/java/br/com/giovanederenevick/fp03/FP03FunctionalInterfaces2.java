package br.com.giovanederenevick.fp03;

import java.util.List;
import java.util.Random;
import java.util.function.*;

public class FP03FunctionalInterfaces2 {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        Predicate<Integer> isEvenPredicate = x -> x % 2 == 0;

        Function<Integer, Integer> squareFunction = x -> x * x;

        Function<Integer, String> stringOutputFunction = x -> x + " ";

        Consumer<Integer> sysoutConsumer = x -> System.out.println(x);

        BinaryOperator<Integer> sumBinaryOperator = (x, y) -> x + y;

        Supplier<Integer> randomIntegerSupplier = () -> {
            Random random = new Random();
            return random.nextInt(1000);
        };

        UnaryOperator<Integer> unaryOperator = (x) -> 3 * x;

        BiPredicate<Integer, String> biPredicate = (number, str) -> {
            return number<10 && str.length()>5;
        };

        BiFunction<Integer, String, String> biFunction = (number, str) -> {
            return number + " " + str;
        };

        BiConsumer<Integer, String> biConsumer = (s1, s2) -> {
            System.out.println(s1);
            System.out.println(s2);
        };

        IntBinaryOperator intBinaryOperator = (x, y) -> x + y;
    }
}
