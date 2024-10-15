package loop;

public class For2 {
    public static void main(String[] args) {
        int startNum = 3;
        int endNum = 5;
        int sum = 0;

        for (int i = startNum; i <= endNum; i++) {
            sum += i;
            System.out.println("현재 합계 : " + sum);
        }
        System.out.println("총 합계 : " + sum);
    }
}
