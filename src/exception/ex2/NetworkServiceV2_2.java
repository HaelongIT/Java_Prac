package exception.ex2;

public class NetworkServiceV2_2 {

    public void sendMessage(String data) {
        String address = "http://exampel.com";
        NetworkClientV2 client = new NetworkClientV2(address);

        client.initError(data);     // 에러 시뮬레이션을 위해 추가

        // 네트 클라의 핵심 기능의 흐름을 제어 : 컨트롤러 역할
        try {
            client.connect();
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드 : " + e.getErrorCode() + ", 메세지 : " +
                    e.getMessage());
            return;
        }

        try {
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드 : " + e.getErrorCode() + ", 메세지 : " +
                    e.getMessage());
            return;
        }

        client.disconnect();
    }
}
