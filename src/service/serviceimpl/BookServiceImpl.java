package service.serviceimpl;

import enums.Gender;
import model.Book;
import service.BookService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookServiceImpl implements BookService {
    @Override
    public List<Book> createBooks(List<Book> books) {
        Scanner scanner = new Scanner(System.in);
        for (Book a  : books) {
        if (a.getAuthor().equals(scanner.nextLine())){
            try {
                System.out.println(a.getAuthor());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }else {
            System.out.println("There id no such author");
        }
        }
        return getAllBooks();
    }

    @Override
    public List<Book> getAllBooks() {
        Book book = null;



        return null;
    }

    @Override
    public List<Book> getBooksByGenre(String genre) {
        Scanner scanner = new Scanner(System.in);
       genre.equals(Gender.valueOf(scanner.nextLine()));
        System.out.println(genre);
        return null;
    }

    @Override
    public Book removeBookById(Long id) {

        Scanner scanner = new Scanner(System.in);
        id.equals(scanner.nextLine());

        return null;
    }

    @Override
    public List<Book> sortBooksByPriceInDescendingOrder() {
        return null;
    }

    @Override
    public List<Book> filterBooksByPublishedYear() {

        return null;
    }

    @Override
    public List<Book> getBookByInitialLetter() {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();
        for (Book a: books) {
            System.out.println(a);
        }
        return books;
    }

    @Override
    public Book maxPriceBook() {
        Book book = null;

        return null;
    }
}
