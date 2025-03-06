package exception2;

import exception2.exception.ConnectException;
import exception2.exception.NetworkClientException;
import exception2.exception.SendException;

public class NetworkService {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClient client = new NetworkClient(address);

        client.initError(data);

        try {
            client.connect();
            client.send(data);
        }
        catch (ConnectException e) {
            System.out.println("[연결 오류] 주소 : " + e.getAddress() +
                    ", 메시지 : " + e.getMessage());
        }
        catch (SendException e) {
            System.out.println("[전송 오류] 전송 데이터 : " + e.getSendData() +
                    ", 메시지 : " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("[알 수 없는 오류] 메시지 : " + e.getMessage());
        }
        finally {
            client.disconnect();
        }
    }

    private static boolean isError(String resultCode) {
        return !resultCode.equals("success");
    }
}
