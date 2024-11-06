package poly.ex2;

public class AnimalPolyMain1 {
    public static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();                             // sound 메서드는 오버라이딩이기 때문에 다운캐스팅이 필요없음
        System.out.println("동물 소리 테스트 종료");
    }

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal cow = new Cow();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);
    }
}
