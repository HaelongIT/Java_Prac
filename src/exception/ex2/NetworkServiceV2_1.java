package exception.ex2;

public class NetworkServiceV2_1 {

    public void sendMessage(String data) throws NetworkClientExceptionV2 {
        String address = "http://exampel.com";
        NetworkClientV2 client = new NetworkClientV2(address);

        client.initError(data);     // 에러 시뮬레이션을 위해 추가

        // 네트 클라의 핵심 기능의 흐름을 제어 : 컨트롤러 역할
        client.connect();
        client.send(data);
        client.disconnect();
    }
}
