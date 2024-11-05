package extends1.ex;

public class Book2 extends Item2 {
    private String author;
    private String isbn;

    public Book2(String name, int price, String author, String isbn) {
        super(name, price);
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("- 저자 : " + author + ", isbn : " + isbn);
    }
}
