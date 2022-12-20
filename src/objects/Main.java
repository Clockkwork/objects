package objects;
    public class Main {

        public static void main(String[] args) {
            Book warAndPeace = new Book("Война и мир", 1869);
            System.out.println("warAndPeace.title = " + warAndPeace.getTitle());
            System.out.println("warAndPeace.release = " + warAndPeace.getRelease());
            Author fullName = new Author("Лев", "Николаевич", "Толстой");
            System.out.println("fullName.name = " + fullName.getName());
            System.out.println("fullName.surname = " + fullName.getSurname());
            System.out.println("fullName.patronymic = " + fullName.getPatronymic());
            warAndPeace.setRelease(1870);
            System.out.println("warAndPeace.getRelease() = " + warAndPeace.getRelease());
            nameBook name = new nameBook("Муму","Мёртвые души");
            System.out.println("mumu.nameBook1 = " + name.nameBook1);
            System.out.println("name.nameBook2 = " + name.nameBook2);
            authors names = new authors("Тургенев Иван Сергеевич","Гоголь Николай Васильевич" );
            System.out.println("names.author1 = " + names.author1);
            System.out.println("names.author2 = " + names.author2);
        }


    }




