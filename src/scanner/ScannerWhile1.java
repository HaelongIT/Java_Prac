package scanner;

import java.util.Scanner;

public class ScannerWhile1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("문자열을 입력하시오(exit : 종료) : ");
            String str = scanner.nextLine();

            if (str.equals("exit")) {
                System.out.println("시스템 종료합니다.");
                break;
            }
            System.out.println("입력받은 문자열은 : " + str);
        }
    }
}
