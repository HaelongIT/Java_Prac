package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        // final 지역 변수1
        final int data1;
        data1 = 10;         // 최초 한번 할당 이후 변경 안됨

        // final 지역 변수2
        final int data2 = 10;

        method(10);
    }

    static void method(final int parameter) {
        // parameter = 20;              // final 로 가져온 매개변수를 변경 가능할리 없음
    }
}
