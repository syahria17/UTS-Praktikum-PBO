package AplikasiReservasiHotel;

import java.util.Scanner;

public class Customer extends User {
    private String customerName;

    public Customer(Hotel hotel, String customerName) {
        super(hotel);
        this.customerName = customerName;
    }

    @Override
    public void menu(Scanner scanner) {
        boolean running = true;
        while (running) {
            System.out.println("Menu Customer:");
            System.out.println("1. Pesan Kamar");
            System.out.println("2. Cek Ketersediaan Kamar");
            System.out.println("3. Lihat Kamar yang Sudah Dipesan");
            System.out.println("4. Batalkan Pemesanan Kamar");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nomor kamar yang ingin dipesan: ");
                    int roomNumber = scanner.nextInt();
                    if (hotel.bookRoom(roomNumber, customerName)) {
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
                case 3:
                    System.out.println("Daftar kamar yang Anda pesan:");
                    hotel.showBookedRooms();
                    break;
                case 4:
                    System.out.print("Masukkan nomor kamar yang ingin dibatalkan: ");
                    int cancelRoomNumber = scanner.nextInt();
                    if (hotel.cancelBooking(cancelRoomNumber)) {
                        System.out.println("Pemesanan berhasil dibatalkan.");
                    } else {
                        System.out.println("Kamar belum dipesan.");
                    }
                    break;
                case 5:
                    running = false;
                    System.out.println("Keluar dari menu customer.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    public void menuCustomer(Scanner scanner) {
        this.menu(scanner);
    }
}

