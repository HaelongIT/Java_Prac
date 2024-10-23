package access.ex;

public class ShoppingCartMain2 {
    public static void main(String[] args) {
        ShoppingCart2 cart = new ShoppingCart2();

        Item2 item1 = new Item2("마늘", 2000, 2);
        Item2 item2 = new Item2("상추", 3000, 4);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.displayItems();
    }
}
