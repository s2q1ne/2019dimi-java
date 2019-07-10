package inheritance;

public class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("저는 %s입니다.", name);
    }

    public void sayHello(){
        System.out.println("Hello");
    }

    public void sayBye(){
        System.out.println("Bye");
    }
}
