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
        System.out.println("Enter a function (1-10)");
    }
    public static void getOption() {
        Scanner userInput = new Scanner(System.in);
        int option = userInput.nextInt();
        switch (option) {
            case 5:
        }
    }
}
