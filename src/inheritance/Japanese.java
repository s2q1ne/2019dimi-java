package inheritance;

public class Japanese extends Person{

    public Japanese(String name) {
        super(name);
    }
    @Override
    public void sayHello(){
        System.out.println("오하이요");
    }

    @Override
    public void sayBye(){
        System.out.println("사요나라");
    }

    @Override
    public String toString() {
        return String.format("저는 일본사람 %s입니다.", getName());
    }
}
