package library;


import java.util.Scanner;

public class Book extends Item {


    Scanner input = new Scanner(System.in);

    public Book() {
        super();
        System.out.println("Enter id of Book:");
        this.setId(input.nextInt());
        input.nextLine();

        System.out.println("Enter Book Name:");
        this.setName(input.nextLine());

        System.out.println("Enter Author Name:");
        this.setAuthorName(input.nextLine());

        System.out.println("Enter Quantity of Books:");
        this.setQty(input.nextInt());
        setQtyCopy(this.getQty());
    }

}
