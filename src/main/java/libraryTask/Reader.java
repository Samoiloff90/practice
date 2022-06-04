package libraryTask;

import java.util.ArrayList;
import java.util.List;

public class Reader {
    private String name;
    private int libraryCardNumber;
    private String faculty;
    private String birthday;
    private String phone;

    public Reader(String name, int libraryCardNumber, String faculty, String birthday, String phone) {
        this.name = name;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
        this.birthday = birthday;
        this.phone = phone;
    }

    public void takeBook(int books) {
        System.out.println(name + " взял " + books + " книги.");
    }

    public void takeBook(String ... nameBook) {
        String books = "";

        for (int i = 0; i < nameBook.length; i++) {
            if (i != nameBook.length - 1) {
                books += nameBook[i] + ", ";
            } else {
                books += nameBook[i] + ".";
            }
        }
        System.out.println(name + " взял книги: " + books);
    }

    public void takeBook(Book ... bookObjectName) {
        String books = "";
        int counter = 0;

        for (Book b : bookObjectName) {
            if (counter != bookObjectName.length - 1) {
                books += b.getName() + ", ";
                counter++;
            } else {
                books += b.getName() + ".";
            }
        }
        System.out.println(name +  " взял книги: " + books);
    }

//    public void takeBook(Book ... bookObjectAll) {
//        List<Book> booksList = new ArrayList<>();
//
//        for (Book b : bookObjectAll) {
//            booksList.add(b);
//        }
//        System.out.println(name + "взял книги: " + booksList);
//    }

    public void returnBook() {

    }
}