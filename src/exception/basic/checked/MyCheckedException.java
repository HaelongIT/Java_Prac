package exception.basic.checked;

// Exception을 상속받은 예외는 체크 예외가 된다

public class MyCheckedException extends Exception {
    public MyCheckedException(String message) {
        super(message);     // 오류 메세지를 받아서 부모에 보관
    }
}
