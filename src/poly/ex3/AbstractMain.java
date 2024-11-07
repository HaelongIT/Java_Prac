package poly.ex3;

public class AbstractMain {
    public static void soundAnimal(AbstractAnimal abstractAnimal) {
        System.out.println("동물 소리 테스트 시작");
        abstractAnimal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        cat.move();
        cat.sound();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);
    }
}
