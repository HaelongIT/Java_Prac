package access.ex;

public class ShoppingCart2 {
    private Item2[] items = new Item2[10];
    private int itemCount;

    // addItem 메서드(매개변수 : Item2, 출력 : 프린트문)
    public void addItem(Item2 item) {
        // 조건문으로 10이하 일때만 추가하고, 넘어가면 초과했다고 print하고 멈추기
        if (itemCount < 10) {
            items[itemCount] = item;
            itemCount++;
        }
        else {
            System.out.println("장바구니가 가득 찼습니다");
        }
    }

    // display 메서드(매개변수 : 없음, 출력 : 프린트문)
    public void displayItems() {
        // 기능1 : 각각의 item2들을 설명해주기
            // 각 item2의 이름이나 합계금액을 접근할 수없어서 item2의 메서드로 만들어야됨
        // 기능2 : 전체 가격을 구해서 총합을 알려주기
        // 반복문으로 0번부터 최대 9번까지 있는 만큼 돌려서 총합구하기
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < itemCount; i++) {
            items[i].showItem();
        }

        allSumPrice();
    }

    private void allSumPrice() {
        int sum = 0;
        for (int i = 0; i < itemCount; i++) {
            sum += items[i].sumPrice();
        }
        System.out.println("전체 가격 합 : " + sum);
    }
}
