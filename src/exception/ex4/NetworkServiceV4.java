package exception.ex4;

public class NetworkServiceV4 {

    public void sendMessage(String data) {
        String address = "http://exampel.com";
        NetworkClientV4 client = new NetworkClientV4(address);

        client.initError(data);     // 에러 시뮬레이션을 위해 추가

        // 네트 클라의 핵심 기능의 흐름을 제어 : 컨트롤러 역할
        try {
            client.connect();
            client.send(data);
        }
        finally {
            client.disconnect();
        }
    }
}
