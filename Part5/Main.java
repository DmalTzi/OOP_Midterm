// Start Here


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

