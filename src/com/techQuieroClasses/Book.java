package com.techQuieroClasses;

public class Book {
    private String name;
    private Double price;
    private String author;


    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }



    @Override
    public String toString() {
        return ">>>>> Libro: \n\t  Name= " + name + ", Author=" + author + ", Price= " +price+ "" ;
    }


    public Book(){};

    public Book(String name, String author, Double price){
        this.name= name;
        this.author= author;
        this.price= price;
    }


}
