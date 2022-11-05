package library;


import java.util.Scanner;

public class Book extends Item {


    Scanner input = new Scanner(System.in);

    public Book() {
        super();
        System.out.println("Enter id of Book:");
        this.id = input.nextInt();
        input.nextLine();

        System.out.println("Enter Book Name:");
        this.name = input.nextLine();

        System.out.println("Enter Author Name:");
        this.authorName = input.nextLine();

        System.out.println("Enter Quantity of Books:");
        this.qty = input.nextInt();
        qtyCopy = this.qty;
    }

}
