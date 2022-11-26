package library;

import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(
                "********************Welcome to My Library!********************");
        System.out.println(
                "				 Select From The Following Options:			 ");
        System.out.println(
                "**********************************************************************");
        while (true) {
            System.out.println("Print 1 to choose Book Menu");
            System.out.println("Print 2 to choose Magazine Menu");
            Books object = new Books();
            Magazines obj = new Magazines();


            int choiceBook;
            int choiceMag;
            int searchChoice;
            int number;

            number = input.nextInt();
            switch (number) {
                case 1:
                    object.displayMenu();
                    choiceBook = input.nextInt();
                    switch (choiceBook) {
                        case 1 -> {
                            Book b = new Book();
                            object.addBook(b);
                        }
                        case 2 -> object.upgradeQty();
                        case 3 -> {
                            System.out.println(
                                    " press 1 to Search with Book id.");
                            System.out.println(
                                    " Press 2 to Search with Book's Author Name.");
                            searchChoice = input.nextInt();
                            switch (searchChoice) {
                                case 1 -> object.searchById();
                                case 2 -> object.searchByAuthorName();
                            }
                        }
                        case 4 -> object.showAll();
                        case 0 -> {
                            System.out.println("GoodBye");
                            break;
                        }
                        default -> System.out.println("ENTER BETWEEN 0 TO 8.");
                    }
                    break;

                case 2:
                    obj.displayMenu();
                    choiceMag = input.nextInt();
                    switch (choiceMag) {
                        case 1 -> {
                            Magazine m = new Magazine();
                            obj.addMagazine(m);
                        }
                        case 2 -> obj.upgradeQty();
                        case 3 -> {
                            System.out.println(
                                    " press 1 to Search with Magazine id.");
                            System.out.println(
                                    " Press 2 to Search with Magazine's Author Name.");
                            searchChoice = input.nextInt();
                            switch (searchChoice) {
                                case 1 -> obj.searchById();
                                case 2 -> obj.searchByAuthorName();
                            }
                        }
                        case 4 -> obj.showAll();
                        case 0 -> {
                            System.out.println("GoodBye");
                            break;
                        }
                    }
                default:
                    System.out.println("Have a nice day");
            }


        }

    }

}

