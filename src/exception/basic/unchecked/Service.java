package exception.basic.unchecked;

// Unchecked 에외는 에외를 잡거나, 던지지 않아도 된다.
// 예외를 잡지 않으면 자동으로 밖으로 던진다.
public class Service {

    Client client = new Client();

    // 필요한 경우 예외를 잡아서 처리할 수 있다.
    public void callCatch() {

        try {
            client.call();
        }
        catch (MyUncheckedException e) {
            // 예외 처리 로직
            System.out.println("예외 처리, message = " + e.getMessage());
        }

        System.out.println("정상 로직");
    }

    // 예외를 잡지 않아도 된다(알아서 호출 스택 흐름 따라서 throws가 있는것처럼, 자연스럽게 상위로 이동한다)
    // 체크 예외와 다르게 throws 예외 선언을 하지 않아도 됩니다.
    public void callThrow() {
        client.call();
    }
}
