package AplikasiReservasiHotel;

import java.util.Scanner;

public class Admin extends User {

    public Admin(Hotel hotel) {
        super(hotel);
    }

    @Override
    public void menu(Scanner scanner) {
        System.out.println("Menu Admin:");
        System.out.println("1. Cek Ketersediaan Kamar");
        System.out.println("2. Lihat Detail Kamar");
        System.out.print("Pilih: ");
        int pilihan = scanner.nextInt();
        
        switch (pilihan) {
            case 1:
                System.out.print("Masukkan nomor kamar: ");
                int roomNumber = scanner.nextInt();
                if (hotel.isRoomAvailable(roomNumber)) {
                    System.out.println("Kamar tersedia.");
                } else {
                    System.out.println("Kamar sudah dipesan.");
                }
                break;
            case 2:
                hotel.showRoomDetails();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }

    public void menuAdmin(Scanner scanner) {
        this.menu(scanner);
    }
}
