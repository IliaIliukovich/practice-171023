package lesson20240325;

import java.io.*;
import java.util.Arrays;
import java.util.Objects;

public class Book implements Serializable {
    private String title;
    private Author author;
    private double price;
    private int bookCount;

    public Book(String title, Author author, double price, int bookCount) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.bookCount = bookCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(price, book.price) == 0 && bookCount == book.bookCount && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", bookCount=" + bookCount +
                '}';
    }


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Author rawling = new Author("Rawling", "");
        Book book1 = new Book("Harry Potter", rawling, 20, 10);
        Book book2 = new Book("Tom Sawyer", new Author("Mark Twain", ""), 15, 40);
        System.out.println(book1);

        // serialization
        byte[] byteArray;
        try (
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        ) {
            objectOutputStream.writeObject(book1);
            byteArray = byteArrayOutputStream.toByteArray();
            System.out.println(Arrays.toString(byteArray));
        }

        // deserialization
        try (
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        ) {
            Book bookFromBytes = (Book) objectInputStream.readObject();
            System.out.println(bookFromBytes);
            System.out.println(book1 == bookFromBytes);
            System.out.println(book1.equals(bookFromBytes));
            Author authorFromBytes = bookFromBytes.author;
            System.out.println(authorFromBytes);
            System.out.println(rawling == authorFromBytes);
            System.out.println(rawling.equals(authorFromBytes));
        }
    }
}
