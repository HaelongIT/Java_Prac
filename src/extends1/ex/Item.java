package extends1.ex;

public class Item {
    protected String name;
    protected int price;

    public void print() {
        System.out.println("이름 : " + this.name + ", 가격 : " + this.price);
    }

    public int getPrice() {
        return this.price;
    }
}
