package poly.car1;

public class Driver {

    private Car car;

    // 의존성 주입
    public void setCar(Car car) {
        System.out.println("자동차를 설정합니다 : " + car);
        this.car = car;
    }

    // 서버에 요청
    public void drive() {
        System.out.println("자동차를 운전합니다.");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }
}
