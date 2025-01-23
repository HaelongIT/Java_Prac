package exception.ex3;

import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.NetworkClientExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_2 {

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
        catch (NetworkClientExceptionV3 e) {
            System.out.println("[네트워크 오류] 메시지 : " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("[알 수 없는 오류] 메시지 : " + e.getMessage());
        }
        finally {
            client.disconnect();
        }
    }
}
