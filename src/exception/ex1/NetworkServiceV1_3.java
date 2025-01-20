package exception.ex1;

public class NetworkServiceV1_3 {

    public void sendMessage(String data) {
        String address = "http://exampel.com";
        NetworkClientV1 client = new NetworkClientV1(address);

        client.initError(data);     // 에러 시뮬레이션을 위해 추가

        // 네트 클라의 핵심 기능의 흐름을 제어 : 컨트롤러 역할
        String connectResult = client.connect();
        // 결과가 성공이 아니다 -> 오류다 로 변경하자(부정은 이해하기 힘듦)
        if (isError(connectResult)) {     // 연결 실패일 경우
            System.out.println("[네트워크 오류 발생] 오류 코드 : " +
                    connectResult);
        }
        else {
            String sendResult = client.send(data);
            if (isError(sendResult)) {        // 전송 실패일 경우
                System.out.println("[네트워크 오류 발생] 오류 코드 : " +
                        sendResult);
            }
        }

        client.disconnect();
    }

    // 적절하게 메서드로 빼놓은 예시
    // 결과가 성공이 아니다 -> 오류다 로 적절히 변경함
    // 적절한 메서드명을 이용해서 가독성을 높임
    private static boolean isError(String connectResult) {
        return !connectResult.equals("success");
    }
}
