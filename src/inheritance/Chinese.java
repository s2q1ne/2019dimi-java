package inheritance;

public class Chinese extends Person{

    public Chinese(String name) {
        super(name);
    }
    @Override
    public void sayHello(){
        System.out.println("니하오");
    }
    @Override
    public void sayBye(){
        System.out.println("쨔이찌엔");
    }

    @Override
    public String toString() {
        return String.format("저는 중국사람 %s입니다.", getName());
    }
}
