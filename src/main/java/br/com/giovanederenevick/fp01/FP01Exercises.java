package br.com.giovanederenevick.fp01;

import java.util.List;

public class FP01Exercises {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        // Print Only Odd Numbers from the List
//        printOddNumbersInListStructured(numbers);

        // Print the cubes of odd numbers
//        numbers.stream().filter( number -> number%2 != 0).map( number -> Math.pow(number, 3) ).forEach(System.out::println);

        List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");

        // Print All Courses individually
//        printAllCoursesInListStructured(courses);

        // Print Courses Containing the word "Spring"
//        printAllCoursesWithWordInListStructured(courses, "Spring");

        // Print Courses Whose Name has at least 4 letters
//        courses.stream().filter(course -> course.length() >= 4).forEach(System.out::println);

        // Print the number of characters in each course name
        courses.stream().map(String::length).forEach(System.out::println);
    }

    private static void printOddNumbersInListStructured(List<Integer> numbers) {

        numbers.stream()
                .filter( number -> number%2 != 0)
                .forEach(System.out::println);
    }

    private static void printAllCoursesInListStructured(List<String> courses) {

        courses.stream()
                .forEach(System.out::println);
    }

    private static void printAllCoursesWithWordInListStructured(List<String> courses, String word) {

        courses.stream()
                .filter( course -> course.contains(word))
                .forEach(System.out::println);
    }
}
