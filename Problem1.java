class LibraryBook {
    private String bookTitle = "Unknown";
    private String author = "Unknown";
    private int pages = 1;

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if(pages>0) this.pages = pages;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isThick(){
        return pages > 500;
    }
}

public class Problem1 {
    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook();
        book1.setBookTitle("Book 1");
        book1.setAuthor("Author 1");
        book1.setPages(100);

        LibraryBook book2 = new LibraryBook();
        book2.setPages(-100);
        System.out.printf("Book 1 has %d pages%n", book1.getPages());
        System.out.printf("Book 2 has %d pages%n", book2.getPages());
    }
}