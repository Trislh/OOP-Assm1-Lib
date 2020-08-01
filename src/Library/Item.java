package Library;

public class Item {
    // Data field
    protected String title, author, edition, publication;
    protected int year, copy;
    protected String language, subject, status;
    // Constructor
    // Get & Set
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getEdition() { return edition; }
    public String getPublication() { return publication; }
    public int getYear() { return year; }
    public int getCopy() { return copy; }
    public String getLanguage() { return language; }
    public String getStatus() { return status; }
    public String getSubject() { return subject; }

    public void setAuthor(String author) { this.author = author; }
    public void setCopy(int copy) { this.copy = copy; }
    public void setEdition(String edition) { this.edition = edition; }
    public void setLanguage(String language) { this.language = language; }
    public void setPublication(String publication) { this.publication = publication; }
    public void setStatus(String status) { this.status = status; }
    public void setSubject(String subject) { this.subject = subject; }
    public void setTitle(String title) { this.title = title; }
    public void setYear(int year) { this.year = year; }
}
