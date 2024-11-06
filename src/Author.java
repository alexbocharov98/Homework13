import java.util.Objects;

public class Author {
    private String firstNameAuthor;
    private String lastNameAuthor;

    public Author(String firstNameAuthor, String lastNameAuthor) {
        this.firstNameAuthor = firstNameAuthor;
        this.lastNameAuthor = lastNameAuthor;
    }

    public String getFirstNameAuthor() {
        return this.firstNameAuthor;
    }

    public String getLastNameAuthor() {
        return this.lastNameAuthor;
    }

    @Override
    public String toString() {
        return firstNameAuthor + " " + lastNameAuthor;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (!(obj instanceof Author)){
            return false;
        }
        Author author = (Author) obj;
        return this.lastNameAuthor.equals(author.lastNameAuthor) && this.firstNameAuthor.equals(author.firstNameAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastNameAuthor, firstNameAuthor);
    }
}


