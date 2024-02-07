package programming;

import java.util.List;

public class FP02Structured {
    public static void main(String[] args){
        List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
        int sum = addListStructured(numbers);
        System.out.println(sum);
    }

    private static int addListStructured(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0, (x, y) -> x + y); // 스트림의 요소를 하나의 결과로 요약 여기서 0은 x, y는 numbers의 요소
    }
}