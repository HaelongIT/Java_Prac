package loop;

public class Break {
    public static void main(String[] args) {
        int sum = 0;
        int cnt = 1;

        while (true) {
            sum += cnt;
            cnt++;

            if (sum > 10) {
                System.out.println("10보다 큰 첫 총합은 " + sum);
                break;
            }
        }
    }
}
