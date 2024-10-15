package scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 정수 입력 : ");
        int intVal1 = scanner.nextInt();
        System.out.print("두번째 정수 입력 : ");
        int intVal2 = scanner.nextInt();

        if (intVal1 == intVal2) {
            System.out.println("두 정수는 같은 값이다 : " + intVal1);
        }
        else {
            int result = 0;

            if (intVal1 > intVal2) {
                result = intVal1;
            }
            else {
                result = intVal2;
            }
            System.out.println("두 입력 정수 중 더 큰 정수는 : " + result);
        }
    }
}
