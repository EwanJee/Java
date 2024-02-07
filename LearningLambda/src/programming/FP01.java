package programming;

import java.util.List;

public class FP01 {
    public static void main(String[] args){
//        printAllNumbersInListFunctional(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
//        printSquareOfFunctional(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
//        List<String> list = List.of("Apple", "Bat", "Cat", "Dog");
//        list.stream()
//                .filter(course -> course.length() > 3)
//                .map(course -> " l " + course.length())
//                .forEach(System.out::println);



    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number % 2 == 0) // Lambda expression
                .forEach(number -> System.out.println(number));
    }
    private static void printSquareOfFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number % 2 == 0) // Lambda expression
                .map(n -> n * n) // edit the number
                .forEach(System.out::println);
    }
}
