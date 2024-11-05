package extends1.ex;

public class Album2 extends Item2 {
    private String artist;

    public Album2(String name, int price, String artist) {
        super(name, price);
        this.artist = artist;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("- 아티스트 : " + artist);
    }
}
