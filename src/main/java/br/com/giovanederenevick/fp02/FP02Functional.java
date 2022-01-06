package br.com.giovanederenevick.fp02;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FP02Functional {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

//        System.out.println(addListFunctional(numbers));

//        printDistinctValues(numbers);

//        printSortedValues(numbers);

//        printSortedDistinctValues(numbers);

        List<Integer> doubledNumbers = doubleList(numbers);
        System.out.println(doubledNumbers);

        List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");

//        printSortedCourses(courses);

//        printSortedDescCourses(courses);

//        printSortedCustomCourses(courses);
    }

    private static List<Integer> doubleList(List<Integer> numbers) {

        return numbers.stream()
                .map(x -> x*2)
                .collect(Collectors.toList());
    }

    private static void printSortedCustomCourses(List<String> courses) {

        courses.stream()
                .sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);
    }

    private static void printSortedDescCourses(List<String> courses) {

        courses.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }

    private static void printSortedCourses(List<String> courses) {

        courses.stream()
                .sorted()
                .forEach(System.out::println);
    }

    private static void printSortedDistinctValues(List<Integer> numbers) {

        numbers.stream()
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }

    private static void printSortedValues(List<Integer> numbers) {

        numbers.stream()
                .sorted()
                .forEach(System.out::println);
    }

    private static void printDistinctValues(List<Integer> numbers) {

        numbers.stream()
                .distinct()
                .forEach(System.out::println);
    }

    private static Integer addListFunctional(List<Integer> numbers) {

        // How to loop
        // How to store the sum
        return numbers.stream()
//                .reduce(0, FP02Functional::sum);
//                .reduce( (x, y) -> x + y);
                .reduce(0, Integer::sum);
    }

    private static Integer sum(Integer aggregate, Integer nextNumber) {
        System.out.println(aggregate + " " + nextNumber);
        return aggregate + nextNumber;
    }
}
