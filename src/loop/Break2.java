package loop;

public class Break2 {
    public static void main(String[] args) {
        int start = 1;
        int sum = 0;

        for (int i = start; ;i++) {
            sum += i;
            System.out.println("현재 총합 : " + sum);

            if (sum > 10) {
                System.out.println("10보다 큰 첫 총합 : " + sum);
                break;
            }
        }
    }
}
