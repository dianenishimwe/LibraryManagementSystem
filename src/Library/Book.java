package Library;

public class Book {
    private  String bookId;
    private String bookName;
    private String Title;
    private String Author;
    private String Isbn;
    private boolean Availability;
//construtor

    public Book(String bookId, String bookName, String title, String author, String isbn, boolean availability) {
        this.bookId = bookId;
        this.bookName = bookName;
        Title = title;
        Author = author;
        Isbn = isbn;
        Availability = availability;
    }
    //getter and setter

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getIsbn() {
        return Isbn;
    }

    public void setIsbn(String isbn) {
        Isbn = isbn;
    }

    public boolean isAvailability() {
        return Availability;
    }

    public void setAvailability(boolean availability) {
        Availability = availability;
    }
    //Tostring

    @Override
    public String toString() {
        return "Book{" +
                "bookId='" + bookId + '\'' +
                ", bookName='" + bookName + '\'' +
                ", Title='" + Title + '\'' +
                ", Author='" + Author + '\'' +
                ", Isbn='" + Isbn + '\'' +
                ", Availability=" + Availability +
                '}';
    }
}
