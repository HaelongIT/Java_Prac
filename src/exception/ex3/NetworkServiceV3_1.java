package exception.ex3;

import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_1 {

    public void sendMessage(String data) {
        String address = "http://exampel.com";
        NetworkClientV3 client = new NetworkClientV3(address);

        client.initError(data);     // 에러 시뮬레이션을 위해 추가

        // 네트 클라의 핵심 기능의 흐름을 제어 : 컨트롤러 역할
        try {
            client.connect();
            client.send(data);
        }
        catch (ConnectExceptionV3 e) {
            System.out.println("[연결 오류] 주소 : " + e.getAddress() + ", 메시지 : " + e.getMessage());
        }
        catch (SendExceptionV3 e) {
            System.out.println("[전송 오류] 전송 데이터 : " + e.getSendData() + ", 메시지 : " + e.getMessage());
        } finally {
            client.disconnect();
        }
    }
}
