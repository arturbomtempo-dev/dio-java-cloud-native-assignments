package model;

import java.util.ArrayList;
import java.util.List;

public class BooksCatalog {

    private List<Book> booksList;

    public BooksCatalog() {
        this.booksList = new ArrayList<>();
    }

    public void addBook(String title, String author, int publicationYear) {
        booksList.add(new Book(title, author, publicationYear));
    }

    public List<Book> searchByAuthor(String author) {
        List<Book> booksByAuthor = new ArrayList<>();

        if (!booksList.isEmpty()) {
            for (Book book : booksList) {
                if (book.getAuthor().equalsIgnoreCase(author)) {
                    booksByAuthor.add(book);
                }
            }

            return booksByAuthor;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public List<Book> searchByYearRange(int initialYear, int finalYear) {
        List<Book> booksByYearRange = new ArrayList<>();

        if (!booksList.isEmpty()) {
            for (Book book : booksList) {
                if (book.getPublicationYear() >= initialYear && book.getPublicationYear() <= finalYear) {
                    booksByYearRange.add(book);
                }
            }

            return booksByYearRange;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public Book searchByTitle(String title) {
        Book bookByTitle = null;

        if (!booksList.isEmpty()) {
            for (Book book : booksList) {
                if (book.getTitle().equalsIgnoreCase(title)) {
                    bookByTitle = book;
                    break;
                }
            }

            return bookByTitle;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }
}
