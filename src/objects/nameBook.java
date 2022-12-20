package objects;

public class nameBook {
    String nameBook1;
    String nameBook2;

    public  nameBook (String nameBook1,String nameBook2){
        this.nameBook1 = nameBook1;
        this.nameBook2 = nameBook2;
    }
    public String getNameBook1() {
        return this.nameBook1;
    }

    public String getNameBook2() {
        return this.nameBook2;
    }

}
class authors {
    String author1;
    String author2;

    public authors(String author1, String author2) {

        this.author1 = author1;
        this.author2 = author2;

    }

    public String getNameAuhtor1() {
        return this.author1;
    }

    public String getNameAuhtor2() {
        return this.author2;
    }
}
