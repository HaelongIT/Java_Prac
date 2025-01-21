package exception.basic.checked;

public class Service {
    Client client = new Client();

    // 체크 예외를 잡아서 처리하는 코드
    public void callCatch() {

        try {
            client.call();      // 예외가 터지는 순간 throw new MyCheckedException("ex") 로 코드가 변한다고 생각해라(예외가 날라오니까)
        }
        catch (MyCheckedException e) {
            // 예외 처리 로직
            System.out.println("예외 처리, message = " + e.getMessage());       // getMessage() : 오류 객체 생성시 생성자에 들어간 message 다시 꺼내오기
        }
        System.out.println("정상 흐름");
    }

    // 체크 예외를 밖으로 던지는 코드
    // 체크 예외는 예외를 잡지 않고 밖으로 던지려면 throws 예외를 메서드에 필수로 선언해야 함
    public void catchThrow() throws MyCheckedException {
        client.call();
    }
}
