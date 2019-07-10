package oop;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book().setAuthor("윤").setTitle("미생").setPage(1000);
        System.out.printf("%s %s %d\n", book.getTitle(), book.getAuthor(), book.getPage());
    }

    public String toString() {
        return "BookTest{}";
    }
}
