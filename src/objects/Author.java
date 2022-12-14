package objects;


public class Author {
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

