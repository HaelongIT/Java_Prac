package poly.ex3;

public abstract class AbstractAnimal {
    public abstract void sound();               // 추상 메서드로 정의(자식에서 오버라이딩으로 구현)

    public void move() {
        System.out.println("동물이 움직입니다.");   // 일반 메서드로 정의(이미 기능이 구현돼있음)
    }
}
