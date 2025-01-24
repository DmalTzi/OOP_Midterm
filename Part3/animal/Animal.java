package animal;

public class Animal {
    protected String moveBy;
    protected int leg;

    public Animal(){}

    public Animal(String moveBy, int leg) {
        this.moveBy = moveBy;
        this.leg = leg;
    }

    public void move() {
        System.out.println("Move by " + moveBy);
    }

    public void howManyLegIHave() {
        System.out.println("I have "+ leg );
    }
}