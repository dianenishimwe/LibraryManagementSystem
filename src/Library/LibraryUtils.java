package Library;

import java.util.List;

public class LibraryUtils {

    public static void printBooks(List<? extends Book> books) {

        for (Book book : books) {
            System.out.println(book);
        }
    }

    public static void addBook(List<? super Book> books, Book book) {

        books.add(book);
    }

    public static void printBookTitle(Book book) {

        System.out.println("Book title: " + book.getTitle());
    }
}