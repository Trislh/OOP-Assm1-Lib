package Library;

public class Item {
    protected static String title;
    protected static String author;
    protected static String edition;
    protected static String publication;
    protected static int year;
    protected static int copy;
    protected static String language;
    protected static String subject;
    protected static String status;
    private static long ISSN;
    private static String ISBN;

    // Data field

    // Constructor
    public Item() {}
    public Item(String title, String author, String edition, String publication, String language, String status, String subject, int year, int copy) {
        Item.title = title;
        Item.author = author;
        Item.edition = edition;
        Item.publication = publication;
        Item.language = language;
        Item.status = status;
        Item.subject = subject;
        Item.year = year;
        Item.copy = copy;
    }
    // Get & Set
    public static String getTitle() { return title; }
    public static String getAuthor() { return author; }
    public static String getEdition() { return edition; }
    public static String getPublication() { return publication; }
    public static String getLanguage() { return language; }
    public static String getStatus() { return status; }
    public static String getSubject() { return subject; }
    public static int getYear() { return year; }
    public static int getCopy() { return copy; }

    public void setAuthor(String author) { this.author = author; }
    public void setCopy(int copy) { this.copy = copy; }
    public void setEdition(String edition) { this.edition = edition; }
    public void setLanguage(String language) { this.language = language; }
    public void setPublication(String publication) { this.publication = publication; }
    public void setStatus(String status) { this.status = status; }
    public void setSubject(String subject) { this.subject = subject; }
    public void setTitle(String title) { this.title = title; }
    public void setYear(int year) { this.year = year; }

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
                Item.getStatus() + "\n";
    }
}
