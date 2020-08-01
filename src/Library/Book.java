package Library;

public class Book extends Item {
    // Data field
    private long ISBN;
    // Constructor
    Book(String title, String author, String edition, String publication, int year, String language, long ISBN, String subject, String status, int copy ) {
        this.title = title;
        this.author = author;
        this.edition = edition;
        this.publication = publication;
        this.year = year;
        this.language = language;
        this.ISBN = ISBN;
        this.subject = subject;
        this.status = status;
        this.copy = copy;
    }
    // Get & Set
    public long getISBN() { return ISBN; }
    public void setISBN(long ISBN) { this.ISBN = ISBN; }
}
