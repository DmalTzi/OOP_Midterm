public class Car {
    public String brand;
    public Engine engine;
    public int year;

    public class Engine {
        private int fuel;
        private boolean start = false;

        protected void start() {
            if (fuel <= 0) {
                System.out.println("Not have fuel can't start");
                return;
            }
            start = true;
        }

        protected void refill(int fuel) {
            this.fuel += fuel;
        }
    }


    Car() {
        engine = new Engine();
    }

    public void showInfo() {
        System.out.println("Fuel Level " + engine.fuel);
        if (engine.start) {
            System.out.println("Engine is on");
        }else {
            System.out.println("Engine is off");
        }
    }

    public void start() {
        if (!engine.start) {
            System.out.println("Oh engine isn't start, I will start it and try again");
            engine.start();
        }else {
            System.out.println("Car has started");
        }
    }
}
