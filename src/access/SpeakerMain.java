package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker1 = new Speaker(90);
        speaker1.showVolume();

        speaker1.volumeUp();
        speaker1.showVolume();

        speaker1.volumeUp();
        speaker1.showVolume();

        // 필드에 직접 접근
        System.out.println("volume 필드 직접 접근 수정");
        // speaker1.volume = 200;           // 접근자를 private로 변경해서 접근 불가능
        speaker1.showVolume();

        // 스피커2가 최저 음량까지 도달했을 경우
        Speaker speaker2 = new Speaker(10);
        speaker2.showVolume();

        speaker2.volumeDown();
        speaker2.showVolume();

        speaker2.volumeDown();
        speaker2.showVolume();
    }
}
