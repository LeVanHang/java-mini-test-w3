package hotel;

import java.util.Scanner;

public class Hotel {
    private int boardingDay;
    private String type;
    private double price;
    private People people;
    public Hotel() {
        super();
    }
    public Hotel(int boardingDay, String type, double price, People people) {
        super();
        this.boardingDay = boardingDay;
        this.type = type;
        this.price = price;
        this.people = people;
    }

    public People getPeople() {
        return people;
    }

    public void inforinput() {
        Scanner scanner = new Scanner(System.in);

        // nhập thông tin khách trọ
        people = new People();
        people.inforinput();

        System.out.print("Boarding Day: ");
        boardingDay = Integer.parseInt(scanner.nextLine());
        System.out.print("Room Type: ");
        type = scanner.nextLine();
        System.out.print("Price: ");
        price = scanner.nextDouble();
    }

    public void information() {
        people.information();
        System.out.println("Boarding Day: " + boardingDay);
        System.out.println("Room Type: " + type);
        System.out.println("Price: " + price);
    }
    public double billplease() {
        return boardingDay * price;
    }
}