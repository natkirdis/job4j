package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book kolobok = new Book("Kolobok", 12);
        Book lordOfTheRings = new Book("Lord of the rings", 1125);
        Book greenMile = new Book("The Green Mile", 342);
        Book cleanCode = new Book("Clean code", 659);

        Book[] books = new Book[4];

        books[0] = kolobok;
        books[1] = lordOfTheRings;
        books[2] = greenMile;
        books[3] = cleanCode;

        System.out.println("All books:");
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " - " + book.getPages() + " pages");
        }

        System.out.println("Replace books with indexes 0 and 3:");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;

        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " - " + book.getPages() + " pages");
        }

        System.out.println("Books with name \"Clean code\":");
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            if (book.getName().equals("Clean code")) {
                System.out.println(book.getName() + " - " + book.getPages() + " pages");
            }
        }
    }
}
