package oop.ex;

public class Rectangle {
    // 데이터 : width, height
    int width;
    int height;

    // 생성자
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // 기능 : calculateArea(), calculatePerimeter(), isSpare()
    void calculateArea() {
        int area = width * height;
        System.out.println("넓이 : " + area);
    }

    void calculatePerimeter() {
        int perimeter = 2 * (width + height);
        System.out.println("둘레 길이 : " + perimeter);
    }

    void isSqare() {
        boolean sqare = (width == height);
        System.out.println("정사각형 여부 : " + sqare);
    }
}
