package com.techQuieroClasses;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.*;

public class CarShop extends Library{

    private List<Book> listBooksToBuy= new ArrayList<Book>();
    private Double total;
    private Library lib= new Library();

    public List<Book> getListBooksToBuy() { return listBooksToBuy; }
    public void setListBooksToBuy(List<Book> listBooksToBuy) { this.listBooksToBuy = listBooksToBuy; }

    public Double getTotal() { return total; }
    public void setTotal(Double total) { this.total = total; }

    public Library getLib() { return lib; }
    public void setLib(Library lib) { this.lib = lib; }



    public void addBookToCar(Book bk){
        //System.out.println(bk + " en el carrito");
        if(bk != null){
            //System.out.println("\nBook added succesfuly.");
            listBooksToBuy.add(bk);

        } else {
            out.println("\nThis book can not be added.");
        }
    }


    public void printOrder(){

        for(Book order: listBooksToBuy){
            out.println( "\nAuthor:  " + order.getAuthor() +
                    "\tName:  " + order.getName() +  "\tPrice:  " + order.getPrice() + "\n");

            out.println("............................................");

        }
    }

    public Double totalOrder(){
        Double sum= 0.0;

        for(int i= 0; i<listBooksToBuy.size();  i++) {

            out.println("\t ------>  \t\tTotal: " + sum+= lib.getPrice());
            out.println("\n\t\t\tTHANK YOU TO BUY WITH US.");
            out.println();
        }
    }


    @Override
    public String toString() {
        return super.toString();
    }

    public CarShop(){};
}
