package packArmy;

import packInterface.*;

public class Soldier extends Human implements Shoot,Run, Giveup {
    public Soldier(int hp) {
        super(hp);
    }

    @Override
    public void shoot() {
        System.out.println("Piw Piw");
    }

    @Override
    public void run() {
        System.out.println("Runnnnnnnnn Ahhhhh!");
    }

    @Override
    public void giveup() {
        System.out.println("Give up!");
    }

    @Override
    public String toString() {
        return "Soldier " + hp;
    }
}
