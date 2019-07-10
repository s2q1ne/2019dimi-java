package oop;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = null;
        arr = new int[5];

        printArray(arr);

        double[] darr = new double[5];
        printArray(darr);


        Book[] books = new Book[2];
//        books[0] = new Book("수학의 바이블", "김재영", 200);
//        books[1] = new Book("워드마스터", "전유원", 300);
    }

    private static void printArray(Book[] arr) {
        for( Book value : arr ){
            System.out.println(
                    new StringBuilder()
                    .append(value.getTitle())
                    .append(value.getAuthor())
                    .append(value.getPage())
            );
        }
    }

    private static void printArray(double[] arr) {
        for( double value : arr ){
            System.out.println(value);
        }
    }

    private static void printArray(int[] arr) {
        for( int value : arr ){
            System.out.println(value);
        }
    }
}
