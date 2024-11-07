package poly.ex4;

public class AbstractMain {
    // 동물이 추가돼도 변하지 않는 코드
    public static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    // 동물이 추가돼도 변하지 않는 코드
    public static void moveAnimal(AbstractAnimal animal) {
        System.out.println("동물 이동 테스트 시작");
        animal.move();
        System.out.println("동물 이동 테스트 종료");
    }

    public static void main(String[] args) {
        AbstractAnimal[] animals = {new Dog(), new Cat(), new Cow()};

        for (AbstractAnimal animal : animals) {
            soundAnimal(animal);
        }

        for (AbstractAnimal animal : animals) {
            moveAnimal(animal);
        }
    }
}
