package loop;

public class While2_2 {
    public static void main(String[] args) {
        int sum = 0;
        int cnt = 0;

        while (cnt < 3) {
            cnt++;
            sum += cnt;
        }
        System.out.println("sum = " + sum);
    }
}
