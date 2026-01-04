package ex2;

public class Person {
    private int id;
    private String name;
    private Address address;

    public Person(String name) {
        this.name = name;
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
