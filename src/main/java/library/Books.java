package library;

import java.util.Scanner;

public class Books implements Serchable, Showable, Upgradebly {
    Book[] allBooks = new Book[200];
    public static int count;
    Scanner input = new Scanner(System.in);


    public int compareObjects(Book b1, Book b2) {
        if (b1.getName().equalsIgnoreCase(b2.getName())) {
            System.out.println("Book of this Name Already Exists.");
            return 0;
        }
        if (b1.getId() == b2.getId()) {
            System.out.println("Book of this id Already Exists.");
            return 0;
        }
        return 1;
    }

    public void addBook(Book b) {
        for (int i = 0; i < count; i++) {
            if (this.compareObjects(b, this.allBooks[i]) == 0)
                return;
        }
        if (count < 50) {
            allBooks[count] = b;
            count++;
        } else {
            System.out.println(
                    "No Space to Add More Books.");
        }
    }

    @Override
    public void searchById() {
        System.out.println(
                "\t\t\t\tSEARCH BY ID\n");
        int id;
        System.out.println("Enter id of Book:");
        id = input.nextInt();

        System.out.println(
                "Id\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty");

        for (int i = 0; i < count; i++) {
            if (id == allBooks[i].getId()) {
                System.out.println(
                        allBooks[i].getId() + "\t\t"
                                + allBooks[i].getName() + "\t\t"
                                + allBooks[i].getAuthorName() + "\t\t"
                                + allBooks[i].getQtyCopy() + "\t\t"
                                + allBooks[i].getQty());
                return;
            }
        }
        System.out.println("No Book for id " + id + " Found.");
    }

    @Override
    public void searchByAuthorName() {
        System.out.println(
                "\t\t\t\tSEARCH BY AUTHOR'S NAME");
        input.nextLine();
        System.out.println("Enter Author Name:");
        String authorName = input.nextLine();
        int flag = 0;
        System.out.println(
                "Id\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty");
        for (int i = 0; i < count; i++) {
            if (authorName.equalsIgnoreCase(
                    allBooks[i].getAuthorName())) {
                System.out.println(
                        allBooks[i].getId() + "\t\t"
                                + allBooks[i].getName() + "\t\t"
                                + allBooks[i].getAuthorName() + "\t\t"
                                + allBooks[i].getQtyCopy() + "\t\t"
                                + allBooks[i].getQty());
                flag++;
            }
        }
        if (flag == 0)
            System.out.println("No Books of " + authorName + " Found.");
    }

    @Override
    public void showAll() {
        System.out.println("\t\t\t\tSHOWING ALL BOOKS\n");
        System.out.println(
                "Id\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty");
        for (int i = 0; i < count; i++) {
            System.out.println(
                    allBooks[i].getId() + "\t\t"
                            + allBooks[i].getName() + "\t\t"
                            + allBooks[i].getAuthorName() + "\t\t"
                            + allBooks[i].getQtyCopy() + "\t\t"
                            + allBooks[i].getQty());
        }
    }

    @Override
    public void upgradeQty() {
        System.out.println(
                "\t\t\t\tUPGRADE QUANTITY OF A BOOK\n");
        System.out.println("Enter Id of Book");
        int id = input.nextInt();
        for (int i = 0; i < count; i++) {
            if (id == allBooks[i].getId()) {
                System.out.println("Enter id of Books to be Added:");

                int addingQty = input.nextInt();
                Book book=allBooks[i];
                book.setQty(book.getQty() + addingQty);
                book.setQtyCopy(book.getQtyCopy() + addingQty);
                return;
            }
        }
    }

    public void displayMenu() {
        System.out.println(
                "----------------------------------------------------------------------------------------------------------");
        System.out.println("Press 0 to Exit Application.");
        System.out.println("Press 1 to Add new Book.");
        System.out.println(
                "Press 2 to Upgrade Quantity of a Book.");
        System.out.println("Press 3 to Search a Book.");
        System.out.println("Press 4 to Show All Books.");
        System.out.println(
                "-------------------------------------------------------------------------------------------------------");
    }

}
