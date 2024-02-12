public class Book {
    private String title;
    private String author;
    private Genre genre;
    private String ISBN;
    private int ageRestriction;

    public Book(String title, String author, Genre genre, String ISBN, int ageRestriction){
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.ISBN = ISBN;
        this.ageRestriction = ageRestriction;
    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
    public Genre getGenre() {
        return genre;
    }
    public String getISBN() {
        return ISBN;
    }

    @Override
    public String toString(){
        return  title;
    }

}
