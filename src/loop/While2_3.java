package loop;

public class While2_3 {
    public static void main(String[] args) {
        int startNum = 8;
        int endNum = 12;
        int sum = 0;

        while (startNum <= endNum) {
            sum += startNum;
            System.out.println("더할 숫자 : " + startNum + ", 현재 총합 : " + sum);
            startNum++;
        }
        System.out.println("총합 : " + sum);
        // 8 9 10 11 12 = 17 + 21 + 12 = 38 + 12 = 50
    }
}
