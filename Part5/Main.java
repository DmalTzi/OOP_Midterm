package Part5;

abstract class People {
    abstract public void sayHi();
    abstract public void eatingWith();
}

class Thai extends People {

    public int meridLevel = 5;

    @Override
    public void sayHi() {
        System.out.println("Sawadee kub pri");
    }

    @Override
    public void eatingWith() {
        System.out.println("I eat rice by my hand");
    }

    public void attack() {
        System.out.println("Attack Police!!");
        System.out.println("meridLevel -1");
        meridLevel--;
    }

    @Override
    public String toString() {
        return "Thai meridLevel " + meridLevel;
    }
}

class Japaness extends People {
    @Override
    public void sayHi() {
        System.out.println("Konichiwa");
    }

    @Override
    public void eatingWith() {
        System.out.println("watashi eat rice with chopstick desu");
    }
}

class American extends People {
    public int falthLevel = 10;

    @Override
    public void sayHi() {
        System.out.println("Hello nice to meet you");
    }

    @Override
    public void eatingWith() {
        System.out.println("I eat with fork and knift");
    }

    public void cook() {
        System.out.println("Cook padthai with pasta");
    }

    @Override
    public String toString() {
        return "American falthLevel " + falthLevel;
    }
}

public class Main {
    public static void main(String[] args) {
        // Can't do this
        // People people = new People();

        Thai audy = new Thai();
        American em = new American();
        Japaness indy = new Japaness();

        System.out.println(audy);
        audy.sayHi();
        audy.eatingWith();
        audy.attack();
        System.out.println(audy.meridLevel);

        System.out.println(em);
        em.sayHi();
        em.eatingWith();

        System.out.println(indy);
        indy.sayHi();
        indy.eatingWith();
    }
}
