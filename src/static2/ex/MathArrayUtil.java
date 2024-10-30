package static2.ex;

public class MathArrayUtil {
    private MathArrayUtil() {           // 인스턴스 생성 막음
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static double average(int[] array) {
        double aver = 0;
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        aver = (double) sum / array.length;
        return aver;
    }

    public static int min(int[] array) {
        int minNum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                minNum = array[i];
            }
            else if (minNum > array[i]) {
                minNum = array[i];
            }
            else {
                continue;
            }
        }
        return minNum;
    }

    public static int max(int[] array) {
        int maxNum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                maxNum = array[i];
            }
            else if (maxNum < array[i]) {
                maxNum = array[i];
            }
            else {
                continue;
            }
        }
        return maxNum;
    }
}
