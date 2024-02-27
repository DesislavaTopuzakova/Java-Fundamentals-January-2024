package articles_02;

public class Article {

    // 1. Fields
    private String title;
    private String content;
    private String author;

    // 2. Constructor
    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    // 3. Methods
    public void edit(String newContent) {
        this.content = newContent;
    }

    public void changeAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    public void rename(String newTitle) {
        this.title = newTitle;
    }

    public String toString() {
        return String.format("%s - %s: %s", this.title, this.content, this.author);
    }
}
