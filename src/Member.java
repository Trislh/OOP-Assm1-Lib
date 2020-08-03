import java.util.Date;
import java.io.*;

public class Member {
    // Data field
    private static int ID;
    private static String name, phone, email, address, status;
    // Constructor
    Member(int ID, String name, String phone, String email, String address, String status) {
        this.ID = ID;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.status = status;
    }
    // Set
    public void setID(int ID) {this.ID = ID;}
    public void setName(String name) {this.name = name;}
    public void setPhone(String phone) {this.phone = phone;}
    public void setEmail (String email) {this.email = email;}
    public void setAddress (String address) {this.address = address;}
    public void setStatus (String status) {this.status = status;}
    // Get
    public static int getID() {return ID;}
    public static String getName() {return name;}
    public static String getPhone() {return phone;}
    public static String getEmail() {return email;}
    public static String getAddress() {return address;}
    public static String getStatus() {return status;}
    // Methods
    public static String displayInfo() {
        return  getID() + "," +
                getName()+"," +
                getPhone()+"," +
                getEmail()+"," +
                getAddress() + "," +
                getStatus() + "\n";
    }

}
