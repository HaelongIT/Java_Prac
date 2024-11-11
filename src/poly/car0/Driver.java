package poly.car0;

// 클라 역할의 클래스
public class Driver {
    private K3Car k3Car;
    private Model3Car model3Car;

    // 서버 클래스의 인스턴스를 주입
    public void setK3Car(K3Car k3Car) {
        this.k3Car = k3Car;         // 의존성 주입(메서드 주입)
    }

    // K3와 Model3가 다형적 참조가 안돼서, 각자 의존성 주입
    public void setModel3Car(Model3Car model3Car) {
        this.model3Car = model3Car;
    }

    // dirve() 메서드는 클라에서 보내는 요청(서버로[K3Car])
    // 클라가 서버에 요청 보내면(k3Car의 메서드 호출)
    // 서버에서 데이터 처리를 하고(k3Car의 메서드 내부 로직으로)
    // 서버에서 리턴한걸 받음(제어권이 클라로 돌아오면서 반환됨)
    public void drive() {
        System.out.println("자동차를 운전합니다.");
        if (k3Car != null) {
            k3Car.startEngine();
            k3Car.pressAccelerator();
            k3Car.offEngine();
        }
        else if (model3Car != null) {
            model3Car.startEngine();
            model3Car.pressAccelerator();
            model3Car.offEngine();
        }
    }
}
