package com.techQuieroClasses;

import java.util.List;
import java.util.ArrayList;

public class Library extends Book{

    private List<Book> listBooks= new ArrayList<Book>();

    public List<Book> getListBooks() { return listBooks; }
    public void setListBooks(List<Book> listBooks) { this.listBooks = listBooks; }

    Book book1= new Book();
    Book book2= new Book();
    Book book3= new Book();
    Book book4= new Book();
    Book book5= new Book();
    Book book6= new Book();
    Book book7= new Book();
    Book book8= new Book();
    Book book9= new Book();
    Book book10= new Book();

    public void listBooksAvailables (){
        book1.setAuthor("CHRISTIAN POSTA" );
        book1.setName("microservices" );
        book1.setPrice(45.98);
        listBooks.add(book1);

        book2.setAuthor("MARKUS EISELE" );
        book2.setName("design patterns" );
        book2.setPrice(72.80);
        listBooks.add(book2);

        book3.setAuthor("RICHARD WARBUTON" );
        book3.setName("programming oriented objects" );
        book3.setPrice(36.72);
        listBooks.add(book3);

        book4.setAuthor("DAVID MERTZ" );
        book4.setName("learning phyton" );
        book4.setPrice(43.27);
        listBooks.add(book4);

        book5.setAuthor("DONALD MINER" );
        book5.setName("big data with hadoop" );
        book5.setPrice(39.60);
        listBooks.add(book5);

        book6.setAuthor("TIM NUGENT" );
        book6.setName("ios with swift" );
        book6.setPrice(24.18);
        listBooks.add(book6);

        book7.setAuthor("KONRAD MALAWSKI" );
        book7.setName("reactive programming" );
        book7.setPrice(58.70);
        listBooks.add(book7);

        book8.setAuthor("BEN EVANS" );
        book8.setName("learning java" );
        book8.setPrice(66.81);
        listBooks.add(book8);

        book9.setAuthor("JOEL FALCOU" );
        book9.setName("c programming" );
        book9.setPrice(67.93);
        listBooks.add(book9);

        book10.setAuthor("DOUG DAVIS" );
        book10.setName("system design" );
        book10.setPrice(55.67);
        listBooks.add(book10);

        for(Book listBooks: listBooks){
            System.out.println(" \n......................................................................");
            System.out.println(listBooks);

        }
    }



    public Book chooseBook(String nameBook){

        for(Book lsBook: listBooks){
            if(lsBook.getName().equals(nameBook.toLowerCase())){
                return lsBook;
            }

        }
        return null;
    }





    public Library(){};

    public Library(String name, String author, Double price, List<Book> listBooks) {
        super(name, author, price);
        this.listBooks = listBooks;
    }
}
