package br.com.giovanederenevick.fp02;

import java.util.List;
import java.util.stream.Collectors;

public class FP02Exercises {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        // Square every number in a list and find the sum of squares
        System.out.println(numbers.stream().map(x -> x*x).reduce(0, Integer::sum));

        // Cube every number in a list and find the sum of cubes
        System.out.println(numbers.stream().map(x -> Math.pow(x, 3)).reduce(0.0, Double::sum));

        // Find Sum of Odd Numbers in a list
        System.out.println(numbers.stream().filter(x -> x%2 != 0).reduce(0, Integer::sum));

        // Create a List with Even Numbers Filtered from the Numbers List
        List<Integer> evenNumbers = numbers.stream().filter(x -> x%2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbers);

        List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");

        // Create a List with lengths of all course titles.
        List<Integer> coursesLengths = courses.stream().map(String::length).collect(Collectors.toList());
        System.out.println(coursesLengths);
    }
}
