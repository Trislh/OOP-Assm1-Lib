package Library;
public class DVD extends Item {
    // Constructor
    public DVD(String title, String author, String publication, int year, String language, String subject, String status, int copy) {
        Item.title = title;
        Item.author = author;
        Item.publication = publication;
        Item.year = year;
        Item.language = language;
        Item.subject = subject;
        Item.status = status;
        Item.copy = copy;
    }
}
