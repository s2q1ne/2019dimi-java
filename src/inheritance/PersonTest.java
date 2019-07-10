package inheritance;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("Tom");
        Person person2 = new Korean("홍길동");
        Person person3 = new Japanese("다나카");
        Person person4 = new Chinese("왕밍");

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4); // 자동으로 toString 호출
        System.out.println();

        person1.sayHello();
        person2.sayHello();
        person3.sayHello();
        person4.sayHello();
        System.out.println();

        person1.sayBye();
        person2.sayBye();
        person3.sayBye();
        person4.sayBye();
    }
}

