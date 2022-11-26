package library;

import java.util.Scanner;

public class Magazine extends Item{
    Scanner input = new Scanner(System.in);

    public Magazine() {
        super();
        System.out.println("Enter id of Magazine:");
        this.setId(input.nextInt());
        input.nextLine();

        System.out.println("Enter Magazine Name:");
        this.setName(input.nextLine());

        System.out.println("Enter Author Name:");
        this.setAuthorName(input.nextLine());

        System.out.println("Enter Quantity of Magazine:");
        this.setQty(input.nextInt());
        setQtyCopy(this.getQty());
    }
}
