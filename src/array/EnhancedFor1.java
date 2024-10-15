package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // 일반적인 for문
        for(int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }

        for(int number : numbers) {
            System.out.println(number);
        }

        for(int i = 0; i < numbers.length; i++) {
            System.out.println("number : " + i + ", 결과 : " + numbers[i]);
        }
    }
}
