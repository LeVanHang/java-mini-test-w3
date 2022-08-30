package hotel;

import java.util.Scanner;

public class People {
    private String fullname;
    private String ID;
    private String address;

    public People() {
        super();
    }

    public People(String fullname, String address, String ID) {
        super();
        this.fullname = fullname;
        this.address = address;
        this.ID = ID;
        
    }

    public String getID() {
        return ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }

    public void inforinput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        fullname = scanner.nextLine();
        System.out.print("Enter your address: ");
        address = scanner.nextLine();
        System.out.print("Enter ID: ");
        ID = scanner.nextLine();
    }

    public void information() {
        System.out.println("Enter customer name: " + fullname);
        System.out.println("Enter your address: " + address);
        System.out.println("Enter ID: " + ID);
    }
}