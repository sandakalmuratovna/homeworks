package pro.sky.java.course1.lesson1;

public class Book {
    private String bookName;
    private Author author;
    private int publishingYear;
    public Book(String bookName, Author author, int publishingYear){
        this.bookName = bookName;
        this.author = author;
        this.publishingYear = publishingYear;
    }

    public String getBookName(){
        return this.bookName;
    }

    public String getAuthor(){
        return this.author.getName() + " " + this.author.getSurname();
    }

    public int getPublishingYear(){
        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear){
        this.publishingYear = publishingYear;
    }
}
