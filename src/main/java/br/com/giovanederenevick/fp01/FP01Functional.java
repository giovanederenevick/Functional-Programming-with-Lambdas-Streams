package br.com.giovanederenevick.fp01;

import java.util.List;

public class FP01Functional {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

//        printAllNumbersInListStructured(numbers);
//        printEvenNumbersInListStructured(numbers);
//        printSquaresOfEvenNumbersInListStructured(numbers);
    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {

        numbers.stream()
                .forEach(System.out::println); //Method Reference
    }

    private static void printEvenNumbersInListStructured(List<Integer> numbers) {

        numbers.stream()
                .filter( number -> number%2 == 0)
                .forEach(System.out::println);
    }

    private static void printSquaresOfEvenNumbersInListStructured(List<Integer> numbers) {

        numbers.stream()
                .filter( number -> number%2 == 0)
                .map( number -> number*number)
                .forEach(System.out::println);
    }
}
