package Library;

public class Journal extends Item {
    private static String ISSN;
    // Data  field
    // Constructor
    public Journal(String title, String author, String edition, String publication, int year, String language, String subject, String status, int copy, String ISSN) {
        Item.title = title;
        Item.author = author;
        Item.edition = edition;
        Item.publication = publication;
        Item.year = year;
        Item.language = language;
        Item.subject = subject;
        Item.status = status;
        Item.copy = copy;
        Journal.ISSN = ISSN;
    }
    // Get & Set
    public static String getISSN() {return ISSN ;}
    public void setISSN(String ISSN) { Journal.ISSN = ISSN; }

    // Methods
    public static String displayInfo() {
        return Item.getTitle() + "," +
                Item.getAuthor() + "," +
                Item.getEdition() + "," +
                Item.getPublication() + "," +
                Item.getYear() + "," +
                Item.getLanguage() + "," +
                Item.getSubject() + "," +
                Item.getCopy() + "," +
                Journal.getISSN() + "," +
                Item.getStatus() + "\n";
    }
}
