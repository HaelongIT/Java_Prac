package extends1.ex;

public class Movie2 extends Item2 {
    private String director;
    private String actor;

    public Movie2(String name, int price, String director, String actor) {
        super(name, price);
        this.director = director;
        this.actor = actor;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("- 감독 : " + director + ", 배우 : " + actor);
    }
}
