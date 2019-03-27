package com.techQuieroClasses;


import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println(
                " \n\t    ##### " +
                        " \n\t    #     #  ####   ####  #    #  ####   ####" +
                        " \n\t    #       #    # #      ##  ## #    # #      " +
                        " \n\t    #       #    #  ####  # ## # #    #  ####  " +
                        " \n\t    #       #    #      # #    # #    #      # " +
                        " \n\t    #     # #    # #    # #    # #    # #    # " +
                        " \n\t    #####   ####   ####  #    #  ####   ####   " +
                        " \n\t    # " +
                        " \n\t    #       # #####  #####    ##   #####  #   # " +
                        " \n\t    #       # #    # #    #  #  #  #    #  # # " +
                        " \n\t    #       # #####  #    # #    # #    #   # " +
                        " \n\t    #       # #    # #####  ###### #####    # " +
                        " \n\t    #       # #    # #   #  #    # #   #    # " +
                        " \n\t    ####### # #####  #    # #    # #    #   # "
        );

        System.out.println(
                "\n\t\t      ,..........   ..........," +
                        "\n\t\t  ,..,'          '.'           ',..," +
                        "\n\t\t  ,' ,'            :             ', '," +
                        "\n\t\t  ,' ,'             :              ', ', " +
                        "\n\t\t  ,' ,'              :               ', ', " +
                        "\n\t\t  ,' ,'............., : ,............. ', ', " +
                        "\n\t\t  ,'  '............   '.'   ............ '  ',  " +
                        "\n\t\t   '''''''''''''''''';''';'''''''''''''''''' " +
                        "\n\t\t                      ''' "
        );

        System.out.println("\n\tWELCOME to COSMOS´ LIBRARY. \n-------------------------------------- " +
                "\n   These are our books availables: ");

        Library lib = new Library();
        lib.listBooksAvailables();

        CarShop cshop = new CarShop();

        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n\n\t ***************************************************** \t");
        System.out.println("\n\t *                ADD TO CARSHOP                     * \t\n");
        System.out.println("\t ***************************************************** \t\n");
        System.out.println(">> Please, choose which Book´s name would you like to add at CarShop");
        String addBookToCarShop = sc.nextLine();

        Book book = lib.chooseBook(addBookToCarShop);
        //System.out.println(book);
        cshop.addBookToCar(book);

        Boolean addMoreBooks;

        do {

        System.out.println("Do you want to add more books?   \tTRUE=YES, FALSE=NO");
        addMoreBooks = sc.nextBoolean();

            if (addMoreBooks) {

                System.out.println(">> Please, choose which Book´s name would you like to add at CarShop");
                Scanner sc1= new Scanner(System.in);
                String addBookToBuy = sc1.nextLine();
                Book bk = lib.chooseBook(addBookToBuy);
                cshop.addBookToCar(bk);


            } else {
                System.out.println("\n\n\t\t\t\t ***** NOTE *****");
                cshop.printOrder();
                cshop.totalOrder();

            }

        }while (addMoreBooks) ;










    }
}
