package poly.ex6;

public class SoundFlyMain {
    public static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    public static void flyAnimal(Fly fly) {
        System.out.println("날기 테스트 시작");
        fly.fly();
        System.out.println("날기 테스트 종료");
    }

    public static void main(String[] args) {
        AbstractAnimal[] animals = {new Dog(), new Bird(), new Chicken()};
//         Fly[] flies = {new Bird(), new Chicken()};

        for (AbstractAnimal animal : animals) {
            soundAnimal(animal);
        }

//        for (Fly fly : flies) {
//            flyAnimal(fly);
//        }
        for (AbstractAnimal animal : animals) {
            if (animal instanceof Fly fly) {        // animal가 참조하는 인스턴스가 Fly보다 같거나 낮은 자료형이면 true
                flyAnimal(fly);                     // fly로 캐스팅 instaceof와 동시에 했으니, 곧바로 flyAnimal() 사용
            }
        }
    }
}
