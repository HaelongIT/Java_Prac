package exception.ex4;

public class NetworkServiceV5 {

    public void sendMessage(String data) {
        String address = "http://exampel.com";

        // 네트 클라의 핵심 기능의 흐름을 제어 : 컨트롤러 역할
        try (NetworkClientV5 client = new NetworkClientV5(address)) {
            client.initError(data);     // 에러 시뮬레이션을 위해 추가
            client.connect();
            client.send(data);
        }
        catch (Exception e) {
            System.out.println("[예외 확인] : " + e.getMessage());
            throw e;
        }
    }
}
