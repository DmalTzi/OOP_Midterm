public class Main {
    public static void main(String[] args) {
        Dog a = new Dog("a", 0);
        a.setName("goosedog");
        a.setQuote("Haha");
        System.out.println(a.getName());
        System.out.println(a.getQuote());
        System.out.println(a);
        System.out.println();
        Dog b = new Dog("b", 20, "Ryoikitenkai");
        System.out.println(b);
        b.sayQuote();
        System.out.println(b.getQuote());
        b.setAge(2);
        System.out.println(b);
    }
}