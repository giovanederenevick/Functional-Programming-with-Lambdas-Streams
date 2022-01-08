package br.com.giovanederenevick.fp03;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FP03Exercises {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        // Find Functional Interface behind the second argument of reduce method. Create an implementation for the Functional Interface.
        BinaryOperator<Integer> sumBinaryOperator = Integer::sum;
        BinaryOperator<Integer> sumBinaryOperatorDescription = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        };

        int sum = numbers.stream()
                .reduce(0, sumBinaryOperator);

        System.out.println(sum);

        int sum2 = numbers.stream()
                .reduce(0, sumBinaryOperatorDescription);

        System.out.println(sum2);

        // Do Behavior Parameterization for the mapping logic.
        List<Integer> squaredNumbers = mapAndCreateNewList(numbers, x -> x * x);
        System.out.println(squaredNumbers);
    }

    private static List<Integer> mapAndCreateNewList(List<Integer> numbers, Function<Integer, Integer> mappingFunction) {
        return numbers.stream()
                .map(mappingFunction)
                .collect(Collectors.toList());
    }
}
