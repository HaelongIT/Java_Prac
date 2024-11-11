package poly.car0;

public class CarMain0 {
    public static void main(String[] args) {
        Driver driver = new Driver();
        K3Car k3Car = new K3Car();
        driver.setK3Car(k3Car);         // 의존성 주입
        driver.drive();                 // 서버에 요청(클라에서)

        Model3Car model3Car = new Model3Car();
        driver.setK3Car(null);          // K3Car 참조 제거(K3에서 내린다)
        driver.setModel3Car(model3Car); // 의존성 주입
        driver.drive();                 // 서버에 요청
    }
}
