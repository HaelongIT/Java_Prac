package static2.ex;

public class Car {
    private String modelName;
    private static int carCount;

    public Car(String modelName) {
        this.modelName = modelName;
        carCount++;
        System.out.println("차량 구입, 이름 : " + this.modelName);
    }

    public static void showTotalCars() {
        System.out.println("구매한 차량 수 : " + carCount);
    }
}
