package access;

public class Speaker {
    private int volume;

    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if(volume >= 100) {
            System.out.println("최대 음향");
        }
        else {
            volume += 10;
            System.out.println("음향을 10 증가합니다.");
        }
    }

    void volumeDown() {
        if(volume <= 0) {
            System.out.println("최저 음향");
        }
        else {
            volume -= 10;
            System.out.println("volumeDown 호출");
        }
    }

    void showVolume() {
        System.out.println("현재 음량 : " + volume);
    }
}
