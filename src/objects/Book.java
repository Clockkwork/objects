package objects;

public class Book {
    private String title;

    private int release;

    public  Book (String title,int release){
        this.title = title;
        this.release = release;
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
    }
class Author {
    private String name;

    private String surname;

    private String patronymic;


    public Author(String name, String surname, String patronymic) {

        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getPatronymic() {
        return this.patronymic;
    }

}






