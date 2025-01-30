package generic.ex5;

import generic.animal.Animal;

public class WildcardEx {
    // 그냥 제네릭 메서드
    static <T> void printGenericV1(Box<T> box) {
        System.out.println("T = " + box.get());
    }

    // 와일드 카드1
    // Box<Dog>, Box<Cat>, Box<Object> 등 들어올 수 있음
    static void printWildcardV1(Box<?> box) {
        System.out.println("? = " + box.get());
    }

    // 상한이 걸린 제네릭 메서드
    static <T extends Animal> void printGenericV2(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
    }

    static void printWildcardV2(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
    }

    // 상한이 걸린 제네릭 메서드 + 반환 추가
    static <T extends Animal> T printAndReturnGeneric(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
        return t;
    }

    static Animal printAndReturnWildcard(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
        return animal;
    }
}
