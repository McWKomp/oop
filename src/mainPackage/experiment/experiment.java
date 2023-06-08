package mainPackage.experiment;

import java.util.ArrayList;


public class experiment {
    public static void main(String[] args) {

        ArrayOfBooks booksNameArray = new ArrayOfBooks();
        ArrayOfBooks booksYearArray = new ArrayOfBooks();
        ArrayOfBooks booksGenreArray = new ArrayOfBooks();
        ArrayOfBooks booksAuthorArray = new ArrayOfBooks();

        Book book = new Book();
        book.name = "Strange murderings in Velykyj Dalnyk";
        book.author = "Agata Christie";
        book.genre = "detective";
        book.year = "1948";
        book.bookInfo = new String[]{book.name, book.author, book.genre, book.year};

        Book book1 = new Book();
        book1.name = "Strange murderings in Odesa";
        book1.author = "Agata Christie";
        book1.genre = "detective";
        book1.year = "1988";
        book1.bookInfo = new String[]{book1.name, book1.author, book1.genre, book1.year};

        booksNameArray.addBook(book.name);
        booksNameArray.addBook(book1.name);
        booksNameArray.delBook(book.name);
        booksNameArray.findBook("Strange murderings in Odesa");
    }
}

class Book {
    String name;
    String author;
    String genre;
    String year;
    String[] bookInfo;
}

class ArrayOfBooks extends Book{
    ArrayList<String> bookList = new ArrayList<>();
    public void findBook(String looked) {
        if(bookList.contains(looked)){
            System.out.println("Book has been found successfully by search "+'"'+looked+'"');
        } else{
            System.out.println("Book hasn't been found");
        }
    }

    public void addBook(String bookName){
        bookList.add(bookName);
        System.out.println("Book "+'"'+bookName+'"'+" has been added");
    }

    public void delBook(String bookName){
        bookList.remove(bookName);
        System.out.println("Book "+'"'+bookName+'"'+" has been removed");
    }

}