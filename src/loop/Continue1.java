package loop;

public class Continue1 {
    public static void main(String[] args) {
        int cnt = 1;

        do {
            if (cnt == 3) {
                cnt++;
                continue;
            }
            System.out.println("이번 숫자는 : " + cnt);
            cnt++;
        } while (cnt <= 5);
    }
}
