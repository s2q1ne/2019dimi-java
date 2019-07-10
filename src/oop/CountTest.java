package oop;

public class CountTest {
    private static int cnt;
    CountTest(){
        cnt++;
    }

    public static int getCnt() {
        return cnt;
    }

    public static void main(String[] args) {
        for( int i=0; i<9; i++) new CountTest();
        System.out.println(getCnt());
    }
}
