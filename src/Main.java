public class Main {
    public static void main(String[] args) {
        Author jefferyDeaver = new Author("Джеффри", "Дивер");
        System.out.println(jefferyDeaver.getFirstName());
        System.out.println(jefferyDeaver.getLastName());

        Book extinct = new Book("Исчезнувший",  2010, jefferyDeaver);
        System.out.println(extinct.getBookName());
        System.out.println(extinct.getPublicationYear());
        System.out.println(extinct.getAuthor());

        extinct.setPublicationYear(2012);
        System.out.println(extinct.getPublicationYear() );

        System.out.println(jefferyDeaver);
        System.out.println(extinct);

        Author joanaRoyling = new Author("Джоана", "Роулинг");

        Book harryPotter = new Book("Гарри Поттер", 2002, joanaRoyling);

        //false
        System.out.println(harryPotter == extinct);
        //true
        System.out.println(harryPotter.equals(extinct));
        Author author1 = new Author("Джоана", "Роулинг");
        Author copyAuthor1 = new Author("Джеффри", "Дивер");
        System.out.println("author1.equals(copyAuthor1) returns " + author1.equals(copyAuthor1));

        }
    }