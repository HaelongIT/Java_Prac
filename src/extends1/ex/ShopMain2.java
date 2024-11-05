package extends1.ex;

public class ShopMain2 {
    public static void main(String[] args) {
        Book2 book2 = new Book2("JAVA", 10000, "han", "12345");
        Album2 album2 = new Album2("앨범1", 15000, "seo");
        Movie2 movie2 = new Movie2("영화1", 18000, "감독1", "배우1");

        book2.print();
        album2.print();
        movie2.print();

        int sum2 = book2.getPrice() + album2.getPrice() + movie2.getPrice();
        System.out.println("상품 가격의 합 : " + sum2);
    }
}
