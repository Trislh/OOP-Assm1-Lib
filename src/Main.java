/*
    RMIT University Vietnam
    Course: INTE2512 Object-Oriented Programming
    Semeter: 2020B
    Assessment: Assignment 1
    Author: Luu Huynh Tri
    ID: 3462315
    Created date:
    Last modified:
    Acknowledgement:
        https://www.java67.com/2015/07/how-to-append-text-to-existing-file-in-java-example.html
        https://www.w3schools.com/java/java_files_read.asp
 */
import Library.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.rmi.server.ExportException;

public class Main {
    public static void main(String[] args) throws IOException {
        /* Create a file */
        try {
            File item = new File("Item.txt");
            java.io.File member = new java.io.File("Member.txt");
            if (item.exists()) {
                System.out.println(item.getName() + " exists");
            }
            if (member.exists()) {
                System.out.println(member.getName() + " exists");
            }
            //FunctionList.addNewItem(item);
            FunctionList.registerNewMember(member);
            //FunctionList.start(item,member);
            //FunctionList.searchItem(item,"vietnamese");
            //FunctionList.searchMember(member,149753);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
