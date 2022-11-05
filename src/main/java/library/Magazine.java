package library;

import java.util.Scanner;

public class Magazine extends Item{
    Scanner input = new Scanner(System.in);

    public Magazine() {
        super();
        System.out.println("Enter id of Magazine:");
        this.id = input.nextInt();
        input.nextLine();

        System.out.println("Enter Magazine Name:");
        this.name = input.nextLine();

        System.out.println("Enter Author Name:");
        this.authorName = input.nextLine();

        System.out.println("Enter Quantity of Magazine:");
        this.qty = input.nextInt();
        qtyCopy = this.qty;
    }
}
