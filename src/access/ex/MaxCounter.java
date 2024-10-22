package access.ex;

public class MaxCounter {
    private int count;
    private int max;

    // 생성자
    public MaxCounter(int max) {
        this.count = 0;
        this.max = max;
    }

    // 숫자 증가 메서드(외부 기능)
    public void increment() {
        if (count < max) {
            count += 1;
        }
        else {
            System.out.println("최대값을 초과할 수 없음");
        }
    }

    // 증가한 값 반환 메서드(외부 기능)
    public int getCount() {
        return count;
    }
}
