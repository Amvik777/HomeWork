public class Book {

    private String name;
    private String authorName;
    private String text;

    public Book() {
    }

    public Book(String name, String authorName, String text) {
        this.name = name;
        this.authorName = authorName;
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}