package oop;

public class StringTest {
    public static void main(String[] args) {
        String id = "admin";

        if( id!=null && id.toLowerCase().equals("admin") ||
        id.equalsIgnoreCase("admin"))
            System.out.println("관리자");
        else
            System.out.println("관리자X");

        testString();
    }

    private static void testString() {
        String s = "abcdefg"+"ABCDEFG";
        System.out.println(s.length());
        System.out.println(s.substring(3));
        System.out.println(s.substring(3,6));
        System.out.println(s.indexOf("C"));
        System.out.println(s.charAt(9));
        System.out.println(s.concat("ho"));//뒤에 붙이기
        System.out.println(s.trim()); // 공백[스페이스] 제거
        System.out.println(s.toUpperCase());
        System.out.println(s.replace('a','b'));
        System.out.println(s.startsWith("a",0));
        System.out.println(s.endsWith("ba"));


    }
}
