package access.ex;

public class Item {
    private String name;
    private int price;
    private int quantity;

    // 생성자
    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // 전체 출력
    int showItem() {
        int sumPrice = (price * quantity);
        System.out.println("상품명 : " + name + ", 합계 : " + sumPrice);
        return sumPrice;
    }
}
