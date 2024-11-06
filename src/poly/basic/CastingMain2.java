package poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        // 다형적 참조
        Parent poly = new Child();

        // 일시적 다운 캐스팅
        ((Child) poly).childMethod();
    }
}
