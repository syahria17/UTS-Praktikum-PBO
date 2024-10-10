package AplikasiReservasiHotel;

import java.util.Scanner;

public class Admin extends User {

    public Admin(Hotel hotel) {
        super(hotel);
    }

    @Override
    public void menu(Scanner scanner) {
        boolean running = true;
        while (running) {
            System.out.println("Menu Admin:");
            System.out.println("1. Cek Ketersediaan Kamar");
            System.out.println("2. Lihat Detail Kamar");
            System.out.println("3. Tambah Kamar");
            System.out.println("4. Lihat Kamar yang Sudah Dipesan");
            System.out.println("5. Batalkan Pemesanan Kamar");
            System.out.println("6. Keluar");
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
                case 3:
                    System.out.print("Masukkan nomor kamar baru: ");
                    int newRoomNumber = scanner.nextInt();
                    hotel.addRoom(newRoomNumber);
                    System.out.println("Kamar berhasil ditambahkan.");
                    break;
                case 4:
                    hotel.showBookedRooms();
                    break;
                case 5:
                    System.out.print("Masukkan nomor kamar yang ingin dibatalkan: ");
                    int cancelRoomNumber = scanner.nextInt();
                    if (hotel.cancelBooking(cancelRoomNumber)) {
                        System.out.println("Pemesanan dibatalkan.");
                    } else {
                        System.out.println("Kamar belum dipesan.");
                    }
                    break;
                case 6:
                    running = false;
                    System.out.println("Keluar dari menu admin.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    public void menuAdmin(Scanner scanner) {
        this.menu(scanner);
    }
}
