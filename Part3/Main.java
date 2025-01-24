import animal.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("======normal animal======");
        Animal a = new Animal("walk", 2);
        a.move();
        a.howManyLegIHave();
        System.out.println("======Dog======");
        Dog b = new Dog("walk", 4);
        b.move();
        b.howManyLegIHave();
        b.beg();
        b.run();
        System.out.println("======Bird======");
        Bird c = new Bird("fly", 2, 1);
        c.move();
        c.howManyLegIHave();
        c.fly();
    }
}
