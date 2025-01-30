package generic.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;
        Object obj = GenericMethod.objMethod(i);
//        Integer result = (Integer) GenericMethod.objMethod(i);

        // 타입 인자(Type Argument) 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);
//        System.out.println("result2 = " + result2);

        // 타입의 상한을 걸어서 Number 이하만 타입으로 가능
        Integer integerValue = GenericMethod.<Integer>numberMethod(10);
        Double doubleValue = GenericMethod.<Double>numberMethod(20.0);

        String s = GenericMethod.<String>genericMethod("hello");
        // GenericMethod.<String>numberMethod("hello");     // 타입 매개변수 제한에 의해 막힌다(컴파일 오류)

        System.out.println("타입 추론");
        Integer result2 = GenericMethod.genericMethod(i);
        Integer integerValue2 = GenericMethod.numberMethod(10);
        Double doubleValue2 = GenericMethod.numberMethod(20.0);
    }
}
