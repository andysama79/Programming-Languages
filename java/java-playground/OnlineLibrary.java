package com.company;
import java.util.Scanner;

class Library{
    String[] books;
    int no_of_books;
    Library(){
        this.books=new String[100];
        this.no_of_books=0;
    }
    void addBook(String book){
        this.books[no_of_books]=book;
        no_of_books++;
        System.out.println(book+" has been successfully added");
    }
    void showAvailableBooks(){
        System.out.println("The available books are:");
        for(String book: this.books){
            if(book==null){
                continue;
            }
            System.out.println(book);
        }
    }

    void issueBook(String book){
        for(int i=0;i<this.books.length;i++){
            if(this.books[i]!=null) {
                if (this.books[i].equalsIgnoreCase(book)) {
                    System.out.println(book + " has been issued ");
                    this.books[i] = null;
                    return;
                }
            }
        }
        System.out.println(book+" does not exist");
    }
    void returnBook(String book){
       addBook(book);
        // for(int i=0;i<this.books.length;i++){
       //     if(this.books[i]==null){
       //         this.books[i]=book;
       //         System.out.println(book+" has been successfully returned");
       //     }
       // }
    }

}

public class OnlineLibrary {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        Library obj=new Library();
        System.out.print("1)Add Book\t");
        System.out.print("2)Show Books\t");
        System.out.print("3)Issue Book\t");
        System.out.print("4)Return Book\t");
        System.out.print("5)Exit\t");
        System.out.println();
        boolean process=true;
        do{
            //String book;
            int choice=scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 1 -> {
                    System.out.println("Add Book \nEnter book name:");
                    String book = scan.nextLine();
                    obj.addBook(book);
                    //System.out.println("5)Exit\t");
                }
                case 2 -> //System.out.println("5)Exit\t");
                        obj.showAvailableBooks();
                case 3 -> {
                    System.out.println("Issue Book\n Enter book name:");
                    String book = scan.nextLine();
                    obj.issueBook(book);
                    //System.out.println("5)Exit\t");
                }
                case 4 -> {
                    System.out.println("Return Book \nEnter book name:");
                    String book = scan.nextLine();
                    obj.returnBook(book);
                    //System.out.println("5)Exit\t");
                }
                case 5 -> {
                    process = false;
                    System.out.println("Process ended");
                }
            }

        }while(process);
        scan.close();
    }

}
