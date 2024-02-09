# Java 

## LearningLambda
람다와 스트림 학습
### method reference
stream()
        .map(x -> x + x) : 데이터 변경, x를 받아서 x+x로 변경
        .filter(x -> x%2==0) : 데이터 필터링, x를 받아서 x%2==0인 것만 필터링 나머지는 없어짐
        .reduce(0, (x, y) -> x + y) : 데이터 집계, x와 y를 받아서 x+y로 집계 x는 초기값 0
        .distinct() : 중복 제거
        .sorted() : 정렬
        .forEach(x -> System.out.println(x)) : 데이터 출력, x를 받아서 출력
