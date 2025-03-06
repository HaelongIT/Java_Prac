package exception2;

import exception2.exception.ConnectException;
import exception2.exception.NetworkClientException;
import exception2.exception.SendException;

public class NetworkClient {
    private String address;
    private boolean connectError;
    private boolean sendError;

    public NetworkClient(String address) {
        this.address = address;
    }

    // TODO : 외부 서버와 연결하기
//    public String connect() {
//        if (connectError) {
//            System.out.println(address + " 서버 연결 실패");
//            return "connectError";
//        }
//        System.out.println(address + " 서버 연결 성공");
//        return "success";
//    }
//    public void connect() throws NetworkClientException {
//        if (connectError) {
//            throw new NetworkClientException("connectError", address +
//                    " 서버 연결 실패");
//        }
//        // 연결 성공
//        System.out.println(address + " 서버 연결 성공");
//    }
    public void connect() throws ConnectException {
        if (connectError) {
            throw new ConnectException(address, address + " 서버 연결 실패");
        }
        System.out.println(address + " 서버 연결 성공");
    }

    // TODO : 데이터 전송하기
//    public void send(String data) {
//        if (sendError) {
//            System.out.println(address + " 서버에 데이터 전송 실패");
//        }
//        System.out.println(address + " 서버에 데이터 전송 : " + data);
//    }
//    public void send(String data) throws NetworkClientException {
//        if (sendError) {
//            throw new NetworkClientException("sendError", address + " 서버에 데이터 전송 실패 : "
//                    + data);
//        }
//        // 전송 성공
//        System.out.println(address + " 서버에 데이터 전송 : " + data);
//    }
    public void send(String data) throws SendException {
        if (sendError) {
            throw new SendException(data, address + " 서버에 데이터 전송 실패 : "
            + data);
        }
        System.out.println(address + " 서버에 데이터 전송 : " + data);
    }

    // TODO : 외부 서버와 연결 종료하기
//    public String disconnect() {
//        System.out.println(address + " 서버 연결 해제");
//        return "success";
//    }
    public void disconnect() {
        System.out.println(address + " 서버 연결 해제");
    }

    public void initError(String data) {
        if (data.contains("error1")) {
            connectError = true;
        }
        if (data.contains("error2")) {
            sendError = true;
        }
    }
}
