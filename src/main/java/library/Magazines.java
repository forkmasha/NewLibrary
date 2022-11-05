package library;

import java.util.Scanner;

public class Magazines implements Serchable,Showable,Upgradebly{
        Magazine allMagazines[] = new Magazine[200];
        public static int count;
        Scanner input = new Scanner(System.in);


        public int compareObjects(Magazine m1, Magazine m2) {
            if (m1.name.equalsIgnoreCase(m2.name)) {
                System.out.println("Magazine of this Name Already Exists.");
                return 0;
            }
            if (m1.id == m2.id) {
                System.out.println("Magazine of this id Already Exists.");
                return 0;
            }
            return 1;
        }

        public void addMagazine(Magazine m) {
            for (int i = 0; i < count; i++) {
                if (this.compareObjects(m, this.allMagazines[i]) == 0)
                    return;
            }
            if (count < 50) {
                allMagazines[count] = m;
                count++;
            } else {
                System.out.println(
                        "No Space to Add More Magazines.");
            }
        }
        @Override
        public void searchById() {
            System.out.println(
                    "\t\t\t\tSEARCH BY ID\n");
            int id;
            System.out.println("Enter id of Magazine:");
            id = input.nextInt();

            int flag = 0;
            System.out.println(
                    "Id\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty");

            for (int i = 0; i < count; i++) {
                if (id == allMagazines[i].id) {
                    System.out.println(
                            allMagazines[i].id + "\t\t"
                                    + allMagazines[i].name + "\t\t"
                                    + allMagazines[i].authorName + "\t\t"
                                    + allMagazines[i].qtyCopy + "\t\t"
                                    + allMagazines[i].qty);
                    flag++;
                    return;
                }
            }
            if (flag == 0)
                System.out.println("No Magazine for id " + id + " Found.");
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
                        allMagazines[i].authorName)) {
                    System.out.println(
                            allMagazines[i].id + "\t\t"
                                    + allMagazines[i].name + "\t\t"
                                    + allMagazines[i].authorName + "\t\t"
                                    + allMagazines[i].qtyCopy + "\t\t"
                                    + allMagazines[i].qty);
                    flag++;
                }
            }
            if (flag == 0)
                System.out.println("No Magazines of " + authorName + " Found.");
        }
        @Override
        public void showAll() {
            System.out.println("\t\t\t\tSHOWING ALL MAGAZINES\n");
            System.out.println(
                    "Id\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty");
            for (int i = 0; i < count; i++) {
                System.out.println(
                        allMagazines[i].id + "\t\t"
                                + allMagazines[i].name + "\t\t"
                                + allMagazines[i].authorName + "\t\t"
                                + allMagazines[i].qtyCopy + "\t\t"
                                + allMagazines[i].qty);
            }
        }
        @Override
        public void upgradeQty()
        {

            System.out.println(
                    "\t\t\t\tUPGRADE QUANTITY OF A MAGAZINE\n");
            System.out.println("Enter id of Magazine");

            int Id = input.nextInt();

            for (int i = 0; i < count; i++) {

                if (Id == allMagazines[i].id) {

                    // Display message
                    System.out.println(
                            "Enter No of Books to be Added:");

                    int addingQty = input.nextInt();
                    allMagazines[i].qty += addingQty;
                    allMagazines[i].qtyCopy += addingQty;

                    return;
                }
            }
        }


    public void displayMenu() {
            System.out.println(
                    "----------------------------------------------------------------------------------------------------------");
            System.out.println("Press 0 to Exit Application.");
            System.out.println("Press 1 to Add new Magazine.");
            System.out.println(
                    "Press 2 to Upgrade Quantity of a Magazine.");
            System.out.println("Press 3 to Search a Magazine.");
            System.out.println("Press 4 to Show All Magazines.");
            System.out.println(
                    "-------------------------------------------------------------------------------------------------------");
        }

    }

