package oop;

public class WrapperTest {
    public static void main(String[] args) {
        // wrapper 클래스 : Primitive Type 감싸주는 클래스
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.SIZE);

        int i1 = Integer.parseInt("100");
        int i2 = Integer.parseInt("200");
        System.out.printf("%s + %s = %d",i1, i2, i1+i2);
    }
}
