package oop;

public class Pa {
    public static void main(String[] args) {
        int[]intArr = {1,2,3,4,5};
        add(intArr, 10);
        printArray(intArr);
        String[] strs = {"홍길동", "홍길서","홍길남","홍길북"};
        changeName(strs);
        printArray(strs);
    }

    private static void printArray(int[] intArr) {
        for( int num : intArr ){
            System.out.printf(" %d |", num);
        }
    }
    private static void printArray(String[] strArr) {
        for( String str : strArr ){
            System.out.printf(" %s |", str);
        }
    }

    public static void changeName(String[] strs) {
        for( int i=0; i<strs.length; i++){
            strs[i] = "김"+strs[i].substring(1);
        }
    }

    private static void add(int[] intArr, int num) {
        for ( int n=0; n<intArr.length; n++ ) {
            intArr[n] += num;
        }
    }
}
