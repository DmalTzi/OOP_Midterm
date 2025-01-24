package packArmy;

import packInterface.*;

public class Medic extends Human implements Heal, Run, Giveup{
    public Medic(int hp) {
        super(hp);
    }

    @Override
    public void heal(int amount, Soldier p) {
        p.hp += amount;
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
        return "Medic " + hp;
    }

}
