package objects;
    public class Main {

        public static void main(String[] args) {
            Author author = new Author("Лев Николаевич Толстой");
            Author author1 = new Author("Иван Сергеевич Тургенев");
            Book book = new Book("Война и мир", 1863, author);
            Book book1 = new Book("Муму", 1852, author1);
            book.setRelease(1855);
            System.out.println(author);
            System.out.println(author1);
            System.out.println(book);
            System.out.println(book1);

        }


        }






