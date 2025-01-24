public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        car.showInfo();
        car.start();
        car.engine.refill(10);
        car.start();
        car.start();
        car.showInfo();
    }
}
