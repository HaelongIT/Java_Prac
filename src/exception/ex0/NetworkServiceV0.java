package exception.ex0;

public class NetworkServiceV0 {

    public void sendMessage(String data) {
        String address = "http://exampel.com";
        NetworkClientV0 client = new NetworkClientV0(address);

        // 네트 클라의 핵심 기능의 흐름을 제어 : 컨트롤러 역할
        client.connect();
        client.send(data);
        client.disconnect();
    }
}
