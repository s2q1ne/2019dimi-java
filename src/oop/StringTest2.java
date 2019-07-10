package oop;

public class StringTest2 {
    public static void main(String[] args) {
//        String str = "KDMHS";
//        str+="2학년";
//        str+="4반";
//        str+="박태훈";//문자열을 4개 생성함
//        //StringBuilder, StringBuffer 방법 똑같음
//        StringBuilder sb= new StringBuilder("디미고").append("2학년 ").append("4반").append("박태훈");
//        System.out.println(sb);

        compareSpeed();
    }

    private static void compareSpeed() {

        String str = "abc";
        StringBuffer sb = new StringBuffer(str);
        StringBuilder sb2 = new StringBuilder(str);
        long start = System.currentTimeMillis();
        long end;

        for( int i=0 ; i<200000; i++ ){
            str += "def";
        }
        end= System.currentTimeMillis();
        System.out.println(end-start);

        start = System.currentTimeMillis();
        for( int i=0; i<200000; i++ ){
            sb.append("def");
        }
        end = System.currentTimeMillis();
        System.out.println(end-start);

        start = System.currentTimeMillis();
        for( int i=0; i<200000; i++ ){
            sb2.append("def");
        }
        end = System.currentTimeMillis();
        System.out.println(end-start);

    }


}
