package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder productOrder1;
        ProductOrder productOrder2;
        ProductOrder productOrder3;

        productOrder1 = createOrder("두부", 2000, 2);
        productOrder2 = createOrder("김치", 5000, 1);
        productOrder3 = createOrder("콜라", 1500, 2);

        ProductOrder[] productOrders = {productOrder1, productOrder2, productOrder3};

        printOrders(productOrders);

        System.out.println("총 결제 금액 : " + getTotalAmount(productOrders));
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;

        return productOrder;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명 : " + order.productName + ", 가격 : " + order.price
                    + ", 수량 : " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int sumPrice = 0;
        for (ProductOrder order : orders) {
            sumPrice += order.price * order.quantity;
        }
        return sumPrice;
    }
}
