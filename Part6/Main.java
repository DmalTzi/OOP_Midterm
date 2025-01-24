import packArmy.*;

public class Main {
    public static void main(String[] args) {
        Medic a = new Medic(10);

        System.out.println(a);
        a.run();
        a.giveup();
        System.err.println("================");

        Soldier b = new Soldier(9);
        System.out.println(b);
        a.heal(1, b);
        b.run();
        b.shoot();
        System.out.println(b);
    }
}
