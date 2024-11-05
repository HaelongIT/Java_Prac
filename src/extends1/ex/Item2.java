package extends1.ex;

public class Item2 {
    private String name;
    private int price;

    public Item2(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void print() {
        System.out.println("이름 : " + name + ", 가격 : " + price);
    }

    public int getPrice() {
        return price;
    }
}
