package AplikasiReservasiHotel;

import java.util.Scanner;

public class Customer extends User {

    public Customer(Hotel hotel) {
        super(hotel);
    }

    @Override
    public void menu(Scanner scanner) {
        System.out.println("Menu Customer:");
        System.out.println("1. Pesan Kamar");
        System.out.println("2. Cek Ketersediaan Kamar");
        System.out.print("Pilih: ");
        int pilihan = scanner.nextInt();
        
        switch (pilihan) {
            case 1:
                System.out.print("Masukkan nomor kamar yang ingin dipesan: ");
                int roomNumber = scanner.nextInt();
                System.out.print("Masukkan nama Anda: ");
                String name = scanner.next();
                
                if (hotel.bookRoom(roomNumber, name)) {
                    System.out.println("Kamar berhasil dipesan.");
                } else {
                    System.out.println("Kamar tidak tersedia.");
                }
                break;
            case 2:
                System.out.print("Masukkan nomor kamar: ");
                roomNumber = scanner.nextInt();
                if (hotel.isRoomAvailable(roomNumber)) {
                    System.out.println("Kamar tersedia.");
                } else {
                    System.out.println("Kamar sudah dipesan.");
                }
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }

    public void menuCustomer(Scanner scanner) {
        this.menu(scanner);
    }
}
