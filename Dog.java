public class Dog {
    // Start here
    public static void main(String[] args) {
        Dog a = new Dog("a", 0);
        System.out.println(a);
        a.sayQuote();
        a.setQuote("Haha");
        a.sayQuote();
        System.out.println(a);
        Dog b = new Dog("b", 20, "Ryoikitenkai");
        System.out.println(b);
        b.sayQuote();
        b.setAge(2);
        System.out.println(b);
    }
}