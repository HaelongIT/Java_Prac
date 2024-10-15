package method;

public class MethodReturn2 {
    public static void checkAge(int age) {
        if (age >= 18) {
            System.out.println("입장 하십시오!");
            return;
        }
        else {
            System.out.println("미성년은 입장불낙!");
            return;
        }
    }

    public static void main(String[] args) {
        checkAge(18);
        checkAge(20);
        checkAge(9);
    }
}
