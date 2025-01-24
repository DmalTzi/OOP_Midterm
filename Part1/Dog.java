public class Dog {
    String name;
    int age;
    String quote;
    String ageName;

    Dog() {}

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Dog(String name, int age, String quote) {
        this.name = name;
        this.age = age;
        this.quote = quote;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    String getQuote() {
        return quote;
    }

    public String getAgeName() {
        return ageName;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setName(String name) {
        this.name = name;
    }

    void setQuote(String quote) {
        this.quote = quote;
    }

    public void setAgeName(String ageName) {
        this.ageName = ageName;
    }

    void sayQuote() {
        if (quote != null)
            System.out.println(quote);
        else
            System.out.println("I can't say");
    }

    @Override
    public String toString() {
        return String.format("My name is %s[%d, %s]", name, age, quote);
    }

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

        Dog c = new Dog();
        System.out.println(c);
    }
}