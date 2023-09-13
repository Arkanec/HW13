public class Book {
    private String bookName;
    private int publicationYear;
    private Author author;
    public Book(String bookName, int publicationYear, Author author) {
        this.bookName = bookName;
        this.publicationYear = publicationYear;
        this.author = author;
    }
    public String getBookName() {
        return this.bookName;
    }
    public int getPublicationYear() {
        return this.publicationYear;
    }
    public Author getAuthor() {
        return this.author;
    }
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return  "Название" + " " + this.bookName + " " + "Год публикации" + " " + this.publicationYear;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book that = (Book) o;

        if (bookName != that.bookName) return false;
        return Book.equals(bookName, that.bookName);
    }

    public int hashCode() {
        return java.util.Objects.hash(bookName);
    }
}
