import Library.Book;
import Library.BookOperation;
import Library.LibraryUtils;
import Library.LibrarianMember;
import Library.Member;
import Library.PublisherMember;
import Library.StudentMember;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        // 1. CREATE MEMBERS

        StudentMember studentMember =
                new StudentMember(
                        "stm001",
                        "diane",
                        "diane@gmail.com",
                        "kigali"
                );

        PublisherMember publisherMember =
                new PublisherMember(
                        "p001",
                        "didi",
                        "dd@gmail.com",
                        "kk"
                );

        LibrarianMember librarianMember =
                new LibrarianMember(
                        "lb44",
                        "losine",
                        "lo@gmail.com",
                        "ngororero"
                );

        // 2. POLYMORPHISM

        System.out.println("Studentmember late fee: "
                + studentMember.calculateLateFees(3));

        System.out.println("Publishermember late fee: "
                + publisherMember.calculateLateFees(3));

        System.out.println("Librarianmember late fee: "
                + librarianMember.calculateLateFees(3));

        // 3. LIST - STORE MEMBERS

        List<Member> members = new ArrayList<>();

        members.add(studentMember);
        members.add(publisherMember);
        members.add(librarianMember);

        System.out.println("\nList of Members:");

        for (Member member : members) {
            System.out.println(member);
        }

        // 4. CREATE BOOKS

        Book book1 = new Book(
                "B001",
                "Java Book",
                "Java Programming",
                "JOVIA",
                "ISBN001",
                true
        );

        Book book2 = new Book(
                "B002",
                "HTML",
                "HTML",
                "Gayera",
                "ISBN002",
                true
        );

        Book book3 = new Book(
                "B003",
                "Database Book",
                "Database Systems",
                "Uwase",
                "ISBN003",
                true
        );

        // 5. SET - STORE BORROWED BOOKS

        Set<Book> borrowedBooks = new HashSet<>();

        if (book1.isAvailability()) {
            book1.setAvailability(false);
            borrowedBooks.add(book1);
        }

        if (book2.isAvailability()) {
            book2.setAvailability(false);
            borrowedBooks.add(book2);
        }

        System.out.println("\nBorrowed Books:");

        for (Book book : borrowedBooks) {
            System.out.println(book);
        }

        // 6. MAP - MEMBER ACCOUNTS

        Map<String, Member> memberAccounts = new HashMap<>();

        memberAccounts.put(
                studentMember.getMemberId(),
                studentMember
        );

        memberAccounts.put(
                publisherMember.getMemberId(),
                publisherMember
        );

        memberAccounts.put(
                librarianMember.getMemberId(),
                librarianMember
        );

        Member foundMember = memberAccounts.get("stm001");

        System.out.println("\nMember Account:");

        if (foundMember != null) {
            System.out.println(foundMember);
        }

        // 7. MAP + SET
        // MEMBER → BORROWED BOOKS

        Map<Member, Set<Book>> borrowedBooksByMember =
                new HashMap<>();

        Set<Book> studentBooks = new HashSet<>();

        studentBooks.add(book1);
        studentBooks.add(book2);

        borrowedBooksByMember.put(
                studentMember,
                studentBooks
        );

        System.out.println("\nBooks borrowed by "
                + studentMember.getMemberName() + ":");

        for (Book book :
                borrowedBooksByMember.get(studentMember)) {

            System.out.println(book);
        }

        // 8. FUNCTIONAL INTERFACE + LAMBDA

        BookOperation operation = book ->
                System.out.println(
                        "Book title: " + book.getTitle()
                );

        System.out.println("\nFunctional Interface + Lambda:");

        operation.perform(book1);

        // 9. METHOD REFERENCE

        BookOperation methodReference =
                LibraryUtils::printBookTitle;

        System.out.println("\nMethod Reference:");

        methodReference.perform(book1);

        // 10. CREATE BOOK LIST

        List<Book> books = new ArrayList<>();

        books.add(book1);
        books.add(book2);
        books.add(book3);

        // 11. STREAM API - FILTER

        System.out.println("\nAvailable Books:");

        books.stream()
                .filter(Book::isAvailability)
                .forEach(System.out::println);
        // 12. STREAM API - MAP

        System.out.println("\nBook Titles:");

        books.stream()
                .map(Book::getTitle)
                .forEach(System.out::println);
        // 13. STREAM API - SORTED

        System.out.println("\nSorted Book Titles:");

        books.stream()
                .map(Book::getTitle)
                .sorted()
                .forEach(System.out::println);
        // 14. STREAM API - COLLECT

        List<String> sortedBookTitles =
                books.stream()
                        .map(Book::getTitle)
                        .sorted()
                        .collect(java.util.stream.Collectors.toList());

        System.out.println("\nCollected Sorted Book Titles:");

        for (String title : sortedBookTitles) {
            System.out.println(title);
        }
    }
}