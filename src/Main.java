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

        public boolean equals(Object other) {
            if (this.getClass() != joanaRoyling.getClass()) {
                return false;
            }
            Author c2 = (Author) joanaRoyling;
            return jefferyDeaver.equals(c2.Author);
        }
    }
}