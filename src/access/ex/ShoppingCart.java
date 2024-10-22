package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount = 0;

    // addItem
    public void addItem(Item item) {
        // 반복문으로 앞에서부터 돌면서 빈곳 확인하고 넣거나, 10개 초과면 문장 출력
//        for (int i = 0; items.length < 10; i++) {
//            if (items[i] == null) {
//                items[i] = item;
//                return;
//            }
//            else if (i == 9) {
//                System.out.println("장바구니가 가득 찼습니다");
//            }
//        }

        if (itemCount == 10) {
            System.out.println("장바구니가 가득 찼습니다");
            return;
        }
        else {
            items[itemCount] = item;
            itemCount++;
        }
    }

    // displayItems
    public void displayItems() {
//        System.out.println("장바구니 상품 출력");
//        // 반복문으로 특정 출력으로 items에 있는 얘들 출력
//        for (int i = 0; items.length < 10; i++) {
//            if (items[i] == null) {
//                return;
//            }
//            else {
//                items[i].showItem();
//            }
//        }
//        // 앞에 items들 합 구하기
//        System.out.println("전체 가격 합 : ");

        int sumPrice = 0;
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < itemCount; i++) {
            sumPrice += items[i].showItem();
        }
        System.out.println("전체 가격 합 : " + sumPrice);
    }
}
