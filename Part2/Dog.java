public class Dog {
    private String name;
    private int age;
    private String quote;
    private String ageName;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(String name, int age, String quote) {
        this.name = name;
        this.age = age;
        this.quote = quote;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getQuote() {
        return quote;
    }

    public String getAgeName() {
        return ageName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public void setAgeName(String ageName) {
        this.ageName = ageName;
    }

    public void sayQuote() {
        if (quote != null)
            System.out.println(quote);
        else
            System.out.println("I can't say");
    }

    @Override
    public String toString() {
        return String.format("My name is %s[%d, %s]", name, age, quote);
    }

}