package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {

        GenericBox<Integer> integerBox = new GenericBox<>();     // 생성 시점에 T의 타입이 결정됨
        integerBox.set(10);
        // integetBox.set("문자100");     // Integer 타입만 허용(컴파일 오류)

        Integer integer = integerBox.get();     // Integer 타입으로 반환(다운 캐스팅 불필요)
        System.out.println("integer = " + integer);

        // 원하는 모든 타입 사용 가능
        GenericBox<Double> doubleBox = new GenericBox<>();
        doubleBox.set(10.5);
        Double doubleValue = doubleBox.get();
        System.out.println("doubleValue = " + doubleValue);
    }
}
