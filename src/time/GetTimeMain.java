package time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class GetTimeMain {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2030, 1,
                1, 13, 30, 59);
        System.out.println("YEAR = " + ldt.get(ChronoField.YEAR));

        System.out.println("편의 메서드 사용");
        System.out.println("YEAR = " + ldt.getYear());

        System.out.println("편의 메서드에 없음");
        System.out.println("MINUTE_OF_DAY = " + ldt.get(ChronoField.MINUTE_OF_DAY));
    }
}
