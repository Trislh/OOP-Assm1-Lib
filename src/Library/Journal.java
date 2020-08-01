package Library;

public class Journal extends Item {
    // Data  field
    private long ISSN;
    // Constructor
    Journal(String title, String author, String edition, String publication, int year, String language, String subject, String status, int copy, long ISSN) {
        this.title = title;
        this.author = author;
        this.edition = edition;
        this.publication = publication;
        this.year = year;
        this.language = language;
        this.subject = subject;
        this.status = status;
        this.copy = copy;
        this.ISSN = ISSN;
    }
    // Get & Set
    public long getISSN() {return ISSN ;}
    public void setISSN(long ISSN) { this.ISSN = ISSN; }
}
