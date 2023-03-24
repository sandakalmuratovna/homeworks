package pro.sky.java.course1.lesson1;

public class Main {
    public static void main(String[] args) {
        Author mukhtarAuezov = new Author("Mukhtar", "Auezov");
        Book abayJoly = new Book("Abay joly", mukhtarAuezov, 1942);
        abayJoly.setPublishingYear(1947);

        Author jackLondon = new Author("Jack", "London");
        Book martinEden = new Book("Martin Eden", jackLondon, 1909);

        System.out.println(abayJoly.getBookName());
        System.out.println(abayJoly.getAuthor().getName() + " " + abayJoly.getAuthor().getSurname());
        System.out.println(abayJoly.getPublishingYear());

        System.out.println(martinEden.getBookName());
        System.out.println(martinEden.getAuthor());
        System.out.println(martinEden.getPublishingYear());

    }
}
