package generic.ex2;

// 다양한 동물을 보관하는 박스
public class Box<T> {

    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
