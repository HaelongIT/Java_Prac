package oop1;

public class MusicPlayerDataMy {
    int volume;
    boolean isOn;

    // 생성자
    // 만들고 나니까 딱히 필요없는거 같지만 그래도 생성자 한번 만들어보고 싶었음
//    public MusicPlayerData(boolean isOn, int volume) {
//        this.volume = volume;
//        this.isOn = isOn;
//    }

    // 뮤직 플레이어 온/오프
    public void playerOnOff(MusicPlayerDataMy data) {
        data.volume = 0;
        if (data.isOn == true) {
            data.isOn = false;
            System.out.println("음악 플레이어를 종료합니다.");
        }
        else {
            data.isOn = true;
            System.out.println("음악 플레이어를 시작합니다.");
        }
    }

    public void playerStatus(MusicPlayerDataMy data) {
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨 : " + data.volume);
        }
        else {
            System.out.println("음악 플레이어 OFF");
        }
    }

    // 볼륨 업
    public void volumeUp(MusicPlayerDataMy data) {
        data.volume++;
        System.out.println("음악 플레이어 볼륨 : " + volume);
    }

    // 볼륨 다운
    public void volumeDown(MusicPlayerDataMy data) {
        data.volume--;
        System.out.println("음악 플레이어 볼륨 : " + volume);
    }
}
