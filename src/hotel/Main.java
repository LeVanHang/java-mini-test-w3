package hotel;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;  // số khách trọ
        Hotel hotel;

        // tạo 1 ArrayList lưu thông tin khách trọ
        ArrayList<Hotel> hotelArrayList = new ArrayList<>();

        System.out.println("Number of guests: ");
        n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            hotel = new Hotel();
            System.out.println("Enter customer infor " + (i+1) + ":");
            hotel.inforinput();
            hotelArrayList.add(hotel);
        }

        // hiển thị danh sách khách trọ
        for (int i = 0; i < hotelArrayList.size(); i++) {
            System.out.println("\nEnter customer infor " + (i+1) + ": ");
            hotelArrayList.get(i).information();
        }

        // tính tiền phòng khi khách hàng trả phòng
        System.out.println("\nEnter the ID of the check-out guest: ");
        String tim = scanner.nextLine();
        for (int i = 0; i < hotelArrayList.size(); i++) {
            if (hotelArrayList.get(i).getPeople().getID().equalsIgnoreCase(tim)) {
                System.out.println("BillPlease = " + hotelArrayList.get(i).billplease());
            }
        }
    }

}