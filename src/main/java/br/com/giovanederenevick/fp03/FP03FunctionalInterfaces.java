package br.com.giovanederenevick.fp03;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FP03FunctionalInterfaces {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        Predicate<Integer> integerPredicate = x -> x % 2 == 0;
        Predicate<Integer> integerPredicateDescription = new Predicate<Integer>() {
            @Override
            public boolean test(Integer x) {
                return x % 2 == 0;
            }
        };

        Function<Integer, Integer> integerIntegerFunction = x -> x * x;
        Function<Integer, Integer> integerIntegerFunctionDescription = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x * x;
            }
        };

        Consumer<Integer> printConsumer = System.out::println;
        Consumer<Integer> printConsumerDescription = new Consumer<Integer>() {
            @Override
            public void accept(Integer x) {
                System.out.println(x);
            }
        };

        numbers.stream()
                .filter(integerPredicateDescription)
                .map(integerIntegerFunctionDescription)
                .forEach(printConsumerDescription);
    }
}
