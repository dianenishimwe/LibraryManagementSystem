import Library.Book;
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

        System.out.println("Librarianmember  late fee: "
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

        // Student borrows book1
        if (book1.isAvailability()) {
            book1.setAvailability(false);
            borrowedBooks.add(book1);
        }

        // Student borrows book2
        if (book2.isAvailability()) {
            book2.setAvailability(false);
            borrowedBooks.add(book2);
        }


        // Display borrowed books
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


        // Find a member using ID
        Member foundMember = memberAccounts.get("stm001");

        System.out.println("\nMember Account:");

        if (foundMember != null) {
            System.out.println(foundMember);
        }



        // 7. MAP + SET
        // MEMBER → BORROWED BOOKS

        Map<Member, Set<Book>> borrowedBooksByMember = new HashMap<>();

        Set<Book> studentBooks = new HashSet<>();

        studentBooks.add(book1);
        studentBooks.add(book2);

        borrowedBooksByMember.put(
                studentMember,
                studentBooks
        );


        // Display books borrowed by student
        System.out.println("\nBooks borrowed by "
                + studentMember.getMemberName() + ":");

        for (Book book :
                borrowedBooksByMember.get(studentMember)) {

            System.out.println(book);
        }
    }
}