package pro.sky.java.course1.lesson1;

public class Book {
    private final String bookName;
    private final Author author;
    private int publishingYear;
    public Book(String bookName, Author author, int publishingYear){
        this.bookName = bookName;
        this.author = author;
        this.publishingYear = publishingYear;
    }

    public String getBookName(){
        return this.bookName;
    }

    public Author getAuthor(){
        return this.author;
    }

    public int getPublishingYear(){
        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear){
        this.publishingYear = publishingYear;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book b2 = (Book) other;
        return bookName.equals(b2.bookName) && author.equals(b2.author);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(bookName, author);
    }

    @Override
    public String toString(){
        return "Name of book: " + this.bookName + ", Author - " + this.author + ", Publishing year: " + this.publishingYear;
    }
}
