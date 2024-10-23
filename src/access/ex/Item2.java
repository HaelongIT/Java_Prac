package access.ex;

public class Item2 {
    private String name;
    private int price;
    private  int quantity;

    // 생성자
    public Item2(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // showItem 메서드 : 각 아이템들의 정보를 출력하는 메서드(캡슐화 때문에 여기서 해결해야됨)
    public void showItem() {
        System.out.println("상품명 : " + name + ", 합계 : " + (price * quantity));
    }

    // sumPrice 메서드 : 각 아이템의 총합을 리턴
    public int sumPrice() {
        return (price * quantity);
    }
}
