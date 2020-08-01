import java.util.Date;
import java.io.*;

public class Member {
    // Data field
    private int ID;
    private String name, phone, email, address;
    // Constructor
    Member(int ID, String name, String phone, String email, String address) {
        this.ID = ID;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }
    // Set
    public void setID(int ID) {this.ID = ID;}
    public void setName(String name) {this.name = name;}
    public void setPhone(String phone) {this.phone = phone;}
    public void setEmail (String email) {this.email = email;}
    public void setAddress (String address) {this.address = address;}
    // Get
    public int getID() {return ID;}
    public String getName() {return name;}
    public String getPhone() {return phone;}
    public String getEmail() {return email;}
    public String getAddress() {return address;}
    // Methods
    public void displayInfo() {
        System.out.print("ID: " + getID() + "\n" +
                "Name:" +getName()+"\n" +
                "Phone"+getPhone()+"\n" +
                "Email"+getEmail()+"\n" +
                "Address"+getAddress());
    }

}
