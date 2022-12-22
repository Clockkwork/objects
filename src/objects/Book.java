package objects;
public class Book {
    private final String title;
    private  int release;
    private final Author author;


    public Book(String title, int release,Author author) {
        this.title = title;
        this.release = release;
        this.author = author;
    }


    public String getTitle() {
        return this.title;
    }

    public int getRelease() {
        return this.release;
    }

    public void setRelease(int release) {
        this.release = release;
    }

    @Override
    public String toString() {
        return "Название: " + title + " год публикации: " + release + " автор " + author;
    }
}





