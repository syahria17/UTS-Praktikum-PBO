package AplikasiReservasiHotel;

import java.util.Scanner;

public class HotelReservationApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selamat datang di Aplikasi Reservasi Hotel Mercure");

        // Membuat instance hotel
        Hotel hotel = new Hotel("Hotel Mewah", 10);

        // Memeriksa level akses
        System.out.println("Pilih akses: 1. Admin  2. Customer");
        int role = scanner.nextInt();

        if (role == 1) {
            Admin admin = new Admin(hotel);
            admin.menuAdmin(scanner);
        } else if (role == 2) {
            System.out.print("Masukkan nama customer: ");
            String customerName = scanner.next();
            Customer customer = new Customer(hotel, customerName);
            customer.menuCustomer(scanner);
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}
