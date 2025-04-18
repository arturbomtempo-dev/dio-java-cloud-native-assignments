package app;

import model.BooksCatalog;

public class Application {

    public static void main(String[] args) {
        BooksCatalog booksCatalog = new BooksCatalog();

        booksCatalog.addBook("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
        booksCatalog.addBook("Java Guia do Programador", "Peter Jandl Junior", 2021);
        booksCatalog.addBook("Código Limpo", "Robert C. Martin", 2009);
        booksCatalog.addBook("O Codificador Limpo", "Robert C. Martin", 2012);

        System.out.println(booksCatalog.searchByAuthor("Robert C. Martin"));

        System.out.println(booksCatalog.searchByAuthor("Autor Inexistente"));

        System.out.println(booksCatalog.searchByYearRange(2010, 2022));

        System.out.println(booksCatalog.searchByYearRange(2025, 2030));

        System.out.println(booksCatalog.searchByTitle("Java Guia do Programador"));

        System.out.println(booksCatalog.searchByTitle("Título Inexistente"));
    }
}
