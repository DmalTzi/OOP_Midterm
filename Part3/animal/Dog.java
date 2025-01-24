package animal;

public class Dog extends Animal{
    public Dog(String moveBy, int leg) {
        super(moveBy, leg);
    }

    public void run() {
        super.move();
        System.out.println("But faster");
    }

    public void beg() {
        System.out.println("Cuteeeeeeeee beammmmmmmm");
    }
}