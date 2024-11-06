import java.util.Objects;

public class Book {
    private String nameBook;
    private int yearPublication;
    private Author author;

    public Book(String nameBook, int yearPublication, Author author) {
        this.nameBook = nameBook;
        this.yearPublication = yearPublication;
        this.author = author;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public int getYearPublication() {
        return this.yearPublication;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setYearPublication(int yearPublication) {
        if (yearPublication < 1950 || yearPublication > 2030) {
            System.out.println("Неверная дата публикации");
            return;
        }
        this.yearPublication = yearPublication;
    }

    @Override
    public String toString() {
        return nameBook + " (" + yearPublication + ") " + author.toString() ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Book book = (Book) o;
        return yearPublication == book.yearPublication && Objects.equals(nameBook, book.nameBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, yearPublication, author);
    }
}
