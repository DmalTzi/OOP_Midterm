public class Main {
    public static void main(String[] args) {
        Dog a = new Dog("a", 0);
        a.name = "goosedog";
        a.setQuote("Haha");
        System.out.println(a.name);
        System.out.println(a.quote);
        System.out.println(a);
        System.out.println();
        Dog b = new Dog("b", 20, "Ryoikitenkai");
        System.out.println(b);
        b.sayQuote();
        System.out.println(b.quote);
        b.age = 2;
        System.out.println(b);
    }
}