package mainPackage.libraryPackage;

public class libraryTask {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("1984", "George Orwell", "Sci-fi", "1948");
        Book book2 = new Book("All quiet on the Western Front", "Erich Maria Remarque", "Roman", "1928");
        Book book3 = new Book("Animal farm", "George Orwell", "Satire", "1945");
        Book book4 = new Book("It", "Stephen King", "Horror", "1986");
        Book book5 = new Book("Man", "Olha Kobylianska", "Novella", "1886");

        library.add(book1.getBook());
        library.add(book2.getBook());
        library.add(book3.getBook());
        library.add(book4.getBook());
        library.add(book5.getBook());

        library.print();
        library.remove(2);

        library.find("It");
        library.find("novella");
        library.find("Sci-fI");
    }
}
