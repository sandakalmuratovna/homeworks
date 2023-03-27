package pro.sky.java.course1.lesson1;

public class Main {
    public static void main(String[] args) {
        Author mukhtarAuezov = new Author("Mukhtar", "Auezov");
        Book abayJoly = new Book("Abay joly", mukhtarAuezov, 1942);

        Author jackLondon = new Author("Jack", "London");
        Book martinEden = new Book("Martin Eden", jackLondon, 1909);
        Book abayJoly2 = new Book("Abay joly", mukhtarAuezov, 1947);

        System.out.println(martinEden.getAuthor());
        System.out.println(martinEden.getBookName());
        System.out.println(martinEden.getPublishingYear());


    }
}
