package mainPackage.libraryPackage;

public class Book {

    public String[] getBook() {
        return book;
    }

    private String name;

    private String author;

    private String genre;

    private String year;
    private String[] book;

    Book(String name, String author, String genre, String year) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.year = year;
        this.book = new String[]{name, author, genre, year};
    }
}