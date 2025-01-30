package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐용이", 100);

        AnimalMethod.checkup(dog);
        AnimalMethod.checkup(cat);

        Dog target = new Dog("큰멍이", 300);
        Dog bigger = AnimalMethod.bigger(dog, target);
        System.out.println("bigger = " + bigger);
    }
}
