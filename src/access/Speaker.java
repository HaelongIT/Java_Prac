package access;

public class Speaker {
    private int volume;

    public Speaker(int volume) {
        this.volume = volume;
    }

    public void volumeUp() {
        if(volume >= 100) {
            System.out.println("최대 음향");
        }
        else {
            volume += 10;
            System.out.println("음향을 10 증가합니다.");
        }
    }

    public void volumeDown() {
        if(volume <= 0) {
            System.out.println("최저 음향");
        }
        else {
            volume -= 10;
            System.out.println("volumeDown 호출");
        }
    }

    public void showVolume() {
        System.out.println("현재 음량 : " + volume);
    }
}
