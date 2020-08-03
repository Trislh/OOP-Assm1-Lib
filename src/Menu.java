import java.io.File;
import java.util.Scanner;

public class Menu {
    public static void displayMenu() {
        System.out.println("Welcome to QuickLib!!!");
        System.out.println("*********************************************");
        System.out.println("1. Search items by keywords" + "\n" +
                "2. Add new item" + "\n" +
                "3. Update item information" + "\n" +
                "4. Search members by keywords" + "\n" +
                "5. Register new member" + "\n" +
                "6. Update member information" + "\n" +
                "7. Borrow items" + "\n" +
                "8. Return items" + "\n" +
                "9. Save data" + "\n" +
                "10. Quit");
        System.out.println("*********************************************");
    }
    public static void getOption() {
        System.out.print("Enter a function (1-10)");
        Scanner userInput = new Scanner(System.in);
        int option = userInput.nextInt();
        switch (option) {
            case 1 -> System.out.println("1st option");
            case 2 -> System.out.println("2nd option");
            case 3 -> {
                System.out.println("Add Item");
            }

            case 4 -> System.out.println("4th option");
            case 5 -> System.out.println("5th option");
            case 6 -> System.out.println("6th option");
            case 7 -> System.out.println("7th option");
            case 8 -> System.out.println("8th option");
            case 9 -> System.out.println("9th option");
            case 10 -> System.out.println("10th option");
            default -> System.out.println("Invalid option. Please enter again.");
        }
    }
}
