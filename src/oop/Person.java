package oop;

public class Person {
    public static final String type = "포유류";
    private final String birthDate;
    private String name;

    public Person(String birthDate, String name) {
        this.birthDate = birthDate;
        this.name = name;
    }

    public String toString(){
        return String.format("Person{ type='%s', birthDate='%s', name='%s' }", type, birthDate, name);
    }

    public static void main(String[] args) {
        Person p1 = new Person( "20021208", "길동이");
        Person p2 = new Person("20020812", "이동길");

        System.out.println(p1);
        System.out.println(p2);
    }
}
