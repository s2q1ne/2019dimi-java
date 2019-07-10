package oop;

public class Book {
    private String title="미생";
    private String author="윤";
    private int page=200;



    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPage() {
        return page;
    }

    public Book setAuthor(String author) {
        this.author = author;
        return this;
    }

    public Book setPage(int page) {
        this.page = page;
        return this;
    }

    public static void compare() {
        int a = 10;
        int b = a;
        System.out.println(a==b);
        Book book = new Book();
        Book book2 = book;
        book.setTitle("수학의 바이블");
        System.out.println(book.getTitle());
        System.out.println(book2.getTitle());
    }

    public Book setTitle(String title) {
        this.title = title;
        return this;
    }
}
