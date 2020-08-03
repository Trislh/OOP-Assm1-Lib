import java.io.*;
import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;
import Library.*;

public class FunctionList {
    // Data field
    // Constructor
    // Methods
        // Start()
    public static void start(File file_item, File file_member) throws FileNotFoundException {
        Scanner input_item = new Scanner(file_item);
        Scanner input_member = new Scanner(file_member);
        while (input_item.hasNextLine()) {
            String str = input_item.nextLine();
            System.out.println(str);
        }
        while (input_member.hasNextLine()) {
            String str1 = input_member.nextLine();
            System.out.println(str1);
        }
        input_item.close();
        input_member.close();
    }
        // Search Item
    public static void searchItem(File file_name, String searchText) throws FileNotFoundException {
        Scanner file_read = new Scanner(file_name);
        String data = file_read.nextLine();
        data.toLowerCase();
        // Check if it is a right data
        if (data.contains(searchText)) {
            System.out.println(data);
        }
    }
        // Add new Item
    public static void addNewItem(File file_name) throws IOException {
        Scanner file_reader = new Scanner(file_name); // Read file
        Scanner input = new Scanner(System.in);
        // Take info
        System.out.print("Which item do you want to add (Book/Journal/DVD)?");
        String user_option = input.nextLine();
        System.out.println("Enter item info:");
        System.out.print("Title: "); // title
        String title = input.nextLine();
        System.out.print("Author: "); // author
        String author = input.nextLine();
        System.out.print("Edition: "); //edition
        String edition = input.nextLine();
        System.out.print("Publication: "); //publication
        String publication = input.nextLine();
        System.out.print("Language: ");// language
        String language = input.nextLine();
        System.out.print("Subject: "); //subject
        String subject = input.nextLine();
        System.out.print("Status: "); //status
        String status = input.nextLine();
        System.out.print("Year: "); //year
        int year = input.nextInt();
        System.out.print("Copy: "); //copy
        int copy = input.nextInt();


        // Set info into object
        if (user_option.contains("Book")) { // Set Book
            System.out.print("ISBN (10-13 digits): ");
            String ISBN = input.next();
            Item new_item = new Book(title,author,edition,publication,language,subject,status,ISBN,year,copy);
        } else if (user_option.contains("Journal")) { // Set Journal
            System.out.print("ISSN (8 digits): ");
            String ISSN = input.next();
            Item new_item = new Journal(title,author,edition,publication,year,language,subject,status,copy,ISSN);
        } else { // Set DVD
            Item new_item = new Item(title,author,edition,publication,language,status,subject,year,copy);
        }

        // Write the info into file
        try (FileWriter file_writer = new FileWriter(file_name,true)) {
            if(user_option.contains("Book")) {
                file_writer.write(Book.displayInfo());
            } else if (user_option.contains("Journal")) {
                file_writer.write(Journal.displayInfo());
            } else {
                file_writer.write(Item.displayInfo());
            }
            System.out.println("Write down successfully");
        }
    }
        // Update Item
    public static void updateItem() {}
        // Search Member
    public static void searchMember(File file_name, int ID) throws FileNotFoundException {
        Scanner file_writer = new Scanner(file_name);
        String str = String.valueOf(ID);
        while (file_writer.hasNext()) {
            String data = file_writer.nextLine();
            data.toLowerCase();
            if (data.contains(str)) {
                System.out.println(data);
            } else {
                System.out.println("404. Not found");
            }
        }
    }
        // Register new Member
    public static void registerNewMember(File file_name) throws IOException {
        Scanner input = new Scanner(System.in);
        Scanner file_read = new Scanner(file_name);
        // Take input
        System.out.println("Enter member info: ");
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Email: ");
        String email = input.nextLine();
        System.out.print("Address: ");
        String address = input.nextLine();
        System.out.print("Expired date: ");
        String expireDate = input.nextLine();
        System.out.print("Status: ");
        String status = input.nextLine();
        System.out.print("Phone: ");
        String phone = input.nextLine();
        System.out.print("ID: ");
        int id = input.nextInt();

        // Create and write into object
        Member new_mem = new Member(id,name,phone,email,address,status);
        // Write into text
        try (FileWriter file_writer = new FileWriter(file_name,true))
        {
            file_writer.write(Member.displayInfo());
            System.out.println("Written successful");
        }

    }
        // Update Member info
    public static void updateMember() {}
        // Borrow Item list
    public static void borrowItem() {}
        // Return Item - update info
    public static void returnItem() {}
        // Save Data
    public static void saveData() {}
}
