package exception.ex1;

public class NetworkServiceV1_1 {

    public void sendMessage(String data) {
        String address = "http://exampel.com";
        NetworkClientV1 client = new NetworkClientV1(address);

        client.initError(data);     // 에러 시뮬레이션을 위해 추가

        // 네트 클라의 핵심 기능의 흐름을 제어 : 컨트롤러 역할
        client.connect();
        client.send(data);
        client.disconnect();
    }
}
