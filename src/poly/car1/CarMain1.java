package poly.car1;

public class CarMain1 {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Car k3Car = new K3Car();
        driver.setCar(k3Car);           // 의존성 주입
        driver.drive();                 // 서버에 요청

        Car model3Car = new Model3Car();    // 서버 인스턴스 변경
        driver.setCar(model3Car);
        driver.drive();
    }
}
