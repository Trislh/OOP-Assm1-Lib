package Library;

public class Book extends Item {
    // Data field
    private static String ISBN;
    // Constructor
    public Book(String title, String author, String edition, String publication, String language, String subject, String status, String ISBN, int year, int copy) {
        Item.title = title;
        Item.author = author;
        Item.edition = edition;
        Item.publication = publication;
        Item.year = year;
        Item.language = language;
        Book.ISBN = ISBN;
        Item.subject = subject;
        Item.status = status;
        Item.copy = copy;
    }
    // Get & Set
    public static String getISBN() { return ISBN; }
    public void setISBN(String ISBN) { Book.ISBN = ISBN; }
    // Methods
    public static String displayInfo() {
        return Item.getTitle() + "," +
                Item.getAuthor() + "," +
                Item.getEdition() + "," +
                Item.getPublication() + "," +
                Item.getYear() + "," +
                Item.getLanguage() + "," +
                Book.getISBN() + "," +
                Item.getSubject() + "," +
                Item.getStatus() + "," +
                Item.getCopy() + "\n";
    }
}
