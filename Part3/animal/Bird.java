package animal;

public class Bird extends Animal{
    protected int wing;

    public Bird(String moveBy, int leg, int wing) {
        super.moveBy = moveBy;
        super.leg = leg;
        this.wing = wing;
    }

    public void fly() {
        System.out.println("I'm F-15");
    }
}
